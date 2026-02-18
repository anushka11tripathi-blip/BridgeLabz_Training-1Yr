class ConstructorDemo{
int id ;
string name;
int age;
//default constructor
public ConstructorDemo()
{
system.out.println("constructor program");
}
public ConstructorDemo(int id, String name, int age){
this.id=id;
this name=name;
this.age=age;
}
void display()
{
public static void main (String[] args){
ConstructorDemo cd= new ConstructorDemo(id:1, name:"ANU",age:19);
system.out.println(cd);
cd.display();
}
}
