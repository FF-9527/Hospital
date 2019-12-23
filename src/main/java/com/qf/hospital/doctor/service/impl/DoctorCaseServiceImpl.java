package com.qf.hospital.doctor.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.dao.CaseMapper;
import com.qf.hospital.doctor.dao.PatientCaseMapper;
import com.qf.hospital.doctor.entity.CaseTable;
import com.qf.hospital.doctor.entity.PatientCase;
import com.qf.hospital.doctor.service.DoctorCaseService;
import com.qf.hospital.dto.doctor.DoctorCaseDto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.sql.SQLOutput;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 15:51
 */
@Service
public class DoctorCaseServiceImpl implements DoctorCaseService {

    @Autowired
    private CaseMapper caseMapper;

    @Autowired
    private PatientCaseMapper patientCaseMapper;

    @Override
    public R queryPatientById(int patientId) {
        //System.out.println(caseMapper.queryPatientById(patientId));
        return R.ok(caseMapper.queryPatientById(patientId));
    }

    /* 插入病人病例信息 */
    @Transactional
    @Override
    public R insertCase(int id, CaseTable caseTable) {

        System.out.println(caseTable);
        caseMapper.insertCase(caseTable);

        PatientCase patientCase = new PatientCase();
        patientCase.setPatientId(id);

        System.out.println(caseTable.getCaseId());
        patientCase.setCaseId(caseTable.getCaseId());

        return R.ok(insertPatientCase(patientCase));
    }

    /* 插入就诊人病例对应表*/
    @Override
    public R insertPatientCase(PatientCase patientCase) {
        return R.ok(patientCaseMapper.insertPatientCase(patientCase));
    }
}
