module org.example.lab1sheevam {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens org.example.lab1sheevam to javafx.fxml;
    exports org.example.lab1sheevam;
}