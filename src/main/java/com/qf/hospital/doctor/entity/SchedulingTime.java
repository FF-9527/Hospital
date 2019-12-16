package com.qf.hospital.doctor.entity;

import lombok.Data;

@Data
public class SchedulingTime {
    private Integer schedulingId;

    private String day;

    private Integer time;

}