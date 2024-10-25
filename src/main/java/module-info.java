module com.example.jfx1 {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.jfx1 to javafx.fxml;
    exports com.example.jfx1;
}