package com.qf.hospital.user.dao;

import com.qf.hospital.user.entity.SysRolePermission;

public interface SysRolePermissionMapper {
    int insert(SysRolePermission record);

    int insertSelective(SysRolePermission record);
}