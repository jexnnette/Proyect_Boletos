/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package controllers.AuthController;

import com.mycompany.ventatickets.Location;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;

/**
 * FXML Controller class
 *
 * @author cgalv
 */
public class Index implements Initializable {

    /**
     * Initializes the controller class.
     */
    
    @FXML
    public Button btnSignIn, btnSignUp;
    
    @FXML
    public StackPane containerForm;
    
    public VBox signInForm, signUpForm; 
    
     @FXML
    public void actionEvent(ActionEvent e){
        
        Object evt = e.getSource();
        
        if(evt.equals(btnSignIn)){
            signInForm.setVisible(true);
            signUpForm.setVisible(false);                    
        }else if(evt.equals(btnSignUp)){
            signUpForm.setVisible(true);                                
            signInForm.setVisible(false);
        }
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
          try {
            signInForm = loadForm("/views/Auth/Login.fxml");
            signUpForm = loadForm("/views/Auth/SingUp.fxml");    
            containerForm.getChildren().addAll(signInForm,signUpForm);
            signInForm.setVisible(true);
            signUpForm.setVisible(false);
        } catch (IOException ex) {           
           System.out.println("Ha ocurrido un error " + ex.toString());
        }
    }    
    
    private VBox loadForm(String url) throws IOException{    
        return (VBox) FXMLLoader.load(Location.loadPath(url));    
    }
    
}
