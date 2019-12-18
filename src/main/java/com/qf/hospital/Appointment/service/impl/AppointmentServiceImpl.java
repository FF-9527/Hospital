package com.qf.hospital.Appointment.service.impl;

import com.qf.hospital.Appointment.service.AppointmentService;
import com.qf.hospital.common.vo.R;
import com.qf.hospital.doctor.dao.ConsultingMapper;
import com.qf.hospital.doctor.entity.Consulting;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AppointmentServiceImpl implements AppointmentService {

    @Autowired
    private ConsultingMapper consultingMapper;

    @Override
    public R queryAllConsulting() {
        List<Consulting> consultings = consultingMapper.queryAllConsulting();
        return R.ok(consultings);
    }
}
