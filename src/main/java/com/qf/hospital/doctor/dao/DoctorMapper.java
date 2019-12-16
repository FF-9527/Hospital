package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.Doctor;

public interface DoctorMapper {
    int insert(Doctor record);

    int insertSelective(Doctor record);
}