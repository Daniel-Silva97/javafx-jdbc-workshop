module com.projetojavafx.javafxjdbcworkshop {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.projetojavafx.javafxjdbcworkshop to javafx.fxml;
    exports com.projetojavafx.javafxjdbcworkshop;
}