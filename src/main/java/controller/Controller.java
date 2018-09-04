package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.*;

public class Controller {
	
	Calculator cal = new Calculator();

    @FXML
    private Button num9;

    @FXML
    private Button num8;

    @FXML
    private Button num7;

    @FXML
    private Button num6;

    @FXML
    private Button sqr;

    @FXML
    private Button num1;

    @FXML
    private Button num0;

    @FXML
    private Button divide;

    @FXML
    private Button num5;

    @FXML
    private Button multiply;

    @FXML
    private Button num4;

    @FXML
    private Button num3;

    @FXML
    private Button substract;

    @FXML
    private Button num2;

    @FXML
    private Button add;

    @FXML
    private Button inverse;

    @FXML
    private TextField denominator1;

    @FXML
    private Button ac;

    @FXML
    private TextField denominator2;

    @FXML
    private TextField numerator1;

    @FXML
    private TextField numerator2;

    @FXML
    private Label denominatorRes;

    @FXML
    private Label numeratorRes;

    @FXML
    private Button equals;

    @FXML
    private Button simplify;

    @FXML
    private TextField operation;

    @FXML
    void butNum1(ActionEvent event) {

    }

    @FXML
    void butNum2(ActionEvent event) {

    }

    @FXML
    void butNum3(ActionEvent event) {

    }

    @FXML
    void butNum4(ActionEvent event) {

    }

    @FXML
    void butNum5(ActionEvent event) {

    }

    @FXML
    void butNum6(ActionEvent event) {

    }

    @FXML
    void butNum7(ActionEvent event) {

    }

    @FXML
    void butNum8(ActionEvent event) {

    }

    @FXML
    void butNum9(ActionEvent event) {

    }

    @FXML
    void butEquals(ActionEvent event) {
    	
    	
    	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butNum0(ActionEvent event) {

    }

    @FXML
    void butAc(ActionEvent event) {

    }

    @FXML
    void butMultiply(ActionEvent event) {
    	
    	operation.setText("*");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.multiplyRational(numer1, denom1, numer2, denom2);
    	

    }

    @FXML
    void butDivide(ActionEvent event) {
    	
    	operation.setText("/");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.divideRational(numer1, denom1, numer2, denom2);

    }

    @FXML
    void butAdd(ActionEvent event) {
    	
    	operation.setText("+");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.addRational(numer1, denom1, numer2, denom2);

    }

    @FXML
    void butSubstract(ActionEvent event) {
    	
    	operation.setText("-");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.substractRational(numer1, denom1, numer2, denom2);

    }

    @FXML
    void butSqr(ActionEvent event) {

    }

    @FXML
    void butSimplify(ActionEvent event) {

    }

    @FXML
    void butInverse(ActionEvent event) {

    }

}
