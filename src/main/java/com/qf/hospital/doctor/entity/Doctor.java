package com.qf.hospital.doctor.entity;

import lombok.Data;

@Data
public class Doctor {
    private Integer doctorId;

    private Integer consultingId;

    private String doctorName;

    private String education;

    private Integer doctorAge;

    private String rank;

    private String resume;

}