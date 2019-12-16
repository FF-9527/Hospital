package com.qf.hospital.user.dao;

import com.qf.hospital.user.entity.SysPermission;

public interface SysPermissionMapper {
    int insert(SysPermission record);

    int insertSelective(SysPermission record);
}