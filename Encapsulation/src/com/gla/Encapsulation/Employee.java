abstract class Employee {
    private int id; private String name; private double base;
    public Employee(int i,String n,double b){id=i;name=n;base=b;}
    public abstract double calcSalary();
    public void show(){System.out.println(id+" "+name+" "+calcSalary());}
}
interface Dept{void setDept(String d);}
class FullTime extends Employee implements Dept{
    double bonus; String dept;
    FullTime(int i,String n,double b,double bn){super(i,n,b);bonus=bn;}
    public double calcSalary(){return super.base+bonus;}
    public void setDept(String d){dept=d;}
}
public class EmpMain{
    public static void main(String[]a){
        Employee e=new FullTime(1,"Anu",40000,5000);
        e.show();
    }
}
