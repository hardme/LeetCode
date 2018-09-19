package master.other;

import java.util.ArrayList;
import java.util.List;

public class Test {
	public static void main(String[] args) {
		Father c = new Children();
		c.setName("111");
		List<Father> list = new ArrayList<>();
		List<Object> list1 = new ArrayList<>();
		list.add(c);
		//c.setAge(11);
//		c.setName("1111");
		for(Father f:list) {
			Object o = (Object)f;
			list1.add(o);
			Father d = (Father)o;
			System.out.println(d.getName());
		}
		for( Object o:list1 ) {
			Father f =(Father)o;
			System.out.println(f.getName());
		}
		//List<Object> ll = (List<Object>)list; 
//		System.out.println(c.getName());
//		conver(c);
	}
	public static void conver(Father f) {
		
	}
}
