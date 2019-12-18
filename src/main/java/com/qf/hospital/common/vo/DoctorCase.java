package com.qf.hospital.common.vo;

import lombok.Data;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-18 16:01
 */
@Data
public class DoctorCase {
    private int id;
    private String description;
    private String name;
    private int age;
    private int sex;
    private String date;
}
