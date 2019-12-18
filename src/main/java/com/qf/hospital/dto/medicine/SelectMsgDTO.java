package com.qf.hospital.dto.medicine;

import lombok.Data;

/**
 * @program: hospital
 * @description: 药品模块条件搜索DTO
 * @author: duanshen
 * @create: 2019-12-18 22:13
 **/
@Data
public class SelectMsgDTO {

    /**
     * 药品ID
     */
    private Integer medicineId;

    /**
     * 药品名称
     */
    private String medicineName;

}
