/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controllers.HomeController;

import com.mycompany.ventatickets.Context;
import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.ScrollPane;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.scene.layout.CornerRadii;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import models.DEventos;
import models.DUser;
import models.Eventos;
import models.User;

/**
 *
 * @author sheyli
 */
public class Index implements Initializable {
    /**
     * Initializes the controller class.
     * @param url
     * @param rb
     */
    @FXML
    public Button iniciar_sesion;

    @FXML
    public GridPane panelGrid;

    private DEventos Obj = new DEventos();
    private DUser Obj1 = new DUser ();
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
    ArrayList<Eventos> Lista_de_eventos = Obj.Lista_de_eventos();
    
    VBox Obj = new VBox ();
    Obj.setPadding(new Insets(10));
    Obj.setSpacing(10);
    
    
        for (Eventos Evento : Lista_de_eventos) {
            VBox carta = this.Card(Evento);
            Obj.getChildren().add(carta);
                
        }
        
       ScrollPane panel = new ScrollPane(Obj);
       panel.setFitToHeight(true);
       panel.setFitToWidth(true);
       
       panelGrid.add(panel, 1, 0);
       GridPane.setMargin(panel, new Insets(75,0,0,0));
    }
    
    private VBox Card(Eventos model) {
    VBox Obj = new VBox ();
    Obj.setSpacing(10); 
    Obj.setPadding(new Insets(10));
    Obj.setBackground(new Background(new BackgroundFill(Color.BEIGE, new CornerRadii(10), null)));
    
    Label nameLabel = new Label (model.getNombre_evento());
    nameLabel.setFont(Font.font("Arial", FontWeight.BOLD, 14));
    nameLabel.setTextFill(Color.CHOCOLATE);
    
    ImageView photo = new ImageView (new Image("file:C:\\Users\\Sheyl\\OneDrive\\Imágenes\\cine.jpeg"));
    photo.setFitWidth(200);
    photo.setFitHeight(200);
    
    Label sinopsis = new Label (model.getSinopsis_evento());
    sinopsis.setFont(Font.font("Arial", FontWeight.NORMAL, 12));
    sinopsis.setTextFill(Color.BLACK);
    sinopsis.setWrapText(true);
    
    HBox conteiner = new HBox ();
    conteiner.setSpacing(10);
    conteiner.getChildren().addAll(photo, sinopsis);
    
    Button nameButton = new Button ("Ver detalle evento");
    nameButton.setFont(Font.font("Arial", FontWeight.SEMI_BOLD, 12));
    nameButton.setTextFill(Color.BLACK);
    VBox.setMargin(nameButton, new Insets(10));
    
    Obj.getChildren().addAll(nameLabel, conteiner, nameButton);
    Obj.setAlignment(Pos.CENTER);
    return Obj;
   
    }
    
}
