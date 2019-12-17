package com.qf.hospital.doctor.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.service.DoctorService;
import org.springframework.stereotype.Service;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-17 17:03
 */
@Service
public class DoctorServiceImpl implements DoctorService {
    @Override
    public R add() {

        System.out.println("service方法");
        return R.Ok();
    }
}
