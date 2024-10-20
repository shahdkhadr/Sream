module com.example.learning {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.learning to javafx.fxml;
    exports com.example.learning;
}