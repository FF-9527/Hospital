package com.qf.hospital.user.entity;

import lombok.Data;

@Data
public class SysUser {
    private String id;

    private String usercode;

    private String username;

    private String password;

    private String salt;

    private String locked;

}