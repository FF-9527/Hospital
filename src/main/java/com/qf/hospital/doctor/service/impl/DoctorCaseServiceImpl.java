package com.qf.hospital.doctor.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.dao.CaseMapper;
import com.qf.hospital.doctor.service.DoctorCaseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 15:51
 */
@Service
public class DoctorCaseServiceImpl implements DoctorCaseService {

    @Autowired
    private CaseMapper caseMapper;
    @Override
    public R queryPatientById(int patientId) {
        return R.ok(caseMapper.queryPatientById(patientId));
    }
}
