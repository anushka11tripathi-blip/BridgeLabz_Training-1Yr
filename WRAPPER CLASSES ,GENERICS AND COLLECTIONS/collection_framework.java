import java.util.*;
class collection_framework
{
public static void main (String args[])
{

LinkedList<Integer> ll = new LinkedList<>();
Vector<Boolean> vector = new Vector<>();
Stack<Integer> st = new Stack<>();

//Stack
System.out.println("........stack.........");
st.push(10);  // inserting elements from below in stack
st.push(20);
st.push(30);
st.push(40);
System.out.println(st);
st.pop(); // removing top most element
System.out.println(st);
System.out.println(st.peek());  // top most element
System.out.println(st.size());   // size of stack
System.out.println(st.isEmpty());  // checks if the stack is empty or not

//linklist
System.out.println(".......linklist.......");
ll.add(1);  // adding elements in linklist
ll.add(2);
ll.add(3);
ll.add(4);
System.out.println(ll);
ll.set(0,90);  // updating element at 0 index by 90
System.out.println(ll);
LinkedList<Integer> l = new LinkedList<>();
l.add(11);
l.add(22);
l.add(33);
ll.addAll(l); // merging or adding lint 11 and list 1
System.out.println(ll);

}
}