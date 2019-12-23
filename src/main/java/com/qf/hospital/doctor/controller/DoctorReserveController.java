package com.qf.hospital.doctor.controller;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.service.impl.DoctorReserveImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 20:04
 */
@Api(value = "实现医生查询预约病人", tags = "实现医生查询预约病人")
@RestController
public class DoctorReserveController {

    @Autowired
    private DoctorReserveImpl doctorReserve;
    @ApiOperation(value = "查询预约的病人", notes = "查询预约的病人")
    @GetMapping("/api/doctor/member/queryReserve.do")
    public R queryReserve() {
        return doctorReserve.query();
    }

    @ApiOperation(value = "删除预约的病人", notes = "删除预约的病人")
    @GetMapping("/api/doctor/member/deleteReserve.do")
    public R deleteReserve(int id) {
        return doctorReserve.delete(id);
    }

}
