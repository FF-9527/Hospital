package com.qf.hospital.user.dao;

import com.qf.hospital.user.entity.SysRole;

public interface SysRoleMapper {
    int insert(SysRole record);

    int insertSelective(SysRole record);
}