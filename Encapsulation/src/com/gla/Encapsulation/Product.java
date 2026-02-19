abstract class Product{
    private String name; double price;
    Product(String n,double p){name=n;price=p;}
    abstract double discount();
}
interface Taxable{double tax();}
class Electronics extends Product implements Taxable{
    Electronics(String n,double p){super(n,p);}
    public double discount(){return price*0.1;}
    public double tax(){return price*0.18;}
}
public class EComm{
    public static void main(String[]a){
        Product p=new Electronics("TV",30000);
        double f=p.price-p.discount()+((Taxable)p).tax();
        System.out.println("Final:"+f);
    }
}
