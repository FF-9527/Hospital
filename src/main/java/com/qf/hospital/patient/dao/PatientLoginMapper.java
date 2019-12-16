package com.qf.hospital.patient.dao;

import com.qf.hospital.patient.entity.PatientLogin;

public interface PatientLoginMapper {
    int insert(PatientLogin record);

    int insertSelective(PatientLogin record);
}