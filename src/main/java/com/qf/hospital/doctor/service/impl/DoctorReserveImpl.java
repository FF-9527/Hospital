package com.qf.hospital.doctor.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.dao.ReserveMapper;
import com.qf.hospital.doctor.service.DoctorReserveService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 19:51
 */
@Service
public class DoctorReserveImpl implements DoctorReserveService {

    @Autowired
    private ReserveMapper reserveMapper;
    @Override
    public R query() {
        return R.ok(reserveMapper.queryReserve());
    }

    /*根据就诊人删除预约表的信息*/
    @Override
    public R delete(int id) {
        return R.ok(reserveMapper.delete(id));
    }
}
