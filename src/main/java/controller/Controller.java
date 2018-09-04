package controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.Calculator;

public class Controller {
	
	Calculator cal = new Calculator();

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
    private Button sqr;

    @FXML
    private Button divide;

    @FXML
    private Button simplify;

    @FXML
    private Button multiply;

    @FXML
    private Label operation;

    @FXML
    private Button substract;

    @FXML
    void butAc(ActionEvent event) {
    	
    	numerator1.clear();
    	numerator2.clear();
    	denominator1.clear();
    	denominator2.clear();
    	numeratorRes.setText("");
    	denominatorRes.setText("");
    	operation.setText("");

    }

    @FXML
    void butMultiply(ActionEvent event) {
    	
    	operation.setText("*");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.multiplyRational(numer1, denom1, numer2, denom2);
       	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butDivide(ActionEvent event) {
    	
    	operation.setText("/");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.divideRational(numer1, denom1, numer2, denom2);
       	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butAdd(ActionEvent event) {
    	
    	operation.setText("+");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.addRational(numer1, denom1, numer2, denom2);
       	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butSubstract(ActionEvent event) {
    	
    	operation.setText("-");
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int numer2 = Integer.parseInt(numerator2.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	int denom2 = Integer.parseInt(denominator2.getText());
    	
    	cal.substractRational(numer1, denom1, numer2, denom2);
       	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butSqr(ActionEvent event) {
    	
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	cal.squaredRational(numer1, denom1);
    	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butSimplify(ActionEvent event) {
    	
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	cal.simplifyRational(numer1, denom1);
    	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

    @FXML
    void butInverse(ActionEvent event) {
    	
    	int numer1 = Integer.parseInt(numerator1.getText());
    	int denom1 = Integer.parseInt(denominator1.getText());
    	cal.rationalInverse(numer1, denom1);
    	numeratorRes.setText(String.valueOf(cal.getNumerator()));
    	denominatorRes.setText(String.valueOf(cal.getDenominator()));

    }

}
