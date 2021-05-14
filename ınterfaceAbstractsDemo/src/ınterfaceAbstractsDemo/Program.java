package �nterfaceAbstractsDemo;

import adapters.MernisServiceAdapter;
import �nterfaceAbstractsDemo.Abstract.BaseCustomerManager;
import �nterfaceAbstractsDemo.Concrete.NeroCustomerManager;
import �nterfaceAbstractsDemo.Concrete.StarbucksCustomerManager;
import �nterfaceAbstractsDemo.Entities.Customer;

public class Program {

	public static void main(String[] args) {
		
		
	     BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		 Customer customer1 = new Customer(1,"EL�F","ATAG�L",2001,"899786765667");
		 customerManager.save(customer1);
		 Customer customer2 = new Customer(2,"�rem Nur","Ceylan",2000,"89674512349");
		 customerManager.save(customer2);
		 Customer customer3 = new Customer(3,"Engin","Demiro�",1985,"28861499108");
		 customerManager.save(customer3);
		

	}

}
