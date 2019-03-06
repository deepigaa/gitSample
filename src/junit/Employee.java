package junit;

import java.util.ArrayList;
import java.util.List;

public class Employee {
	private String name;
    private int empId;
    private int salary;
     
    public Employee(int id, String name, int sal){
        this.empId = id;
        this.name = name;
        this.salary = sal;
    }
    
    //getters and setters
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public int getEmpId() {
        return empId;
    }
    public void setEmpId(int empId) {
        this.empId = empId;
    }
    public int getSalary() {
        return salary;
    }
    public void setSalary(int salary) {
        this.salary = salary;
    }
  //overriding equals() and hashcode()
    public boolean equals(Object obj){
    	boolean status=false;
    	if(obj instanceof Employee){
    		Employee emp = (Employee)obj;
    		if((this.name.equalsIgnoreCase(emp.name))&& (this.empId==emp.empId)&&(this.salary==emp.salary)){
    			status=true;
    		}
    	}
    	return status;
    }
    
    //override hashcode()
    public int hashcode(){
    	return this.empId;
    }
    
    //return list of employees
    public static List<Employee> getEmpList(){
    	List<Employee> emps = new ArrayList<Employee>();
    	emps.add(new Employee(1, "Nats", 15000));
        emps.add(new Employee(2, "Kalid", 25000));
        emps.add(new Employee(3, "Krish", 5000));
        return emps;

    }
    
    //test this method
    public static String getEmpNameWithHighestSalary(){
    	/*
    	 * logic to return employee to return the employeename with highest paid salary
    	 */
    	return "Nattu";
    }
    
    //test this method
    public static Employee getHighestPaidEmployee(){
        /**
         * hiding logic to get highest paid employee
         */
        return new Employee(1, "Nattu", 15000);
    }

    	
}
