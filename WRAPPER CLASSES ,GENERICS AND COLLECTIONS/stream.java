interface stringLength{
int findLength(String anu);
}
public class stream
{
	public static void main(String args[])
	{
		stringLength l =(String anu)-> anu.length();
		System.out.println(l.findLength("anushka"));
	}
}