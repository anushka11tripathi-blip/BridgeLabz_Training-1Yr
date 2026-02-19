abstract class Vehicle{
    private String no; double rate;
    Vehicle(String n,double r){no=n;rate=r;}
    abstract double cost(int d);
}
interface Insurable{double insurance();}
class Car extends Vehicle implements Insurable{
    Car(String n,double r){super(n,r);}
    public double cost(int d){return rate*d;}
    public double insurance(){return 150;}
}
public class Rent{
    public static void main(String[]a){
        Vehicle v=new Car("KA01",1000);
        System.out.println(v.cost(3)+((Insurable)v).insurance());
    }
}
