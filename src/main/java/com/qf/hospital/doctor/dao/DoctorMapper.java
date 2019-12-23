package com.qf.hospital.doctor.dao;

import com.qf.hospital.common.vo.Doctor.DoctorMedicine;
import com.qf.hospital.doctor.entity.Doctor;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface DoctorMapper {
    int insert(Doctor record);

    @Select("SELECT\n" +
            "\tm.medicine_id,\n" +
            "\tm.medicine_name \n" +
            "FROM\n" +
            "\tmedicine as m  \n" +
            "WHERE\n" +
            "\tm.medicine_name like #{name}")
    List<DoctorMedicine> queryMedicine(String name);
}