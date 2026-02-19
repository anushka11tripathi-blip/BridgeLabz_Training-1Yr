abstract class Food{
    String name; double price; int q;
    Food(String n,double p,int q){name=n;price=p;this.q=q;}
    abstract double total();
}
interface Discount{double off();}
class Veg extends Food implements Discount{
    Veg(String n,double p,int q){super(n,p,q);}
    public double total(){return price*q-off();}
    public double off(){return price*q*0.1;}
}
public class FoodApp{
    public static void main(String[]a){
        Food f=new Veg("Paneer",50,2);
        System.out.println(f.total());
    }
}
