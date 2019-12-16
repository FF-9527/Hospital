package com.qf.hospital.patient.entity;

import lombok.Data;

@Data
public class PatientInfo {
    private Integer patientId;

    private Integer userId;

    private String idNum;

    private String name;

    private Integer sex;

    private Integer age;

    private String address;

}