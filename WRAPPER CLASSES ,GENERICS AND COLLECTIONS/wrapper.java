class wrapper
{
	public static void main (String args[])
	{
		//autoboxing
	int m = 10;
	Integer n = m;// manual approach
	//Integer n = Integer.valueof(m);//compiler will run internally
	System.out.println("autoboxing :" +n);
	
	//unboxing
	Integer o = 5;
	int c = o;// manual approach
	//int c = ob.intvalue(); // compiler will run internally
	System.out.println("unboxing :" +b);
		
		
	//autoboxing
	float a = 10.0f;
	Float i = a;// manual approach
	//Float i = Float.valueof(a);//compiler will run internally
	System.out.println("autoboxing :" +i);
	
	//unboxing
	Float ob = 5.0f;
	float b = ob;// manual approach
	//float b = ob.floatvalue(); // compiler will run internally
	System.out.println("unboxing :" +b);
	
	//autoboxing
	double aa = 10.0;
	Double ii = aa;// manual approach
	//Double ii = Double.valueof(aa);//compiler will run internally
	System.out.println("autoboxing :" +ii);
	//unboxing
	Double obj = 5.0;
	double bb = obj;// manual approach
	//double bb = obj.doublevalue(); // compiler will run internally
	System.out.println("unboxing :" +bb);
	
	//autoboxing
	boolean ai = true;
	Boolean ia = ai;// manual approach
	//Boolean ia = Boolean.valueof(ai);//compiler will run internally
	System.out.println("autoboxing :" +ia);
	//unboxing
	Boolean obbb = false;
	boolean baa = obbb;// manual approach
	//boolean baa = obbb.booleanvalue(); // compiler will run internally
	System.out.println("unboxing :" +baa);
}
}
