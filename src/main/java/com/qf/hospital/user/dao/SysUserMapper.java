package com.qf.hospital.user.dao;

import com.qf.hospital.user.entity.SysUser;

public interface SysUserMapper {
    int insert(SysUser record);

    int insertSelective(SysUser record);
}