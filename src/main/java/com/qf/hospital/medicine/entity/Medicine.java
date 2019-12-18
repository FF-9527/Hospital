package com.qf.hospital.medicine.entity;

import lombok.Data;

/**
 * 药品表对应实体类
 */
@Data
public class Medicine {

    /**
     * 药品ID
     */
    private Integer medicineId;

    /**
     * 药品名称
     */
    private String medicineName;

    /**
     * 药品价格
     */
    private Float medicinePrice;

    /**
     * 药品描述
     */
    private String medicineInfo;


}