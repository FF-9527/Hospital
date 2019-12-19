package com.qf.hospital.common.vo;

import lombok.Data;

/**
 * @program: Hospital
 * @description: 查询病人药品信息返回信息类
 * @author: duanshen
 * @create: 2019-12-19 21:25
 **/
@Data
public class SelectMedicineTableMsg {

    /**
     * 病例ID
     */
    int caseId;

    /**
     * 患者姓名
     */
    String name;

    /**
     * 药品名称
     */
    String medicineNames;

    /**
     * 就诊时间
     */
    String caseDate;

}
