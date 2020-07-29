/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projectx;


import javafx.geometry.Insets;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Menu;
import javafx.scene.control.MenuBar;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

/**
 *
 * @author milanbrchel
 */
public class ProjectX extends Application {
    
    private TableView movieTable = new TableView();
    private Text copyright = new Text();
    Font font = Font.font("Calibri", 12);
   
    
    
    
    @Override
    public void start(Stage primaryStage) {
      
        BorderPane appBody = new BorderPane();
        HBox top = addTopBox();
        VBox central = addCentralBox();
        StackPane bottom = addBottomBox();
               
        
        
        MenuBar menuBar = new MenuBar();
        Menu menuFile = new Menu("File");
        Menu menuEdit = new Menu("Edit");
        Menu menuView = new Menu("View");
        menuBar.getMenus().addAll(menuFile, menuEdit, menuView);
 
        appBody.setCenter(central);
        appBody.setBottom(bottom);
        appBody.setTop(top);
        //appBody.setTop(menuBar);
        
        Scene scene = new Scene(appBody, 1200, 800);
        primaryStage.setTitle("Movie Database");
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        launch(args);
    }


    public HBox addTopBox() {
        HBox hbox = new HBox();
        hbox.setPadding(new Insets(15, 12, 15, 12));
        hbox.setSpacing(10);
        hbox.setStyle("-fx-background-color: #336699;");

        Button button1 = new Button("Button");
        button1.setPrefSize(120, 30);

        Button button2 = new Button("Button");
        button2.setPrefSize(120, 30);
        hbox.getChildren().addAll(button1, button2);

        return hbox;
    }       

    public VBox addCentralBox(){
     movieTable.setEditable(true);

            TableColumn col1 = new TableColumn("Col1");
            TableColumn col2 = new TableColumn("Col2");
            TableColumn col3 = new TableColumn("Col3");

            movieTable.getColumns().addAll(col1, col2, col3);
            
            
            VBox vbox = new VBox();
            vbox.setSpacing(5);
            vbox.setPadding(new Insets(20, 20, 20, 20));
            vbox.getChildren().addAll(movieTable);
            return vbox;
    }

    
    
    public StackPane addBottomBox() {
        StackPane stackPane = new StackPane();

        stackPane.setStyle("-fx-background-color: #FFFFFF;");
        stackPane.setMinHeight(30);
        
        copyright.setText("Copyright © 2020 Bc. Milan Brchel. All Rights Reserved");
        copyright.setTextAlignment(TextAlignment.CENTER);
        copyright.setFont(font);
        
        stackPane.getChildren().add(copyright);
        
        
        return stackPane;
    } 
}
