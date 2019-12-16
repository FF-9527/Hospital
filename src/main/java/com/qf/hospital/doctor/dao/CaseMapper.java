package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.Case;

public interface CaseMapper {
    int insert(Case record);

    int insertSelective(Case record);
}