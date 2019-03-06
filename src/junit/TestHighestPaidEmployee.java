package junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class TestHighestPaidEmployee {
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	
	@Test
	public void testHighestPaidEmployeeName(){
		String expected = "Nattu";
		try{
			
			Assert.assertEquals("The two names does not match",expected,Employee.getEmpNameWithHighestSalary());
		}catch(Throwable t){
			errCol.addError(t);
			System.out.println("error");
		}
	}
	
	@Test
	public void testHighestPaidEmployee(){
		Employee emp = new Employee(1, "Nattu", 15000);
		try{
			Assert.assertEquals("The employees does not match",emp,Employee.getHighestPaidEmployee());
		}catch(Throwable t){
			errCol.addError(t);
			System.out.println("error");
		}

	}
		
		
	

}
