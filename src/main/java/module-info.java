module com.example.javafxproject {
    requires javafx.controls;
    requires javafx.fxml;

    opens com.example.javafxproject to javafx.fxml;
    exports com.example.javafxproject;
}