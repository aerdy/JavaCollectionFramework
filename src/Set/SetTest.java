package Set;

import java.beans.Customizer;
import java.util.Set;
import java.util.HashSet;
import java.util.Iterator;

public class SetTest {
	public static void main(String[] args) {
		Set<Customizer> Customers = new HashSet<Customer>();
		Customer id1 = new Customer();
		id1.setId(1);
		Customers.add(id1);
		
		Customer id2= new Customer();
			id2.setId(2);
			Customers.add(id2);
		
			Customer c =new Customer ();
			c.setId(1);
			Customers.add(c);
			
			Iterator<Customer> i=Customers.getIterator();
			while(i.hasNext()){
				Customer current = i.next();
				System.out.println("Keranjang no " +current.hashcode() + "idnya :" + current.getId());
				
			}
			
		
		
	}

}
