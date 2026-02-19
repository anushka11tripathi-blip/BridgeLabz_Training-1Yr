abstract class Ride{
    String d; double rate;
    Ride(String d,double r){this.d=d;rate=r;}
    abstract double fare(double km);
}
interface GPS{void update();}
class CarR extends Ride implements GPS{
    CarR(String d,double r){super(d,r);}
    public double fare(double km){return rate*km+20;}
    public void update(){System.out.println("Loc updated");}
}
public class RideApp{
    public static void main(String[]a){
        Ride r=new CarR("DriverA",50);
        System.out.println(r.fare(3));
    }
}
