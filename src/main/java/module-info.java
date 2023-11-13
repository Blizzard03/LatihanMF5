module com.mariq.rasyid.latihanmf5 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.base;

    opens com.mariq.rasyid.latihanmf5 to javafx.fxml;
    exports com.mariq.rasyid.latihanmf5;
}
