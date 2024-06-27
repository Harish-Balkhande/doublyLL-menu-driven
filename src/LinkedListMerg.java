import java.util.List;
import java.util.LinkedList;

public class LinkedListMerg {

	public static void main(String[] args) {
		List<Integer> lst1 = new LinkedList<>();
		List<Integer> lst2 = new LinkedList<>();
//		List<Integer> lst3 = new LinkedList<>();
		
		//push data to lst1
		lst1.add(2);
		lst1.add(4);
		lst1.add(8);
				
		System.out.println("List 1 : "+lst1);
		
		lst2.add(6);
		lst2.add(3);
		lst2.add(9);
		System.out.println(lst2);
		
		int count=0;
		if(lst1.size()<lst2.size())
			count = lst1.size()+1;
		else
			count = lst2.size()+1;
		System.out.println(lst1.size()+1);
		System.out.println(count);
			
		int indx = 0;
		for(int i=1;i<lst1.size()+1;i+=2) {			
				lst1.add(i, lst2.get(indx));
				indx++;			
		}
		System.out.println("mergerd lsit : "+ lst1+" ");
//		Iterator<integer> itr2 = lst2.iterator();
//		
//		while( )
		
	}

}
