package com.qf.hospital.doctor.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.dao.DoctorMapper;
import com.qf.hospital.doctor.service.DoctorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-17 17:03
 */
@Service
public class DoctorServiceImpl implements DoctorService {

    @Autowired
    private DoctorMapper doctorMapper;
    @Override
    public R queryMedicine(String name) {
        return R.ok(doctorMapper.queryMedicine(name));
    }
}
