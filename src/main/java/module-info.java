module com.example.dc_deskapp {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    //requires com.almasb.fxgl.all;

    opens com.example.dc_deskapp to javafx.fxml;
    exports com.example.dc_deskapp;
    exports Controllers;
    opens Controllers to javafx.fxml;
}