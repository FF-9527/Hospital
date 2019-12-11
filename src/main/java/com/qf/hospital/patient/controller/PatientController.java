package com.qf.hospital.patient.controller;

import com.qf.hospital.patient.entity.Doctor;
import org.springframework.stereotype.Controller;

import java.util.ArrayList;
import java.util.List;

@Controller
public class PatientController {

    public List<Doctor> queryAllDoctor() {
        ArrayList<Doctor> doctors = new ArrayList<>();
        return doctors;
    }
}
