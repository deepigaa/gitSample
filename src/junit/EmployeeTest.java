package junit;

import static org.junit.Assert.*;
import static org.hamcrest.CoreMatchers.*;

import org.junit.Test;

public class EmployeeTest {

	@Test
	public void testGetEmpId() {
		Employee emp = new Employee(101,"deepu",2000);
		assertThat(emp.getEmpId(),is(101));
		
	}
}
