package com.projetojavafx.javafxjdbcworkshop.gui.util;

import com.projetojavafx.javafxjdbcworkshop.model.dao.DaoFactory;
import com.projetojavafx.javafxjdbcworkshop.model.dao.DepartmentDao;
import com.projetojavafx.javafxjdbcworkshop.model.entities.Department;
import javafx.event.ActionEvent;
import javafx.scene.Node;
import javafx.stage.Stage;

public class Utils {

    public static Stage currentStage(ActionEvent event) {
        return (Stage) ((Node) event.getSource()).getScene().getWindow();
    }

    public static Integer tryParseToInt(String str) {
        try {
            return Integer.parseInt(str);
        } catch (NumberFormatException e) {
            return null;
        }
    }
}
