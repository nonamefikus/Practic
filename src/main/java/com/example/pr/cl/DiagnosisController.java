
package com.example.pr.cl;
import com.example.pr.dia.Diagnosis;
import com.example.pr.ma.DiagnosisManager;
import javafx.fxml.FXML;
import javafx.scene.control.*;
import java.time.LocalDate;

public class DiagnosisController {
    @FXML
    private TextField patientNameField;
    @FXML
    private TextField doctorNameField;
    @FXML
    private TextField diseaseNameField;
    @FXML
    private TextField treatmentNameField;
    @FXML
    private DatePicker diagnosisDatePicker;
    @FXML
    private Button addButton;
    @FXML
    private Button searchButton;
    @FXML
    private ListView<String> resultsListView;

    private DiagnosisManager diagnosisManager = new DiagnosisManager();

    @FXML
    public void initialize() {
        addButton.setOnAction(event -> addDiagnosis());
        searchButton.setOnAction(event -> searchDiagnoses());
    }

    private void addDiagnosis() {
        String patientName = patientNameField.getText();
        String doctorName = doctorNameField.getText();
        String diseaseName = diseaseNameField.getText();
        String treatmentName = treatmentNameField.getText();
        LocalDate diagnosisDate = diagnosisDatePicker.getValue();

        Diagnosis diagnosis = new Diagnosis(0, patientName, doctorName, diseaseName, treatmentName, diagnosisDate);
        diagnosisManager.addDiagnosis(diagnosis);

        clearFields();
    }

    private void searchDiagnoses() {
        String patientName = patientNameField.getText();
        resultsListView.getItems().clear();

        for (Diagnosis d : diagnosisManager.searchByPatientName(patientName)) {
            resultsListView.getItems().add(d.getPatientName() + " - " + d.getDiseaseName());
        }
    }

    private void clearFields() {
        patientNameField.clear();
        doctorNameField.clear();
        diseaseNameField.clear();
        treatmentNameField.clear();
        diagnosisDatePicker.setValue(null);
    }
}
