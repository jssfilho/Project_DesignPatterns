/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observerProject;

import java.io.IOException;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;

/**
 *
 * @author j_ssf
 */
public class mainfx extends Application {
    public static SujeitoConcreto c;
    public static Stage stag;
    @Override
    public void start(Stage primaryStage) throws IOException {
        mainfx.stag=primaryStage;
        mainfx.c = new SujeitoConcreto();
        primaryStage.setScene(mainfx.c.getAtualCena());
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
    public static void OnChangeScene(String n){
        mainfx.c.setCenaAtual(n);
        mainfx.stag.setScene(mainfx.c.getAtualCena());
    }
    
}
