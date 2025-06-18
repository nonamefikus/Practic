package com.example.pr.ma;

import com.example.pr.dia.Diagnosis;
import java.util.ArrayList;
import java.util.List;

public class DiagnosisManager {
    private List<Diagnosis> diagnoses = new ArrayList<>();
    private int nextId = 1;

    public void addDiagnosis(Diagnosis diagnosis) {
        diagnosis.setId(nextId++);
        diagnoses.add(diagnosis);
    }

    public List<Diagnosis> searchByPatientName(String patientName) {
        List<Diagnosis> result = new ArrayList<>();
        for (Diagnosis d : diagnoses) {
            if (d.getPatientName().equalsIgnoreCase(patientName)) {
                result.add(d);
            }
        }
        return result;
    }
}
