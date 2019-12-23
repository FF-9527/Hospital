package com.qf.hospital.doctor.dao;

import com.qf.hospital.common.vo.Doctor.DoctorCase;
import com.qf.hospital.doctor.entity.CaseTable;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

import java.util.List;

public interface CaseMapper {
    int insert(CaseTable caseTable);

    int insertSelective(CaseTable caseTable);

    /*根据就诊人的id查询其病例*/
    @Select("select c.case_id, c.disease_description, patient_info.name, patient_info.age, patient_info.sex, c.date from case_table as c left join patient_case on c.case_id=patient_case.case_id left JOIN\n" +
            "patient_info on patient_case.patient_id = patient_info.patient_id\n" +
            "\n" +
            "where patient_info.patient_id = #{id}")
    List<DoctorCase> queryPatientById(int patientId);

    @Insert("insert into case_table(disease_description, doctor_id, consulting_id, date) VALUES(#{diseaseDescription}, #{doctorId}, #{consultingId}, #{date})")
    @Options(useGeneratedKeys = true, keyProperty = "caseId")//添加该行，Case
    int insertCase(CaseTable caseTable);
}