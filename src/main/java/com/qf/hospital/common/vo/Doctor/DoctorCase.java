package com.qf.hospital.common.vo.Doctor;

import lombok.Data;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 16:01
 */
@Data
public class DoctorCase {
    private int case_id;
    private String disease_description;
    private String name;
    private int age;
    private int sex;
    private String date;
}
