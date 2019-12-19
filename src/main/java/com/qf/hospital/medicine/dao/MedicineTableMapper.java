package com.qf.hospital.medicine.dao;

import com.qf.hospital.common.vo.SelectMedicineTableMsg;
import com.qf.hospital.medicine.entity.Medicine;


import java.util.List;

public interface MedicineTableMapper {

    List<SelectMedicineTableMsg> select ();

    List<Medicine> selectMedicine();

}