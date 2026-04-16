import java.util.*;
class SetPractice
{
	public static void main (String args[])
{
	
HashSet<Integer> hs = new HashSet<>();
hs.add(10);
hs.add(20);
hs.add(30);
hs.add(10);
hs.add(40);
hs.add(50);
System.out.println("HASHHHHHHSETTT");
System.out.println(hs);

LinkedHashSet<Integer> lhs = new LinkedHashSet<>();
lhs.add(10);
lhs.add(20);
lhs.add(30);
lhs.add(10);
lhs.add(40);
lhs.add(50);
System.out.println("linkedHASHSET");
System.out.println(lhs);
TreeSet<Integer> ts = new TreeSet<>();
ts.add(10);
ts.add(20);
ts.add(30);
ts.add(10);
ts.add(40);
ts.add(50);
System.out.println("treeset");
System.out.println(ts);

}
}
