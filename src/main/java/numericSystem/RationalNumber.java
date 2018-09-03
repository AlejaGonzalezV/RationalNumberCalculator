package numericSystem;

import interfaces.IRationalNumber;

public class RationalNumber<T extends Number> implements IRationalNumber<T>{
	
	private T numerator;
	private T denominator;
	
	public RationalNumber(T numerator, T denominator) {
		
		this.numerator = numerator;
		this.denominator = denominator;
		
	}

	@Override
	public void addRational(RationalNumber<Number> rationalFactor) {
		
		T numerator2 = (T) rationalFactor.getNumerator();
		T denominator2 = (T) rationalFactor.getDenominator();
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(denominator.longValue() != denominator2.longValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Long.valueOf(numerator.longValue() * denominator2.longValue());
				temp2 = (T) Long.valueOf(numerator2.longValue() * denominator.longValue());
				this.numerator = (T) Long.valueOf(temp1.longValue() + temp2.longValue());
				this.denominator = (T) Long.valueOf(denominator.longValue() * denominator2.longValue());
				
			}
			
			else if(denominator.longValue() == denominator2.longValue()){
				
				this.numerator = (T) Long.valueOf(numerator.longValue() + numerator2.longValue());
				
			}	
			
		}
		
		else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(denominator.intValue() != denominator2.intValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Integer.valueOf(numerator.intValue() * denominator2.intValue());
				temp2 = (T) Integer.valueOf(numerator2.intValue() * denominator.intValue());
				this.numerator = (T) Integer.valueOf(temp1.intValue() + temp2.intValue());
				this.denominator = (T) Integer.valueOf(denominator.intValue() * denominator2.intValue());
				
			}
			
