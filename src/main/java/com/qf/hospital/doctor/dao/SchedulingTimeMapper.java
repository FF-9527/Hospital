package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.SchedulingTime;

public interface SchedulingTimeMapper {
    int insert(SchedulingTime record);

    int insertSelective(SchedulingTime record);
}