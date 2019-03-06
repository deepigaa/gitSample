package junit;

import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.*;

import org.junit.Test;
 
public class MyAssertNotNullTest {
 
    public String getPropValue(final String key){
        Map<String,String> appProps = new HashMap<String, String>();
        appProps.put("key1", "value 1");
        appProps.put("key2", "value 2");
        appProps.put("key3", "value 3");
        return appProps.get(key);
    }
     
    @Test
    public void test(){
        MyAssertNotNullTest msnt = new MyAssertNotNullTest();
        assertNotNull(msnt.getPropValue("key1"));
    }
}
