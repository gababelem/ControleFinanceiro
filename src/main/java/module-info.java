module com.example.controlefinanceiro {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.controlefinanceiro to javafx.fxml;
    exports com.example.controlefinanceiro;
}