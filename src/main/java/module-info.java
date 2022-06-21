module com.myfirstjfx.myfirstjfx {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.myfirstjfx.myfirstjfx to javafx.fxml;
    exports com.myfirstjfx.myfirstjfx;
}