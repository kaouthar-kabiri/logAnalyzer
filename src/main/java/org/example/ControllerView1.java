package org.example;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import javax.swing.*;
import java.awt.*;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;


public class ControllerView1 extends Component implements Initializable {

    @FXML
    private Button btnSave;
    @FXML
    private TextField pathField;

    @FXML
    public void bttsave(ActionEvent event) {
        String path_file = new String(pathField.getText());
        System.out.println(path_file);

        if(path_file.isEmpty()){
            JOptionPane.showMessageDialog(this,"Please enter the path of your file ","try again", JOptionPane.ERROR_MESSAGE);
        }else{

            try {
                btnSave.getScene().getWindow().hide();
                FXMLLoader loader = new FXMLLoader();
                loader.setLocation(LogApplication.class.getResource("dashboard.fxml"));
                Stage stage = new Stage();
                Scene scene = new Scene(loader.load());
                scene.getStylesheets().addAll(getClass().getResource("/css/sideBar.css").toExternalForm(),getClass().getResource("/css/navBar.css").toExternalForm(),getClass().getResource("/org/example/Style.css").toExternalForm());
                stage.setScene(scene);
                stage.setTitle("Log Analyser");
                stage.setScene(scene);
                stage.show();
            } catch (IOException ex) {
                ex.printStackTrace();

            }

        }}

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

}

