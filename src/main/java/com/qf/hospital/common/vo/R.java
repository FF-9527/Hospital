package com.qf.hospital.common.vo;

import com.qf.hospital.common.result.ResultCode;
import lombok.Data;

/**
 * @program: Hospital
 * @author: FF
 * @date: 2019-12-10 22:23
 */
@Data
public class R {
    private int code;
    private String msg;
    private Object data;

    public static R setR(int code, String msg, Object data) {
        R r = new R();
        r.setCode(code);
        r.setMsg(msg);
        r.setData(data);

        return r;
    }

    public static R Ok(Object data){
        return setR(ResultCode.OK.getVal(),"OK",data);
    }
    public static R Ok(){
        return setR(ResultCode.OK.getVal(),"OK",null);
    }
    public static R fail(){
        return setR(ResultCode.ERROR.getVal(),"Error",null);
    }
    public static R fail(String msg){
        return setR(ResultCode.ERROR.getVal(),msg,null);
    }

}
