package com.qf.hospital.doctor.service;

import com.qf.hospital.common.vo.R;

import com.qf.hospital.doctor.entity.CaseTable;
import com.qf.hospital.doctor.entity.PatientCase;
import com.qf.hospital.dto.doctor.DoctorCaseDto;

/**
 * @author: FF
 * @date: 2019/12/18 15:50
 */
public interface DoctorCaseService {
    R queryPatientById(int patientId);


    R insertCase(int id, CaseTable caseTable);


    R insertPatientCase(PatientCase patientCase);
}
