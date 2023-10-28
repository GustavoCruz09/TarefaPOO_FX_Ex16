import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class TarefaPOO_FX_Ex16 extends Application {

    public static void main(String[] args) {
        launch(args);
    }
    @Override
    public void start(Stage primaryStage) throws Exception {
        primaryStage.setTitle("Agenda de Contatos");

        Pane painel = new Pane();

        Label idLbl = new Label("Id:");
        idLbl.relocate(20, 20);

        TextField idTf = new TextField();
        idTf.relocate(150, 20);
        idTf.setPrefWidth(320);

        Label nmLbl = new Label("Nome:");
        nmLbl.relocate(20, 60);

        TextField nmTf = new TextField();
        nmTf.relocate(150, 60);
        nmTf.setPrefWidth(320);

        Label telLbl = new Label("Telefone:");
        telLbl.relocate(20, 100);

        TextField telTf = new TextField();
        telTf.relocate(150, 100);
        telTf.setPrefWidth(320);

        Button saveBtn = new Button("Salvar");
        saveBtn.relocate(20, 140);

        Button pesqBtn = new Button("Pesquisar");
        pesqBtn.relocate(70, 140);

        Scene scn = new Scene(painel, 480, 200);
        painel.getChildren().addAll(idLbl, idTf, nmLbl, nmTf, telLbl, telTf, saveBtn, pesqBtn);
        primaryStage.setScene(scn);
        primaryStage.show();
    }
    
}
