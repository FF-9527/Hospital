package com.qf.hospital.dto;

import lombok.Data;

/**
 * 值班医生
 */
@Data
public class MedicalPermanenceDto {
    /**
     * 医生姓名
     */
    private String doctor_name;

    /**
     * 医生职称
     */
    private String rank;
}
