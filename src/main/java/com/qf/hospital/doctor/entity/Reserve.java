package com.qf.hospital.doctor.entity;

import lombok.Data;

/**
 * @program: hospital 患者预约实体类
 * @author: FF
 * @date: 2019-12-18 19:27
 */
@Data
public class Reserve {
    private Integer id;
    private Integer patientId;
    private Integer doctorId;
    private Integer schedulingId;
}
