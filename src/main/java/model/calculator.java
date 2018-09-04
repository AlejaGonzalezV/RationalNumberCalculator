package model;

import numericSystem.RationalNumber;

public class Calculator{
	
	private int numerator;
	private int denominator;

	public Calculator() {
		
		
	}
	
	public void addRational(int num1, int num2, int num3, int num4) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		RationalNumber<Number> rational2 = new RationalNumber(num3, num4);
		rational1.addRational(rational2);
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void substractRational(int num1, int num2, int num3, int num4) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		RationalNumber<Number> rational2 = new RationalNumber(num3, num4);
		rational1.substractRational(rational2);
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void multiplyRational(int num1, int num2, int num3, int num4) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		RationalNumber<Number> rational2 = new RationalNumber(num3, num4);
		rational1.multiplyRational(rational2);
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void divideRational(int num1, int num2, int num3, int num4) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		RationalNumber<Number> rational2 = new RationalNumber(num3, num4);
		rational1.divideRational(rational2);
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void simplifyRational(int num1, int num2) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		rational1.simplifyRational();
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void squaredRational(int num1, int num2) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		rational1.simplifyRational();
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	public void rationalInverse(int num1, int num2) {
		
		RationalNumber<Integer> rational1 = new RationalNumber(num1, num2);
		rational1.simplifyRational();
		this.numerator = (int) rational1.getNumerator();
		this.denominator = (int) rational1.getDenominator();
		
	}
	
	

	public int getNumerator() {
		return numerator;
	}

	public void setNumerator(int numerator) {
		this.numerator = numerator;
	}

	public int getDenominator() {
		return denominator;
	}

	public void setDenominator(int denominator) {
		this.denominator = denominator;
	}

	
	
	
}
