package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class NovoEquipamentoController {

    @FXML
    private TextField txtTag;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtTensao;

    @FXML
    private TextField txtPotencia;

    @FXML
    private TextField txtCorrente;

    @FXML
    private TextField txtUnidade;

    @FXML
    void btSalvarAction(ActionEvent event) {

    }

    @FXML
    void btVoltarAction(ActionEvent event) {
        Main.changeScreen("Main");
    }

}
