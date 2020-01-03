package assignment2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Manager")
public class ManagerServiceImp implements EmployeeService{

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 60000;
	}

}
