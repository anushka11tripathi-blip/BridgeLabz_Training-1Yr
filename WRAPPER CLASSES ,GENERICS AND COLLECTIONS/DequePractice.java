import java.util.*;
class DequePractice
{
	public static void main (String args[])
{

Deque<Integer> q = new LinkedList<>();
q.addLast(1);
q.addFirst(13);
q.addLast(21);
q.addFirst(11);
q.offerLast(22);
q.offerFirst(33);

System.out.println(q);

q.pollLast();
System.out.println(q);
System.out.println(q.peekFirst());
}
}