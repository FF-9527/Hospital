package com.qf.hospital.user.entity;

import lombok.Data;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-16 22:09
 */
@Data
public class Reserve {
    private int id;
    private int patient_id;
    private int doctor_id;
    private int scheduling_id;
}
