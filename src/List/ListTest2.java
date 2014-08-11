package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest2 {
	public static void main(String[] args) {
		List<Long>  angka= new ArrayList<Long>();
		
		angka.add(30L);
		angka.add(44L);
		System.out.println("hasilnya ");
		
		for(int a=0; a<angka.size();a++){
			System.out.println("hasil" + angka.get(a));
		}
		
	}
	
}
