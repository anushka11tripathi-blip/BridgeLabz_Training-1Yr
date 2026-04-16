import java.util.ArrayList;
import java.util.List;
class CollectionFrameworkPractice
{
	public static noid main (String args[])
	{ // upcasting
		List l = new ArrayList();
		List a = new LinkedList();
		List b = new Vector();
		List c = new Stack();
		l.add(1);
		l.add(2);
	    l.add(3);
		l.add(4);
		l.add("anu");
		l.add(7.888);
		System.out.println(l);
		ArrayList<String> a1 = new ArrayList<>();
		System.out.println("ArrayList:" +a1);
		a1.add("hi");
		a1.add("yo");
		a1.add("dum");
		a1.add("noiiii");
		a1.add("yooooos");
		a1.add("temku");
		for(int i = 0 ; i<=a1.size(); i++)
		{
			System.out.println(a1.get(i));
		}
		// using for each loop 
		for (String s: a1)
		{
			System.out.println(a1.get(s));
		}
		ArrayList<String> a2 = new ArrayList<>();
		a1.add("hh");
		a1.add("yy");
		a1.add("dd");
		a1.add("ii");
		a1.add("yooo");
		a1.add("temkuuu");
		System.out.println(a2);
		a1.addAll(a12);
		System.out.println("after adding:"+a1);				
	}
}
