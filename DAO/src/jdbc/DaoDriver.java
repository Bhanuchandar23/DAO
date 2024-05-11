package jdbc;
import dao.EmployeeDAOImpl;
import dto.Employee;

import java.util.List;
import java.util.Scanner;
public class DaoDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      EmployeeDAOImpl  impl = new EmployeeDAOImpl();
    //  get all objects from employee data base
  /*   List<Employee> employees = impl.getEmployees();
       
      
      
      for(Employee e:employees) {
    	  System.out.println(e);
      }*/
      
       Scanner  scan = new Scanner(System.in);
       System.out.println(" Enter the Employee Id to be retrive:");
       int id = scan.nextInt();
       Employee e  = impl.getEmployee( id);
       System.out.println(e);
       System.out.println("Enter the salary to be updated:");
       int newSalary = scan.nextInt();
       e.setSalary(newSalary);
       System.out.println(impl.upadateEmployee(e));
	}

}
