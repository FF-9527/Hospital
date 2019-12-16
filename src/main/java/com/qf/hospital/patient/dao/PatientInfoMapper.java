package com.qf.hospital.patient.dao;

import com.qf.hospital.patient.entity.PatientInfo;

public interface PatientInfoMapper {
    int insert(PatientInfo record);

    int insertSelective(PatientInfo record);
}