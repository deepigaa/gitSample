package junit;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class MyArrayObjectEqualsTest {
	Object[] expectedEmps = new Object[3];
	@Before
	public void initVariables(){
		
		expectedEmps[0] = new Employee(1, "Nats", 15000);
        expectedEmps[1] = new Employee(2, "Kalid", 25000);
        expectedEmps[2] = new Employee(3, "Krish", 5000);

	}
	@Test
	public void testArray(){
		//get the actual employee array
		//Employee class returns a list 
		//get the array from the list using toArray()
		Object[] actualEmps = Employee.getEmpList().toArray();
		//check ExpectedEmployee with Actual Emp
		Assert.assertArrayEquals(expectedEmps,actualEmps);
		
	}

}
