package com.enriquezrene.javafx.part04;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.web.WebEngine;
import javafx.scene.web.WebView;

import java.net.URL;
import java.util.ResourceBundle;

/**
 * Created by rene on 31/05/16.
 */
public class ShowPdf implements Initializable {

    @FXML
    private WebView webView;


    public void initialize(URL location, ResourceBundle resources) {
        WebEngine engine = webView.getEngine();
        String url = getClass().getResource("web/viewer.html").toExternalForm();
        engine.load(url);
    }
}
