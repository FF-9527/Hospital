package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.Scheduling;

public interface SchedulingMapper {
    int insert(Scheduling record);

    int insertSelective(Scheduling record);
}