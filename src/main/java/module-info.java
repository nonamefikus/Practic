module com.example.pr {
    requires javafx.controls;
    requires javafx.fxml;


    exports com.example.pr.main;
    opens com.example.pr.main to javafx.fxml;
    exports com.example.pr.cl;
    opens com.example.pr.cl to javafx.fxml;
    exports com.example.pr.ma;
    opens com.example.pr.ma to javafx.fxml;
    exports com.example.pr.dia;
    opens com.example.pr.dia to javafx.fxml;
}