package com.qf.hospital.common.vo.Doctor;

import lombok.Data;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 19:40
 */
@Data
public class DoctorReserve {
    private Integer patient_id;
    private String name;
    private Integer consulting_id;
    private String consulting_name;
    private Integer doctor_id;
    private String doctor_name;

}
