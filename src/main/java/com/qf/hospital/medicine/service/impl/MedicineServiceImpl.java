package com.qf.hospital.medicine.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.medicine.dao.MedicineMapper;
import com.qf.hospital.medicine.dao.MedicineTableMapper;
import com.qf.hospital.medicine.entity.Medicine;
import com.qf.hospital.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @program: hospital
 * @description: 药品管理模块业务逻辑层接口实现类（Service Implements）
 * @author: duanshen
 * @create: 2019-12-15 10:48
 **/
@Service
public class MedicineServiceImpl implements MedicineService {

    @Autowired
    private MedicineMapper medicineMapper;

    @Autowired
    private MedicineTableMapper tableMapper;

    /**
     * 添加药物,按照属性添加，均不能为空（药品ID，药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    @Override
    public R adds(Medicine medicine) {

        //int insert = medicineMapper.insert(medicine);

        int insert = 123456;

        return R.ok(insert);
    }
}
