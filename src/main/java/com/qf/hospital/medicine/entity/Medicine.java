package com.qf.hospital.medicine.entity;

import lombok.Data;

@Data
public class Medicine {
    private Integer medicineId;

    private String medicineName;

    private Float medicinePrice;

    private String medicineInfo;


}