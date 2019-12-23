package com.qf.hospital.doctor.controller;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.service.impl.DoctorServiceImpl;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 20:59
 */
@Api(value = "查询是否有指定药品", tags = "查询是否有指定药品")
@RestController
public class DoctorMedicineController {
    @Autowired
    private DoctorServiceImpl doctorService;


    @ApiOperation(value = "查询药品", notes = "查询药品")
    @GetMapping("/api/doctor/member/queryMedicine.do")
    public R queryMedicine(String name) {
        String name1 = "%" + name + "%";
        return doctorService.queryMedicine(name1);
    }

    @ApiOperation(value = "插入药品到药单", notes = "插入药品到药单")
    public R insert() {
        return R.ok();
    }


}
