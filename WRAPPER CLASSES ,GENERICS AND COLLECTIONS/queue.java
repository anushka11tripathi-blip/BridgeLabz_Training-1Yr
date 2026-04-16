import java.util.*;
class QueuePractice
{
	public static void main (String args[])
{

Queue<Integer> q = new LinkedList<>();
q.add(1);
q.add(11);
q.add(111);
q.add(1111);
q.offer(22);
q.offer(33);

System.out.println(q);

System.out.println(q.peek());
System.out.println(q.element());

q.remove(1);
q.poll();
System.out.println(q);
System.out.println(q.contains(11));
}
}