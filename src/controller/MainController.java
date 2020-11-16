package controller;


import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;

public class MainController {

    @FXML
    void onBtEquipamentoAction(ActionEvent event) {

        Main.changeScreen("Equipamento");

    }

    @FXML
    void onBtSairAction(ActionEvent event) {
        System.exit(0);
    }

    @FXML
    void onBtTecnicoAction(ActionEvent event) {
        Main.changeScreen("Tecnico");
    }

}
