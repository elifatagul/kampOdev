package �nterfaceAbstractsDemo.Concrete;

import �nterfaceAbstractsDemo.Abstract.CustomerCheckService;
import �nterfaceAbstractsDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
		
	}
	

}
