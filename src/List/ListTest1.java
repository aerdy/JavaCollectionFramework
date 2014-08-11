package List;

import java.util.ArrayList;
import java.util.List;

public class ListTest1 {
	public static void main(String[] args) {
		List<String> list = new ArrayList<String>();
		//List<String> list = new ArrayList<String>();
		list.add("a");
		list.add("b");
		list.add("C");
		list.add("d");
		list.add("e");
		list.add("f");
		list.add("g");
		System.out.println("isi dari list ");
		for(int i=0;i<list.size();i++){
			System.out.println("Data ke"+i + ":"+list.get(i));
		}
		// list.size disana merupakan sebuah berapa jumlah data list yang dimasukan
		
	}

}
