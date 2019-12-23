package com.qf.hospital.dto.doctor;

import lombok.Data;

/**
 * @program: hospital
 * @author: FF
 * @date: 2019-12-19 19:34
 */
@Data
public class DoctorCaseDto {
    private Integer patientId;

    private Integer caseId;

    private String diseaseDescription;

    private Integer doctorId;

    private Integer consultingId;

    private String date;
}
