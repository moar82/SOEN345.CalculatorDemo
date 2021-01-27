import java.util.ArrayList;

public class Calculator {
	ArrayList<Double> numbers = new ArrayList<Double>();

	public void add(double i) {
		numbers.add(i);
		
	}

	public Double average()  throws EmptyException{
		if (numbers.isEmpty()) {
			throw new EmptyException();
		}
		Double sum =0.0;
		for (Double number:numbers) {
			sum+=number;
		}
		
		double result = sum/numbers.size();
		
		System.out.println(result);
		return result;
	}

}
