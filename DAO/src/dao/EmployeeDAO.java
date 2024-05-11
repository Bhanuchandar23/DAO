package dao;
import java.util.List;
import dto.Employee;

public interface EmployeeDAO {
	List getEmployees();
	Employee getEmployee(int id);
	boolean  insertEmployee(int id,String name,String designation,int salary);
	boolean upadateEmployee(Employee e);
	boolean deleteEmployee(int id);
	

}
