package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javax.swing.*;

public class Controller {
    @FXML
    private Button dugme;
    @FXML
    private Label labela;


    public void Submit(ActionEvent actionEvent) {
        labela.setText("Zdravo svijete");
    }
}
