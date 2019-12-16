package com.qf.hospital.medicine.dao;

import com.qf.hospital.medicine.entity.MedicineTable;

public interface MedicineTableMapper {
    int insert(MedicineTable record);

    int insertSelective(MedicineTable record);
}