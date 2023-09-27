package Controllers;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;
import javafx.event.ActionEvent;

import java.net.URL;
import java.util.ResourceBundle;

public class dcAppConroller implements Initializable {
    @FXML
    private Label welcomeText;

    @FXML
    protected void onHelloButtonClick() {
        welcomeText.setText("Welcome to JavaFX Application!");
    }
    @FXML
    private WebView webView;

    @FXML
    private WebEngine webEngine;


    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        webEngine = webView.getEngine();
        loadPage();
            }
            public void loadPage(){
        webEngine.load("https://driverscatalog.com/land/top-10-pc-optimizer/");
            }
}