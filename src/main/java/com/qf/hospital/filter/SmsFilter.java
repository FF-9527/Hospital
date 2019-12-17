package com.qf.hospital.filter;

import com.alibaba.fastjson.JSON;
import com.qf.hospital.common.vo.R;
import com.qf.hospital.util.JedisUtil;
import org.springframework.web.context.WebApplicationContext;
import org.springframework.web.context.support.WebApplicationContextUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @program: CarSys
 * @description:
 * @author: FF
 * @create: 2019-12-11 16:04
 */
public class SmsFilter implements Filter {

    private JedisUtil jedisUtil;
    @Override
    public void init(FilterConfig filterConfig) throws ServletException {
        ServletContext servletContext = filterConfig.getServletContext();
        WebApplicationContext applicationContext = WebApplicationContextUtils.getWebApplicationContext(servletContext);
        jedisUtil = (JedisUtil)applicationContext.getBean("createJU");
    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        //实现短信发送的频率校验
        HttpServletRequest request = (HttpServletRequest) servletRequest;

            //1、校验当前请求的是不是发送短信
            if (request.getRequestURI().endsWith("/sms/sendcode.do")) {
                //2、频率校验
                //不允许发送短信
                String phone1 = jedisUtil.getStr("phone1" + request.getParameter("phone"));
                String phone2 = jedisUtil.getStr("phone2" + request.getParameter("phone"));
                String phone3 = jedisUtil.getStr("phone3" + request.getParameter("phone"));

                //1分钟1条
                //            //	小时5条
                //            //	1天10条
                if (phone1 == null && phone2 == null && phone3 == null) {
                    filterChain.doFilter(servletRequest, servletResponse);
                } else if (phone1 != null || Integer.parseInt(phone2) > 4 || Integer.parseInt(phone3) > 9) {
                    HttpServletResponse response = (HttpServletResponse) servletResponse;
                    response.getWriter().println(JSON.toJSONString(R.fail("已达上限")));
                    System.out.println("已达上限");
                } else {
                    filterChain.doFilter(servletRequest, servletResponse);
                }
            } else {
                filterChain.doFilter(servletRequest, servletResponse);
            }
        }
}
