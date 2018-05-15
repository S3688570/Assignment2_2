package sample;

import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TextField;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

/**
 * FXML controller class
 *
 * @author Charles Galea
 */


public class Controller {

    /**
     * Construct a default constructor for Controller object
     */
    public Controller() {

    }



    @FXML
    private Label lbl_status;

    @FXML
    private TextField txtFirstPerson;

    @FXML
    private TextField txtSecondPerson;


    public void friends(ActionEvent event) throws Exception {
        Stage primaryStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("makeRelationship.fxml"));
        primaryStage.setScene(new Scene(root, 600, 400));
        primaryStage.show();
    }


 /*   public void allProfiles(ActionEvent event) {
        if (txtFirstPerson.getText().equals("user") && txtSecondPerson.getText().equals("pass")) {
            lbl_status.setText("Login Success");
            Stage primaryStage = new Stage();
            Parent root = FXMLLoader.load(getClass().getResource("table.fxml"));
            primaryStage.setScene(new Scene(root, 300, 275));
            primaryStage.show();
        } else {
            lbl_status.setText("Login Failed");
        }
    }  */

    public void menu(ActionEvent event) {
    }

    public void closeApp(ActionEvent event) {
        Platform.exit();
        System.exit(0);
    }

    /* public void allProfiles(ActionEvent event) throws Exception {
        Stage secondStage = new Stage();
        Parent root = FXMLLoader.load(getClass().getResource("table.fxml"));
        secondStage.setScene(new Scene(root, 500, 500));
        secondStage.show();
    }  */

    /**
     * When this method is called it will change the scene to a Table view
     */
    public void table(ActionEvent event) throws Exception {
        Parent tableViewParent = FXMLLoader.load(getClass().getResource("table.fxml"));
        Scene tableViewScene = new Scene(tableViewParent);


        //This line will get the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(tableViewScene);
        window.show();
    }

    public void changeSceneButton(ActionEvent event) throws IOException {
        Parent rootScene = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuScene = new Scene(rootScene, 800, 500);

        //This line get the Stage information
        Stage window = (Stage) ((Node) event.getSource()).getScene().getWindow();

        window.setScene(menuScene);
        window.show();
    }
}

