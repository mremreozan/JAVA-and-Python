  We’ll start modeling an HR system. The example will demonstrate the use of inheritance 
and how derived classes can provide a concrete implementation of the base class interface.

  The HR system needs to process payroll for the company’s employees, but there are different 
types of employees depending on how their payroll is calculated.

   The ProductivitySystem tracks productivity based on employee roles. 
There are different employee roles:

	Managers: They walk around yelling at people telling them what to do. They are salaried 
		employees and make more money.
	Secretaries: They do all the paper work for managers and ensure that everything gets 
		billed and payed on time. They are also salaried employees but make less money.
	Sales employees: They make a lot of phone calls to sell products. They have a salary, 
		but they also get commissions for sales.
	Factory workers: They manufacture the products for the company. They are paid by the hour.


   The Employee classes are used by two different systems:
	The productivity system that tracks employee productivity.
	The payroll system that calculates the employee payroll.

   The PayrollSystem keeps an internal database of payroll policies for each employee. 
It exposes a .get_policy() that, given an employee id, returns its payroll policy. 
If a specified id doesn’t exist in the system, then the method raises a ValueError exception.
The implementation of .calculate_payroll() takes a list of employees, calculates the payroll, 
and prints the results.

  The AddressBook class keeps an internal database of Address objects for each employee. 
It exposes a get_employee_address() method that returns the address of the specified employee id. 
If the employee id doesn’t exist, then it raises a ValueError. The class manages the address 
components and provides a pretty representation of an address.


   The EmployeeDatabase keeps track of all the employees in the company. For each employee, 
it tracks the id, name, and role. It has an instance of the ProductivitySystem, the PayrollSystem, 
and the AddressBook. These instances are used to create employees.

   There is a single Employee that is composed of other data objects like Address and depends on 
the IRole and IPayrollCalculator interfaces to delegate the work. There are multiple implementations 
of these interfaces.

   This design is what is called policy-based design, where classes are composed of policies, 
and they delegate to those policies to do the work.

