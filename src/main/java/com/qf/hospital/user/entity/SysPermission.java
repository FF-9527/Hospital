package com.qf.hospital.user.entity;

import lombok.Data;

@Data
public class SysPermission {
    private Long id;

    private String name;

    private String type;

    private String url;

    private String percode;

    private Long parentid;

    private String parentids;

    private String sortstring;

    private String available;

}