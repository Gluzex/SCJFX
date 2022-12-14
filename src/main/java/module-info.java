module com.scjfx.scjfx {
    requires javafx.controls;
    requires javafx.fxml;
    requires org.apache.poi.ooxml;


    opens com.scjfx.scjfx to javafx.fxml;
    exports com.scjfx.scjfx;
}