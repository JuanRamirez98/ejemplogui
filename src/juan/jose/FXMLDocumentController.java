/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package juan.jose;

import java.awt.TextField;
import java.net.URL;
import java.util.LinkedList;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javax.swing.JOptionPane;

/**
 *
 * @author juan_jos.ramirez
 */
public class FXMLDocumentController implements Initializable {
    
   
    LinkedList<JuanJose> listaE;

    
    
    @FXML 
    private TextField text1;
    
    @FXML
    private TextField text2;
    

    @FXML
    private void handleButtonAction(ActionEvent event) {
        
       String nombre = text1.getText();
       String codigo = text2.getText();
       
      JuanJose obj = new JuanJose(nombre, codigo);
      boolean ss = listaE.add(obj);
      if(ss){
      text1.setText("");
      text2.setText("");
      }
    }
    @FXML
    private void handleButtonAction2(ActionEvent event) {
     String mostrar="";
        for (int i = 0; i < listaE.size(); i++) {
            mostrar += listaE.get(i)+"\n";
            
        }
        JOptionPane.showMessageDialog(null, mostrar);
    }
    @Override 
    public void initialize(URL url, ResourceBundle rb){
        listaE = new LinkedList();
        
    }
}
   