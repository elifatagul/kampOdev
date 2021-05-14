package ýnterfaceAbstractsDemo;

import adapters.MernisServiceAdapter;
import ýnterfaceAbstractsDemo.Abstract.BaseCustomerManager;
import ýnterfaceAbstractsDemo.Concrete.NeroCustomerManager;
import ýnterfaceAbstractsDemo.Concrete.StarbucksCustomerManager;
import ýnterfaceAbstractsDemo.Entities.Customer;

public class Program {

	public static void main(String[] args) {
		
		
	     BaseCustomerManager customerManager = new StarbucksCustomerManager(new MernisServiceAdapter());
		 Customer customer1 = new Customer(1,"ELÝF","ATAGÜL",2001,"899786765667");
		 customerManager.save(customer1);
		 Customer customer2 = new Customer(2,"Ýrem Nur","Ceylan",2000,"89674512349");
		 customerManager.save(customer2);
		 Customer customer3 = new Customer(3,"Engin","Demiroð",1985,"28861499108");
		 customerManager.save(customer3);
		

	}

}
