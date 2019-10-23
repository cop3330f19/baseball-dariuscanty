/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package baseball;

import java.io.BufferedReader;
import java.io.IOException;
import java.net.URL;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ResourceBundle;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.ListView;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

/**
 *
 * @author Darius Canty
 */
public class BaseballController implements Initializable {

    /**
     * 
     * Variables that are a mapping to the FXML controls
     * 
     */
    @FXML private ListView lvTeams;
    @FXML private TableView tblResult;
    @FXML private TableColumn <String, Baseball> colPlayer;
    @FXML private TableColumn <String, Baseball> colBattingAverage;
        
    //ArrayList of States objects
    private final List<Baseball> states = new ArrayList<>();
    
    //Gets the directory path of the project
    private final String DIR = System.getProperty("user.dir");
          
    /**
     * Called to initialize a controller after its root element has been
     * completely processed.
     *
     */
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
        readFile();
        
        //ChangeListerner for when you click on a ListView Item
        lvTeams.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<String>(){
            @Override
            public void changed(ObservableValue<? extends String> observable, String oldValue, String newValue) {
               
                //Find the state chosen in the ArrayList
                int idx = findState(newValue);
                
                //Link the column's cell value to the get function of the States Class.
                //REMEMBER the name in the quotation marks should match the case of the get function
                colPlayer.setCellValueFactory(new PropertyValueFactory<>("player"));
                colBattingAverage.setCellValueFactory(new PropertyValueFactory<>("hits"));
                
                //Create an ObservableList object to store the States object(s)
                ObservableList<Baseball> result = FXCollections.observableArrayList();

                result.add(result.get(idx));
              
                //Bind the list  to the table
                tblResult.setItems(result);
                
            }
        });
    }
    
    /**
     * Sequential search of the states by name
     * @param value
     * @return 
     */
    
    private int findState(String value){
     
        for(int i = 0; i < states.size(); i++)
            if(!states.get(i).getName().equals(value)) {
            } else {
                return i;
            }
        return 0;
    }
    
    /**
     * Read file contents and populate the Lists and ListView
     */
    private void readFile() {
        
        //ObservableList to add teams to the ListView
        ObservableList<String> teamList = FXCollections.observableArrayList();
        
        //sorts the ObservableList
        Collections.sort(teamList);
        
        //Binds the ObservableList to the ListView
        lvTeams.setItems(teamList);
    }
}
