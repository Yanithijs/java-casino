package taak.grotetaakcasi;

import java.io.IOException;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class SpeelbordController {

    @FXML
    private Label algemeenBudgetLabel;

    @FXML
    private Button blackJackButton;

    @FXML
    private Button hogerLagerButton;
    
    @FXML
    private Label menuLabel;
    @FXML
    private Button geldActies;
    
    public void initialize(){
        App.getBedragen().getTotaleBedrag();
        algemeenBudgetLabel.setText("Budget: " + App.getBedragen().getTotaleBedrag());
    }
    
    @FXML
    public void blackJackOpenen() throws IOException{
        App.setRoot("blackjack");
    }
    
    public void hogerLagerOpenen() throws IOException{
<<<<<<< HEAD
        App.setRoot("HogerLagerMenu"); 
=======
        App.setRoot("hogerLagerMenu"); 
>>>>>>> 75ff89e5e40d1b1efd192cfa215d589d28d10a4b
    } 

    @FXML
    private void update(ActionEvent event) throws IOException {
        App.setRoot("Tafel");
    }
    @FXML
     public void slotsOpenen() throws IOException{
        App.setRoot("slots"); 
     }    
}
