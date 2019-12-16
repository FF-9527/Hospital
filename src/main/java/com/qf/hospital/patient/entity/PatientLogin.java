package com.qf.hospital.patient.entity;

import lombok.Data;

@Data
public class PatientLogin {
    private Integer userId;

    private String phoneNum;

    private String password;

}