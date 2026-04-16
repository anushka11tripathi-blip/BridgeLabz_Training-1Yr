import java.util.*;
class Remove_Duplicate
{
	public static void main(String args[])
	{
		ArrayList<Integer> al = new ArrayList<>();
		al.add(2);
	al.add(1);
	al.add(2);
	al.add(3);
	al.add(5);
	al.add(3);
	al.add(7);
	System.out.println(al);
	HashSet<Integer> hs = new HashSet<>(al);
	System.out.println(hs);
	}
}
