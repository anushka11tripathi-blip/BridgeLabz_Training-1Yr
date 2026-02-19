abstract class Item{
    String t; Item(String t){this.t=t;}
    abstract int loan();
}
interface Reserve{boolean avail();}
class Book extends Item implements Reserve{
    Book(String t){super(t);}
    public int loan(){return 14;}
    public boolean avail(){return true;}
}
public class Library{
    public static void main(String[]a){
        Item i=new Book("Java");
        System.out.println(i.t+" "+i.loan());
    }
}
