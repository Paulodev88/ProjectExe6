package controller;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TextField;
import model.entities.Tecnico;
import view.util.Contraints;

import java.net.URL;
import java.util.ResourceBundle;

public class NovoTecnicoController implements Initializable {

    @FXML
    private TextField txtID;

    @FXML
    private TextField txtNome;

    @FXML
    private TextField txtEmail;

    @FXML
    private TextField txtTelefone;

    @FXML
    public void btSalvaAction(ActionEvent event) {
        Tecnico tecnico = new Tecnico();
        tecnico.setId(Integer.parseInt(txtID.getText()));
        tecnico.setName(txtNome.getText());
        tecnico.setEmail(txtEmail.getText());
        tecnico.setTelefone(Integer.parseInt(txtTelefone.getText()));
        System.out.println(tecnico);
    }

    @FXML
    void btVoltarAction(ActionEvent event) {
        Main.changeScreen("Main");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        Contraints.setTextFieldInteger(txtID);
        Contraints.setTextFieldInteger(txtTelefone);

    }
}