class Person{
int x=10;
//parent constructor
Person(){
system.out.println("Person Constructor Called");
}
//parent method
void show (){
system.out.println("Person Method Called");
}
}
//child class
class Employee extends Person {
int x=20;// child variable
Employee() {

// Calling parent constructor
super();

// Access parent variable
System.out.println("Parent variable x = " + super.x);

// Calling parent method
super.show();

System.out.println("Employee Constructor Called");
}

public static void main(String[] args) {
Employee e = new Employee();
}
}
