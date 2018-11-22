/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
https://docs.oracle.com/javafx/2/fxml_get_started/custom_control.htm
https://stackoverflow.com/questions/40698481/javafx-errors-with-fxmlloader-loadgetclass-getclassloader-getresourcelogi
 */
package project;

import javafx.application.Application;

import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;
import abstractFactoryProject.*;

import factoryMethod.*;

/**
 *
 * @author Joao Santos
 */
public class Project extends Application {
    
    @Override
    public void start(Stage stage) throws Exception {
      
        Login l = new Login();
      
        
        stage.setScene(new Scene(l.loader.load()));
        stage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }
    
}
