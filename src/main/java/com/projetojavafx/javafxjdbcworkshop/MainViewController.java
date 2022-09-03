package com.projetojavafx.javafxjdbcworkshop;

import com.projetojavafx.javafxjdbcworkshop.gui.util.Alerts;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.MenuItem;
import javafx.scene.control.ScrollPane;
import javafx.scene.layout.VBox;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class MainViewController implements Initializable {
    @FXML
    private MenuItem menuItemSeller;
    @FXML
    private MenuItem menuItemDepartment;
    @FXML
    private MenuItem menuItemAbout;

    @FXML
    public void onMenuItemSellerAction() {
        System.out.println("Seller action");
    }

    @FXML
    public void onMenuItemDepartmentAction() {
        loadView("DepartmentList.fxml");
    }

    @FXML
    public void onMenuItemAboutAction() {
        loadView("About.fxml");
    }


    @Override
    public synchronized void initialize(URL url, ResourceBundle resourceBundle) {
    }

    private void loadView(String absoluteName) {
        try {
            FXMLLoader loader = new FXMLLoader(getClass().getResource(absoluteName));
            VBox newVBox = loader.load();

            Scene mainScene = Main.getMainScene();

            // Pegando o conteudo que está no VBOX do MainView.fxml
            VBox mainVBox = (VBox) ((ScrollPane) mainScene.getRoot()).getContent();

            // Separando o Menu Principal
            Node mainMenu = mainVBox.getChildren().get(0);

            // Limpando a Tela removendo todos os conteudos do VBox
            mainVBox.getChildren().clear();

            // Incluindo o menu novamente e a tela about
            mainVBox.getChildren().add(mainMenu);
            mainVBox.getChildren().addAll(newVBox.getChildren());
        } catch (IOException e) {
            Alerts.showAlert("IO Exception", "Error loading view", e.getMessage(), Alert.AlertType.ERROR);
        }
    }
}
