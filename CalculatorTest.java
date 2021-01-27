
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
	
	@Test
	public void testAverage() throws EmptyException
	{
		Calculator c = new Calculator();
		c.add(1);
		c.add(3);
		c.add(1000);
		
		Double result = c.average();
		assertEquals((Double)334.66,result,0.01);
	}
	
	@Test(expected = EmptyException.class)
	public void testEmpty() throws EmptyException {
		Calculator c = new Calculator();
		c.average();
		
	}

}
