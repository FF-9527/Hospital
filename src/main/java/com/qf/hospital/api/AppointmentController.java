package com.qf.hospital.api;

import com.qf.hospital.Appointment.service.AppointmentService;
import com.qf.hospital.common.vo.R;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@Api(value = "实现预约相关操作", tags = "实现预约相关操作")
@RestController("/Appointment")
public class AppointmentController {

    @Autowired
    private AppointmentService appointmentService;

    @ApiOperation(value = "实现查询所有科室", notes = "实现查询所有科室")
    @GetMapping("/queryAllConsulting.do")
    public R queryAllConsulting() {
        return appointmentService.queryAllConsulting();
    }
}
