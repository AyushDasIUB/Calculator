/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */
package mainpkg;

import java.net.URL;
import java.util.ResourceBundle;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import java.lang.Math;
/**
 * FXML Controller class
 *
 * @author dasay
 */
public class CalculatorController implements Initializable {

    @FXML
    private TextField xTextField;
    @FXML
    private TextField yTextField;
    @FXML
    private Label outputLable;

    /**
     * Initializes the controller class.
     */
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    

    @FXML
    private void additionOnMouseClick(MouseEvent event) {
        float xfloat = Float.parseFloat(xTextField.getText());
        float yfloat = Float.parseFloat(yTextField.getText());
        
        float sum = xfloat + yfloat;
        String sumstr = Float.toString(sum);
        outputLable.setText(sumstr);
    }

    @FXML
    private void subOnMouseClick(MouseEvent event) {
        float xfloat = Float.parseFloat(xTextField.getText());
        float yfloat = Float.parseFloat(yTextField.getText());
        
        float sum = xfloat - yfloat;
        String sumstr = Float.toString(sum);
        outputLable.setText(sumstr);
    }

    @FXML
    private void mulOnMouseClick(MouseEvent event) {
        float xfloat = Float.parseFloat(xTextField.getText());
        float yfloat = Float.parseFloat(yTextField.getText());
        
        float sum = xfloat * yfloat;
        String sumstr = Float.toString(sum);
        outputLable.setText(sumstr);
    }

    @FXML
    private void divOnMouseClick(MouseEvent event) {
        float xfloat = Float.parseFloat(xTextField.getText());
        float yfloat = Float.parseFloat(yTextField.getText());
        
        float sum = xfloat / yfloat;
        String sumstr = Float.toString(sum);
        outputLable.setText(sumstr);
    }

    @FXML
    private void rootOnMouseClick(MouseEvent event) {
        float power = 0.5f;
        double xfloat = Double.parseDouble(xTextField.getText());
        double root = Math.pow(xfloat, power);
        
        String sum = Double.toString(root);
        outputLable.setText(sum);
    }

    @FXML
    private void sinOnMouseClick(MouseEvent event) {
        double xdouble = Double.parseDouble(xTextField.getText());
        double sin = (Math.sin(Math.toRadians(xdouble)));
        
        String sum = Double.toString(sin);
        outputLable.setText(sum);
    }

    @FXML
    private void conOnMouseClick(MouseEvent event) {
        double xdouble = Double.parseDouble(xTextField.getText());
        double sin = (Math.cos(Math.toRadians(xdouble)));
        
        String sum = Double.toString(sin);
        outputLable.setText(sum);
    }

    @FXML
    private void tanOnMouseClick(MouseEvent event) {
        double xdouble = Double.parseDouble(xTextField.getText());
        double sin = (Math.tan(Math.toRadians(xdouble)));
        
        String sum = Double.toString(sin);
        outputLable.setText(sum);
    }
    
}
