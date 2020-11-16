package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NovoTecnicoController {

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    void btSalvaAction(ActionEvent event) {

    }

    @FXML
    void btVoltarAction(ActionEvent event) {
        Main.changeScreen("Main");
    }

}