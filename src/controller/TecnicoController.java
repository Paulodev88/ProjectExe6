package controller;


import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.util.Callback;
import model.entities.Tecnico;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

public class TecnicoController implements Initializable {

    @FXML
    private ComboBox<Tecnico> comboBoxTecnico;

    @FXML
    private Button btAll;

    @FXML
    private Label txtId;

    @FXML
    private Label txtEmail;

    @FXML
    private Label txtTelefone;

    private ObservableList<Tecnico> observableList;

    @FXML
    public void onBtAllAction(){
        for (Tecnico tecnico : comboBoxTecnico.getItems()){
            System.out.println(tecnico);
        }
    }

    @FXML
    public void onBtNovoTecnico(){

    }



    @FXML
    private void onComboBoxTecnico(){
        Tecnico tecnico = comboBoxTecnico.getSelectionModel().getSelectedItem();
        txtId.setText(String.valueOf(tecnico.getId()));
        txtEmail.setText(tecnico.getEmail());
        txtTelefone.setText(String.valueOf(tecnico.getTelefone()));
    };


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        List<Tecnico> list = new ArrayList<>();
        list.add(new Tecnico(1, "Paulo", "paulo.ricaro@fies.org.br", 999999999));

        observableList = FXCollections.observableArrayList(list);
        comboBoxTecnico.setItems(observableList);

        Callback<ListView<Tecnico>, ListCell<Tecnico>> factory = lv -> new ListCell<Tecnico>() {
            @Override
            protected void updateItem(Tecnico item, boolean empty) {
                super.updateItem(item, empty);
                setText(empty ? "" : item.getName());
            }
        };
        comboBoxTecnico.setCellFactory(factory);
        comboBoxTecnico.setButtonCell(factory.call(null));

    }
}
