module com.scjfx.scjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.scjfx.scjfx to javafx.fxml;
    exports com.scjfx.scjfx;
}