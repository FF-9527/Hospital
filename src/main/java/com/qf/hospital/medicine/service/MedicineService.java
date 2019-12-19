package com.qf.hospital.medicine.service;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.dto.medicine.SelectMsgDTO;
import com.qf.hospital.medicine.entity.Medicine;

/**
 * @program: hospital
 * @description: 药品管理模块业务逻辑层（Service）
 * @author: duanshen
 * @create: 2019-12-15 10:43
 **/
public interface MedicineService {

    /**
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    R add(Medicine medicine);

    /**
     * 删除药物,按照ID删除，参数为一个整形数组，存放被删除药品ID
     *
     * @return 执行状态
     */
    R delete(int[] medicineIds);

    /**
     * 修改药物,按照属性修改，(药品ID，药品名称，药品描述，价值（xxxxxx.xx）)，ID不可修改
     *
     * @return 执行状态
     */
    R update(Medicine medicine);

    /**
     * 查询药物,按照条件查询，(药品ID，药品名称)，返回集合
     *
     * @return 返回数据对象
     */
    R select(SelectMsgDTO selectMsgDTO);
}
