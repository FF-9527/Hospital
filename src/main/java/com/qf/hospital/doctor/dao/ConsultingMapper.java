package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.Consulting;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ConsultingMapper {
    int insert(Consulting record);

    int insertSelective(Consulting record);

    List<Consulting> queryAllConsulting();
}