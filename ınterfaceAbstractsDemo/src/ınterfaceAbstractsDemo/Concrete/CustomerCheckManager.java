package ýnterfaceAbstractsDemo.Concrete;

import ýnterfaceAbstractsDemo.Abstract.CustomerCheckService;
import ýnterfaceAbstractsDemo.Entities.Customer;

public class CustomerCheckManager implements CustomerCheckService {

	@Override
	public boolean CheckIfRealPerson(Customer customer) {
		// TODO Auto-generated method stub
		return true;
		
	}
	

}
