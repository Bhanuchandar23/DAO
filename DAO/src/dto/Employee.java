package dto;

public class Employee {
	 private int id ;
	 private  String name;
	
	 private int salary;
	
	private String disgnation;
	 
	public Employee(int id, String name, String disgnation, int salary) {
		this.id = id;
		this.name = name;
		this.disgnation =  disgnation;
		this.salary = salary;
	}


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getDisgntion() {
		return  disgnation;
	}

	public void setDesigantion(String desigantion) {
		this.disgnation = desigantion;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}
	 

}
