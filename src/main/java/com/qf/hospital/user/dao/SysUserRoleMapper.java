package com.qf.hospital.user.dao;

import com.qf.hospital.user.entity.SysUserRole;

public interface SysUserRoleMapper {
    int insert(SysUserRole record);

    int insertSelective(SysUserRole record);
}