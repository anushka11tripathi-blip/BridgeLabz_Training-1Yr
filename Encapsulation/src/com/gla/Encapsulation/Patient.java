abstract class Patient{
    String id; Patient(String i){id=i;}
    abstract double bill();
}
interface Record{void add();}
class InP extends Patient implements Record{
    InP(String i){super(i);}
    public double bill(){return 2000;}
    public void add(){System.out.println("Added");}
}
public class Hosp{
    public static void main(String[]a){
        Patient p=new InP("P1");
        System.out.println(p.bill());
    }
}
