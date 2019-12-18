package com.qf.hospital.Appointment.service;


import com.qf.hospital.common.vo.R;

import java.util.Date;

public interface AppointmentService {
    R queryAllConsulting();

    R queryDoctorByTime(int consultingId, String week);
}
