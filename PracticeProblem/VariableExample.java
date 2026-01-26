class VariableExample{

int id= 10;//instance variable
String name="Anu";//instance variable
int rollno;
static int age=18;//static method
void display()//method {
String status="Active";//local variable 
system.out.println("Status; "+status);//printing statement
}

public static void main(String args[])//main method
{
	VariableExample var=new variableExample();
	var.display();
	var.rollno=20;
	System.out.println(age);
	
}
}