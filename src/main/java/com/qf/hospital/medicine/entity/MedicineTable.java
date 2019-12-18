package com.qf.hospital.medicine.entity;

import lombok.Data;

/**
 * 药单表对应实体类
 */
@Data
public class MedicineTable {

    /**
     * 病例ID
     */
    private Integer caseId;

    /**
     * 药品ID
     */
    private Integer medicineId;

    /**
     * 药单状态
     */
    private Integer orderStatus;

}