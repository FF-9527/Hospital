package com.qf.hospital.medicine.service.impl;

import com.qf.hospital.common.vo.R;
import com.qf.hospital.dto.medicine.SelectMsgDTO;
import com.qf.hospital.medicine.dao.MedicineMapper;
import com.qf.hospital.medicine.dao.MedicineTableMapper;
import com.qf.hospital.medicine.entity.Medicine;
import com.qf.hospital.medicine.service.MedicineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

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
     * 添加药物,按照属性添加，均不能为空（药品名称，药品描述，价值）
     *
     * @return 执行状态
     */
    @Override
    public R add(Medicine medicine) {

        int insert = medicineMapper.insert(medicine);

        return R.ok(insert);
    }

    @Override
    public R delete(int[] medicineIds) {

        int delete = medicineMapper.delete(medicineIds);

        return R.ok(delete);
    }

    @Override
    public R update(Medicine medicine) {

        int update = medicineMapper.update(medicine);

        return R.ok(update);
    }

    /**
     * 查询药物,按照条件查询，(药品ID，药品名称)，返回集合
     *
     * @return 返回数据对象
     */
    @Override
    public R select(SelectMsgDTO selectMsgDTO) {

        List<Medicine> select = medicineMapper.select(selectMsgDTO);

        System.out.println(select);

        return R.ok(select);

    }
}
