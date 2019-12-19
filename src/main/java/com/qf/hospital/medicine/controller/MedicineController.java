package com.qf.hospital.medicine.controller;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.dto.medicine.SelectMsgDTO;
import com.qf.hospital.medicine.entity.Medicine;
import com.qf.hospital.medicine.service.MedicineService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.jar.JarOutputStream;

/**
 * @program: hospital
 * @description: 药品管理模块控制层（Controller）
 * @author: duanshen
 * @create: 2019-12-15 10:30
 **/
@Api(value = "实现药品管理的相关操作", tags = "实现药品管理的相关操作")
@RestController
@CrossOrigin(origins = "*", maxAge = 3600)
public class MedicineController {

    @Autowired
    private MedicineService medicineService;

    @ApiOperation(value = "添加药物", notes = "添加药物,按照属性添加，均不能为空(药品名称(唯一)，药品描述，价值（xxxxxx.xx）)")
    @PostMapping("/api/hospital/medicine/add.do")
    public R add(Medicine medicine) {

        System.out.println(medicine);

        return medicineService.add(medicine);
    }

    @ApiOperation(value = "删除药物", notes = "删除药物,按照ID删除，参数为一个整形数组，存放被删除药品ID")
    @PostMapping("/api/hospital/medicine/deletes.do")
    public R deletes(@RequestBody int[] medicineIds) {

        for (int medicineId : medicineIds) {
            System.out.print(medicineId + "   ");
        }

        return medicineService.delete(medicineIds);

    }

    @ApiOperation(value = "修改药物", notes = "修改药物,按照属性修改，(药品ID，药品名称，药品描述，价值（xxxxxx.xx）)，ID不可修改")
    @PostMapping("/api/hospital/medicine/update.do")
    public R update(Medicine medicine) {

        System.out.println(medicine);

        return medicineService.update(medicine);

    }

    @ApiOperation(value = "查询药物", notes = "查询药物,按照条件查询，(药品ID，药品名称)，返回集合")
    @PostMapping("/api/hospital/medicine/select.do")
    public R select(@RequestBody SelectMsgDTO msgDTO) {

        System.out.println(msgDTO.toString());

        R select = medicineService.select(msgDTO);

        System.out.println(select.toString());

        return select;
    }

    @ApiOperation(value = "查询药单", notes = "查询药单,返回集合")
    @PostMapping("/api/hospital/medicine/selectMedicineMsg.do")
    public R selectMedicineMsg() {
        R select = medicineService.selectMedicineMsg();

        System.out.println(select);

        return select;
    }

    @ApiOperation(value = "查询药单详情", notes = "查询药单详情,返回集合")
    @PostMapping("/api/hospital/medicine/selectMedicines.do")
    public R selectMedicines(int caseId) {

        R r = medicineService.selectMedicine(caseId);

        System.out.println(r);

        return r;

    }

}
