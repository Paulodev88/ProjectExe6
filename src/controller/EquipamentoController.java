package controller;

import application.Main;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.util.Callback;
import model.entities.Equipamento;


import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class EquipamentoController implements Initializable {

    @FXML
    private Label txtTag;

    @FXML
    private Label txtNome;

    @FXML
    private Label txtTensao;

    @FXML
    private Label txtPotencia;

    @FXML
    private Label txtCorrente;

    @FXML
    private Label txtUnidade;

    @FXML
    private ComboBox<Equipamento> comboBoxEquipamento;

    private ObservableList<Equipamento> observableList;

    @FXML
    private void onComboBoxEquipamento(){
        Equipamento equipamento = comboBoxEquipamento.getSelectionModel().getSelectedItem();
        txtTag.setText(String.valueOf(equipamento.getTag()));
        txtNome.setText(equipamento.getNome());
        txtTensao.setText(equipamento.getTensao());
        txtCorrente.setText(equipamento.getCorrente());
        txtPotencia.setText(equipamento.getPotencia());
        txtUnidade.setText(equipamento.getUnidade());
    };

    @FXML
    void btNovoEquipamentoAction(ActionEvent event) {
        Main.changeScreen("NovoEquipamento");
    }

    @FXML
    void btVoltarAction(ActionEvent event) {
        Main.changeScreen("Main");
    }

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {

        List<Equipamento> list = new ArrayList<>();
        list.add(new Equipamento(1,"Ar Condicionado", "220","9000BTU","20A","CETAF"));

        observableList = FXCollections.observableArrayList(list);
        comboBoxEquipamento.setItems(observableList);

        Callback<ListView<Equipamento>, ListCell<Equipamento>> factory = lv -> new ListCell<Equipamento>() {
            @Override
            protected void updateItem(Equipamento item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getNome());
            }
        };
        comboBoxEquipamento.setCellFactory(factory);
        comboBoxEquipamento.setButtonCell(factory.call(null));

    }
}
