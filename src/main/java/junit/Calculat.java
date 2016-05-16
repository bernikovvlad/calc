package junit;

public class Calculat {
	
	public Double sum(Object first, Object second){	
		return Double.parseDouble(first.toString())+Double.parseDouble(second.toString());
	}
	
	public Double difference(Object first, Object second){	
		return Double.parseDouble(first.toString())-Double.parseDouble(second.toString());
	}
	
	public Double multiplication(Object first, Object second){	
		return Double.parseDouble(first.toString())*Double.parseDouble(second.toString());
	}

	public Double division(Object first, Object second){	
		return Double.parseDouble(first.toString())/Double.parseDouble(second.toString());
	}
}
