import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.input.MouseDragEvent;
import javafx.stage.Stage;
import utile.Vue;

public class testMenu extends Application {

    @Override
    public void start(Stage stage) throws Exception {
        /*
        FlowPane fp = new FlowPane();
        fp.getChildren().addAll(new Button("JOUER"),
                                new Button("OPTIONS"));

        javafx.scene.Scene niveau = new javafx.scene.Scene(fp);

        stage.setScene(niveau);
        stage.show();
        */
        Vue vue = new Vue();
        vue.changeScene(stage, "Menu");

    }


}
