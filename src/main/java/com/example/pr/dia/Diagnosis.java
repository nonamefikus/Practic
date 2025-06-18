

package com.example.pr.dia;
import java.time.LocalDate;

public class Diagnosis {
    private int id;
    private String patientName;
    private String doctorName;
    private String diseaseName;
    private String treatmentName;
    private LocalDate diagnosisDate;

    public Diagnosis(int id, String patientName, String doctorName, String diseaseName, String treatmentName, LocalDate diagnosisDate) {
        this.id = id;
        this.patientName = patientName;
        this.doctorName = doctorName;
        this.diseaseName = diseaseName;
        this.treatmentName = treatmentName;
        this.diagnosisDate = diagnosisDate;
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {  // Добавьте этот метод
        this.id = id;
    }

    public String getPatientName() {
        return patientName;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public String getDiseaseName() {
        return diseaseName;
    }

    public String getTreatmentName() {
        return treatmentName;
    }

    public LocalDate getDiagnosisDate() {
        return diagnosisDate;
    }
}
