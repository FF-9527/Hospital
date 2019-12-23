package com.qf.hospital.doctor.dao;

import com.qf.hospital.doctor.entity.PatientCase;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Options;
import org.apache.ibatis.annotations.Select;

public interface PatientCaseMapper {
    int insert(PatientCase record);

    int insertSelective(PatientCase record);

    @Insert("insert into patient_case(patient_id, case_id) values(#{patientId}, #{caseId})")
    //@Options(useGeneratedKeys = true, keyProperty = "patientId")
    int insertPatientCase(PatientCase patientCase);
}