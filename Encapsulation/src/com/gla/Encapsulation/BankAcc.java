abstract class BankAcc{
    private String name; double bal;
    BankAcc(String n,double b){name=n;bal=b;}
    abstract double interest();
}
interface Loan{void apply();}
class Saving extends BankAcc implements Loan{
    Saving(String n,double b){super(n,b);}
    public double interest(){return bal*0.05;}
    public void apply(){System.out.println("Loan applied");}
}
public class Bank{
    public static void main(String[]a){
        BankAcc a1=new Saving("Anu",1000);
        System.out.println(a1.interest());
    }
}
