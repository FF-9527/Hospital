package com.qf.hospital.doctor.service;

import com.qf.hospital.common.vo.R;

import java.util.List;

/**
 * @author: FF
 * @date: 2019/12/18 19:49
 */
public interface DoctorReserveService {
    R query();

    R delete(int id);
}
