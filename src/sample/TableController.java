package sample;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.stage.Stage;

import javax.swing.text.TableView;
import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class TableController implements Initializable{

    //Configure table

    @FXML
    private javafx.scene.control.TableView<Person> tableView;
    @FXML
    private TableColumn<Person, String> nameColumn;
    @FXML
    private TableColumn<Person, String> imageColumn;
    @FXML
    private TableColumn<Person, String> statusColumn;
    @FXML
    private TableColumn<Person, String> genderColumn;
    @FXML
    private TableColumn<Person, String> ageColumn;
    @FXML
    private TableColumn<Person, String> stateColumn;

    /**
     * When this method is called it will change the scene to a Table view
     */
    public void changeSceneButton(ActionEvent event) throws IOException {
        Parent rootScene = FXMLLoader.load(getClass().getResource("menu.fxml"));
        Scene menuScene = new Scene(rootScene, 800, 500);

        //This line get the Stage information
        Stage window = (Stage) ((Node)event.getSource()).getScene().getWindow();

        window.setScene(menuScene);
        window.show();
    }

    /**
     * Initialize the controller
     * @param url
     * @param rb
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //Sets up columns in the table
        nameColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("name"));
        imageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("image"));
        statusColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("status"));
        genderColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("gender"));
        ageColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("age"));
        stateColumn.setCellValueFactory(new PropertyValueFactory<Person, String>("state"));

        //load data
        tableView.setItems(getPeople());
    //    tableView.setEditable(true);
    }

    /**
     * This method will return Observable list of People objects
     */
    public ObservableList<Person> getPeople() {
        //Set up the  columns in the table
        ObservableList<Person> people = FXCollections.observableArrayList();
        people.add(new Person("Roy Smith", "roy.image", "Working at IBM", "M", "23", "VIC"));
        people.add(new Person("Roy Smith", "roy.image", "Working at IBM", "M", "23", "VIC"));
        people.add(new Person("Joan Smith", "joan.image", "Working at Oxford", "F", "22", "QLD"));
        people.add(new Person("Bob Jones", "bob.image", "Working at RMIT", "M", "34", "SA"));
        people.add(new Person("Tom Hope", "tom.image", "Working at Silver Pond", "M", "25", "QLD"));
        people.add(new Person("Joy Joyce", "joy.image", "Working at KFC", "F", "15", "WA"));
        people.add(new Person("Percy Thomson", "percy.image", "Working at MacDonalds", "M", "16", "VIC"));

        return people;
    }
}
