package junit;

import org.junit.Assert;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ErrorCollector;

public class TestArray {
	@Rule
	public ErrorCollector errCol = new ErrorCollector();
	@Test
	public void testArray(){
		String[] expected1={"apple","mango","banana"};
		String[] actual = {"apple","mango","banana"};
		try{
			Assert.assertArrayEquals("both arrays are not equal",expected1, actual);
			
		}catch(Throwable t){
			errCol.addError(t);
			System.out.println("error");
		}
		
		
	}
	
	@Test
	public void testArray1(){
		String[] expected = {"apple","mango","grapes"};
		String[] actual = {"apple","mango","banana"};
		try{
			
			Assert.assertArrayEquals("both arrays are not equal",expected, actual);
		}catch(Throwable t){
			errCol.addError(t);
			System.out.println("error");
		}
		
		
	}

}
