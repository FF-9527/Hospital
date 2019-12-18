package com.qf.hospital.doctor.entity;

import lombok.Data;

@Data
public class Case {
    private Integer caseId;

    private String diseaseDescription;

    private Integer doctorId;

    private Integer consultingId;

    private String date;

}