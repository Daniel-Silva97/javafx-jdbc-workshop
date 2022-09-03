module com.projetojavafx.javafxjdbcworkshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;
    requires java.sql;

    opens com.projetojavafx.javafxjdbcworkshop to javafx.fxml;
    exports com.projetojavafx.javafxjdbcworkshop;
    exports com.projetojavafx.javafxjdbcworkshop.model.entities;
    exports com.projetojavafx.javafxjdbcworkshop.model.services;
}