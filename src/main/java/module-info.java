module com.example.workshop7 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;

    opens com.example.workshop7 to javafx.fxml;
    exports com.example.workshop7;
}