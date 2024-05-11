# DAO
Steps to implement DAO Design Pattern: 

1. Create a Data Transfer Object class[DTO class] :

     DTO class is a POJO [Plain Old Java Object] class, which contains instance    variables and getters and setters and the responsibility of this class is to  create objects of the Entities present in our table.



2. Create a DAO interface and implement the interface :

DAO class is a class through which we can perform operations on the table like selecting all the employee details or fetching one employee information, etc., So we will create a interface EmployeeDAO which contains abstract methods like getEmp(), insertEmployee(id, name, designation, salary),  etc., and this interface will be implemented by another class called as EmployeeDAOImpl and this class implements all the methods of EmployeeDAO interface and gives its implementation by overriding it



3. Create a ConnectorFactory class:

Connector class is used to get a connection to our database. So the connector class has to establish the connection and return the reference con so that we can perform CRUD operations on the table. 



Steps to implement DAO Design Pattern: 

1. Create a Data Transfer Object class[DTO class] :

     DTO class is a POJO [Plain Old Java Object] class, which contains instance    variables and getters and setters and the responsibility of this class is to  create objects of the Entities present in our table.



2. Create a DAO interface and implement the interface :

DAO class is a class through which we can perform operations on the table like selecting all the employee details or fetching one employee information, etc., So we will create a interface EmployeeDAO which contains abstract methods like getEmp(), insertEmployee(id, name, designation, salary),  etc., and this interface will be implemented by another class called as EmployeeDAOImpl and this class implements all the methods of EmployeeDAO interface and gives its implementation by overriding it



3. Create a ConnectorFactory class:

Connector class is used to get a connection to our database. So the connector class has to establish the connection and return the reference con so that we can perform CRUD operations on the table. 



Steps to implement DAO Design Pattern: 

1. Create a Data Transfer Object class[DTO class] :

     DTO class is a POJO [Plain Old Java Object] class, which contains instance    variables and getters and setters and the responsibility of this class is to  create objects of the Entities present in our table.



2. Create a DAO interface and implement the interface :

DAO class is a class through which we can perform operations on the table like selecting all the employee details or fetching one employee information, etc., So we will create a interface EmployeeDAO which contains abstract methods like getEmp(), insertEmployee(id, name, designation, salary),  etc., and this interface will be implemented by another class called as EmployeeDAOImpl and this class implements all the methods of EmployeeDAO interface and gives its implementation by overriding it



3. Create a ConnectorFactory class:

Connector class is used to get a connection to our database. So the connector class has to establish the connection and return the reference con so that we can perform CRUD operations on the table. 



Advantages of using DAO Design Pattern:
1. Since we have separated Database Details[ConnectorFactory class] and Database
Operations[EmployeeDAOImpl class] into separate classes, maintainability
becomes very easy. Let us assume that we want to change from MySQL
database to Oracle Database, then the only place where we have to do changes
is in the ConnectorFactory class
2. Similarly, if we have to change the database-related operations in the database
then we just have to do changes in EmployeeDAOImpl class, and this makes our
code flexible
