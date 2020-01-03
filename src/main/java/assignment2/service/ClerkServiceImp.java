package assignment2.service;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("Clerk")
public class ClerkServiceImp implements EmployeeService {

	@Override
	public int calculateSalary() {
		// TODO Auto-generated method stub
		return 35000;
	}

}
