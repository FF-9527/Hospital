package com.qf.hospital.medicine.service;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.medicine.entity.Medicine;

/**
 * @program: hospital
 * @description: 药品管理模块业务逻辑层（Service）
 * @author: duanshen
 * @create: 2019-12-15 10:43
 **/
public interface MedicineService {

    /**
     * 添加药物,按照属性添加，均不能为空（药品ID，药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    R adds(Medicine medicine);

}