			else if(denominator.intValue() == denominator2.intValue()){
				
				this.numerator = (T) Integer.valueOf(numerator.intValue() + numerator2.intValue());
				
			}	
			
		}
		
		else if(numerator instanceof Short && denominator instanceof Short) {
			
			if(denominator.shortValue() != denominator2.shortValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Short.valueOf((short) (numerator.shortValue() * denominator2.shortValue()));
				temp2 = (T) Short.valueOf((short) (numerator2.shortValue() * denominator.shortValue()));
				this.numerator = (T) Short.valueOf((short) (temp1.shortValue() + temp2.shortValue()));
				this.denominator = (T) Short.valueOf((short) (denominator.shortValue() * denominator2.shortValue()));
				
			}
			
			else if(denominator.shortValue() == denominator2.shortValue()){
				
				this.numerator = (T) Short.valueOf((short) (numerator.shortValue() + numerator2.shortValue()));
				
			}	
			
		}
		
		simplifyRational();
		
	}

	@Override
	public void substractRational(RationalNumber<Number> rationalFactor) {
	
		T numerator2 = (T) rationalFactor.getNumerator();
		T denominator2 = (T) rationalFactor.getDenominator();
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(denominator.longValue() != denominator2.longValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Long.valueOf(numerator.longValue() * denominator2.longValue());
				temp2 = (T) Long.valueOf(numerator2.longValue() * denominator.longValue());
				this.numerator = (T) Long.valueOf(temp1.longValue() - temp2.longValue());
				this.denominator = (T) Long.valueOf(denominator.longValue() * denominator2.longValue());
				
			}
			
			else if(denominator.longValue() == denominator2.longValue()){
				
				this.numerator = (T) Long.valueOf(numerator.longValue() - numerator2.longValue());
				
			}	
			
		}
		
		else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(denominator.intValue() != denominator2.intValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Integer.valueOf(numerator.intValue() * denominator2.intValue());
				temp2 = (T) Integer.valueOf(numerator2.intValue() * denominator.intValue());
				this.numerator = (T) Integer.valueOf(temp1.intValue() - temp2.intValue());
				this.denominator = (T) Integer.valueOf(denominator.intValue() * denominator2.intValue());
				
			}
			
			else if(denominator.intValue() == denominator2.intValue()){
				
				this.numerator = (T) Integer.valueOf(numerator.intValue() - numerator2.intValue());
				
			}	
			
		}
		
		else if(numerator instanceof Short && denominator instanceof Short) {
			
			if(denominator.shortValue() != denominator2.shortValue()) {
				
				T temp1;
				T temp2;
				 
				temp1 = (T) Short.valueOf((short) (numerator.shortValue() * denominator2.shortValue()));
				temp2 = (T) Short.valueOf((short) (numerator2.shortValue() * denominator.shortValue()));
				this.numerator = (T) Short.valueOf((short) (temp1.shortValue() - temp2.shortValue()));
				this.denominator = (T) Short.valueOf((short) (denominator.shortValue() * denominator2.shortValue()));
				
			}
			
			else if(denominator.shortValue() == denominator2.shortValue()){
				
				this.numerator = (T) Short.valueOf((short) (numerator.shortValue() - numerator2.shortValue()));
				
			}	
			
		}
		
		simplifyRational();
		
	}

	@Override
	public void multiplyRational(RationalNumber<Number> rationalFactor) {
		
		this.numerator = multiply(numerator, (T) rationalFactor.getNumerator());
		this.denominator = multiply(denominator, (T) rationalFactor.getDenominator());
		simplifyRational();
		
	}

	private T multiply(T n1, T n2) {
		
		T number = null;
		
		if(n1 instanceof Long) {
			
			number = (T) Long.valueOf(n1.longValue() * n2.longValue());
			
		}
		
		else if(n1 instanceof Integer) {
			
			number = (T) Integer.valueOf(n1.intValue() * n2.intValue());
			
		}
		
		else if(n1 instanceof Short) {
			
			number = (T) Short.valueOf((short) (n1.shortValue() * n2.shortValue()));
			
		}
		
		return number;
		
	}

	@Override
	public void divideRational(RationalNumber<Number> rationalFactor) {
		
		this.numerator = multiply(numerator, (T) rationalFactor.getDenominator());
		this.denominator = multiply(denominator, (T) rationalFactor.getNumerator());
		simplifyRational();
		
	}

	@Override
	public void simplifyRational() {
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			if(Math.abs(numerator.longValue()) == Math.abs(denominator.longValue())) {
				
				this.numerator = (T) Long.valueOf(numerator.longValue() / Math.abs(numerator.longValue()));
				this.denominator = (T) Long.valueOf(denominator.longValue() / Math.abs(denominator.longValue()));
				
			}
			
			else {
			
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.longValue()%2 == 0 && denominator.longValue()%2 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 2);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 2);
					
				}	
				
				else if(numerator.longValue()%3 == 0 && denominator.longValue()%3 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 3);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 3);
					
				}
				
				else if(numerator.longValue()%5 == 0 && denominator.longValue()%5 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 5);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 5);
					
				}
				
				else if(numerator.longValue()%7 == 0 && denominator.longValue()%7 == 0) {
					
					this.numerator = (T) Long.valueOf(numerator.longValue() / 7);
					this.denominator = (T) Long.valueOf(denominator.longValue() / 7);
					
				}
				
			
				
				else {
					
					stop = true;
					
				}
				
			}
			
			}
			
		}
		
		else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			if(Math.abs(numerator.intValue()) == Math.abs(denominator.intValue())) {
				
				this.numerator = (T) Integer.valueOf(numerator.intValue() / Math.abs(numerator.intValue()));
				this.denominator = (T) Integer.valueOf(denominator.intValue() / Math.abs(denominator.intValue()));
				
			}
			
			else {
			
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.intValue()%2 == 0 && denominator.intValue()%2 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 2);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 2);
					
				}	
				
				else if(numerator.intValue()%3 == 0 && denominator.intValue()%3 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 3);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 3);
					
				}
				
				else if(numerator.intValue()%5 == 0 && denominator.intValue()%5 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 5);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 5);
					
				}
				
				else if(numerator.intValue()%7 == 0 && denominator.intValue()%7 == 0) {
					
					this.numerator = (T) Integer.valueOf(numerator.intValue() / 7);
					this.denominator = (T) Integer.valueOf(denominator.intValue() / 7);
					
				}
				
				
				else {
					
					stop = true;
					
				}
				
			}
			
			}
		}
		
		else if(numerator instanceof Short && denominator instanceof Short) {
	
			if(Math.abs(numerator.shortValue()) == Math.abs(denominator.shortValue())) {
				
				this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / Math.abs(numerator.shortValue())));
				this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / Math.abs(denominator.shortValue())));
				
			}
			
			else {
			
			boolean stop = false;
			
			while(stop == false) {
				
				if(numerator.shortValue()%2 == 0 && denominator.shortValue()%2 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 2));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 2));
					
				}	
				
				else if(numerator.shortValue()%3 == 0 && denominator.shortValue()%3 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 3));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 3));
					
				}
				
				else if(numerator.shortValue()%5 == 0 && denominator.shortValue()%5 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 5));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 5));
					
				}
				
				else if(numerator.shortValue()%7 == 0 && denominator.shortValue()%7 == 0) {
					
					this.numerator = (T) Short.valueOf((short) (numerator.shortValue() / 7));
					this.denominator = (T) Short.valueOf((short) (denominator.shortValue() / 7));
					
				}
				
				else {
					
					stop = true;
					
				}
				
			}
			}
		}
		
		
	}

	@Override
	public void rationalInverse() {
		
		T num = numerator;
		
		if((int)num != 0) {
			
			T temp = numerator;
			this.numerator = denominator;
			this.denominator = temp;
			simplifyRational();
			
		}
		
		
		
	}

	@Override
	public void squaredRational() {
		
		if(numerator instanceof Long && denominator instanceof Long) {
			
			this.numerator = (T) Long.valueOf(numerator.longValue() * numerator.longValue());
			this.denominator = (T) Long.valueOf(denominator.longValue() * denominator.longValue());
			
		}
		
		else if(numerator instanceof Integer && denominator instanceof Integer) {
			
			this.numerator = (T) Integer.valueOf(numerator.intValue() * numerator.intValue());
			this.denominator = (T) Integer.valueOf(denominator.intValue() * denominator.intValue());
			
		}
		
		else if(numerator instanceof Short &&  denominator instanceof Short) {
			
			this.numerator = (T) Short.valueOf((short) (numerator.shortValue() * numerator.shortValue()));
			this.denominator = (T) Short.valueOf((short) (denominator.shortValue() * denominator.shortValue()));
			
		}
		
		simplifyRational();
		
	}

	@Override
	public Number getNumerator() {
		// TODO Auto-generated method stub
		return numerator;
	}

	@Override
	public Number getDenominator() {
		// TODO Auto-generated method stub
		return denominator;
	}


}
