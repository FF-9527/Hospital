package com.qf.hospital.doctor.dao;

import com.qf.hospital.common.vo.Doctor.DoctorReserve;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Select;

import java.util.List;

/**
 * @author: FF
 * @date: 2019/12/18 19:34
 */
public interface ReserveMapper {

    @Select("select \treserve.patient_id,\n" +
            "\tpatient_info.NAME,\n" +
            "\tconsulting.consulting_id,\n" +
            "\tconsulting.consulting_name,\n" +
            "\tdoctor.doctor_id,\n" +
            "\tdoctor.doctor_name from reserve LEFT JOIN  patient_info on reserve.patient_id = patient_info.patient_id LEFT JOIN \n" +
            "doctor on reserve.doctor_id = doctor.doctor_id LEFT JOIN\n" +
            "consulting ON doctor.consulting_id = consulting.consulting_id")
    List<DoctorReserve> queryReserve();

    @Delete("delete from reserve where patient_id=#{id}")
    int delete(int id);
}
