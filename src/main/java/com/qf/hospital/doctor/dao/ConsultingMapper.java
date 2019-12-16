package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.Consulting;

public interface ConsultingMapper {
    int insert(Consulting record);

    int insertSelective(Consulting record);
}