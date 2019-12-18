package com.qf.hospital.doctor.controller;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.service.DoctorCaseService;
import com.qf.hospital.doctor.service.DoctorService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-17 17:04
 */

@Api(value = "实现医生的相关操作", tags = "实现医生的相关操作")
@RestController
public class DoctorController {

    @Autowired
    private DoctorCaseService doctorCaseService;

    /*@ApiOperation(value = "校验药品的添加", notes = "校验药品的添加")
    @GetMapping("/api/doctor/member/add.do")
    public R add() {
        return doctorCaseService.add();
    }*/

    @ApiOperation(value = "根据患者id查询病例信息", notes = "根据患者id查询病例信息")
    @GetMapping("/api/doctor/member/query.do")
    public R query(int id) {
        return doctorCaseService.queryPatientById(id);
    }


}