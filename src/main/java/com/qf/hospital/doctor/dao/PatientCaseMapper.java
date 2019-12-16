package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.PatientCase;

public interface PatientCaseMapper {
    int insert(PatientCase record);

    int insertSelective(PatientCase record);
}