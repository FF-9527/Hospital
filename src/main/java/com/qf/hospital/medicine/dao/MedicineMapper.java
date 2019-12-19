package com.qf.hospital.medicine.dao;

import com.qf.hospital.dto.medicine.SelectMsgDTO;
import com.qf.hospital.medicine.entity.Medicine;

import java.util.List;

public interface MedicineMapper {

    /**
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    int insert(Medicine medicine);

    /**
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    int delete(int[] medicineIds);

    /**
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    int update(Medicine medicine);

    /**
     * 查询药物,按照条件查询，(药品ID，药品名称)，返回集合
     *
     * @return 查询结果
     */
    List<Medicine> select(SelectMsgDTO selectMsgDTO);
}