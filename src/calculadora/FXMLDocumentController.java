/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calculadora;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.MenuBar;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

/**
 *
 * @author ADMIN
 */
public class FXMLDocumentController implements Initializable {

    @FXML
    private AnchorPane anchorpane;
    @FXML
    private GridPane gridpane;
    @FXML
    private MenuBar menubar;
    @FXML
    private Label label1;
    @FXML
    private ImageView btncerrar;
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void getOnMouseClicked(MouseEvent event) {
        Platform.exit();
        System.exit(0);
    }

    @FXML
    private void initialize(MouseEvent event) {
    }
    
}
