package com.qf.hospital.medicine.service.impl;

import com.qf.hospital.medicine.dao.MedicineDao;
import com.qf.hospital.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @program: hospital
 * @description: 药品管理模块业务逻辑层接口实现类（Service Implements）
 * @author: duanshen
 * @create: 2019-12-15 10:48
 **/
@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineDao medicineDao;

}
