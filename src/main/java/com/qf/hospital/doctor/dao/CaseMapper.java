package com.qf.hospital.doctor.dao;

import com.qf.hospital.common.vo.DoctorCase;
import com.qf.hospital.doctor.entity.Case;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CaseMapper {
    int insert(Case record);

    int insertSelective(Case record);

    /*根据就诊人的id查询其病例*/
    @Select("select c.case_id, c.disease_description, patient_info.name, patient_info.age, patient_info.sex, c.date from case_table as c left join patient_case on c.case_id=patient_case.case_id left JOIN\n" +
            "patient_info on patient_case.patient_id = patient_info.patient_id\n" +
            "\n" +
            "where patient_info.patient_id = #{id}")
    List<DoctorCase> queryPatientById(int patientId);
}