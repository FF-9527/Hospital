package com.qf.hospital.medicine.controller;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.medicine.service.MedicineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @program: hospital
 * @description: 药品管理模块控制层（Controller）
 * @author: duanshen
 * @create: 2019-12-15 10:30
 **/
@Api(value = "实现药品管理的相关操作", tags = "实现药品管理的相关操作")
@RestController
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @ApiOperation(value = "添加药物", notes = "添加药物,按照属性添加，均不能为空（药品ID，药品名称，药品描述，价值）")
    @PostMapping("/api/hospital/medicine/adds.do")
    public R adds() {
        return null;
    }
}
