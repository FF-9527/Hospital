package com.qf.hospital.medicine.dao;

import com.qf.hospital.medicine.entity.Medicine;

public interface MedicineMapper {

    /**
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    int insert(Medicine medicine);

    int delete(int[] medicineIds);

    int update(Medicine medicine);
}