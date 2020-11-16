package application;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    private static Stage stage;
    private static Scene mainScene;
    private static Scene tecnicoScene;
    private static Scene equipamentoScene;
    private static Scene novoTecnicoScene;
    private static Scene novoEquipamentoScene;


    @Override
    public void start(Stage primaryStage) throws Exception {

        stage = primaryStage;
        primaryStage.setTitle("Manutenção FIES");

        Parent main = FXMLLoader.load(getClass().getResource("/view/MainView.fxml"));
        mainScene = new Scene(main, 600, 400);

        Parent tecnico = FXMLLoader.load(getClass().getResource("/view/TecnicoView.fxml"));
        tecnicoScene = new Scene(tecnico, 600, 400);

        Parent novoTecnico = FXMLLoader.load(getClass().getResource("/view/NovoTecnicoView.fxml"));
        novoTecnicoScene = new Scene(novoTecnico, 600, 400);

        Parent equipamento = FXMLLoader.load(getClass().getResource("/view/EquipamentoView.fxml"));
        equipamentoScene = new Scene(equipamento, 600, 400);

        Parent novoEquipamanto = FXMLLoader.load(getClass().getResource("/view/NovoEquipamentoView.fxml"));
        novoEquipamentoScene = new Scene(novoEquipamanto, 600, 400);


        primaryStage.setScene(mainScene);
        primaryStage.show();
    }

    public static void changeScreen(String src) {
        switch (src) {
            case "Main":
                stage.setScene(mainScene);
                break;
            case "Tecnico":
                stage.setScene(tecnicoScene);
                break;
            case "NovoTecnico":
                stage.setScene(novoTecnicoScene);
                break;
            case "Equipamento":
                stage.setScene(equipamentoScene);
                break;
            case "NovoEquipamento":
                stage.setScene(novoEquipamentoScene);
                break;
        }
    }


    public static void main(String[] args) {
        launch(args);
    }
}

