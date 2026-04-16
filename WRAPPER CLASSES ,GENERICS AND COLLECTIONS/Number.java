class Number<T> {
    T num;

    void setNumber(T num) {
        this.num = num;
    }

    T getNumber() {
        return num;
    }
}
    public class GenericPractice {
        public static <T> void swap(T a,T b ) {
        System.out.println("before swaping :"+a+""+b);
        T temp = a;
        a = b;
        b = temp;
        System.out.println("After swaping :"+a+""+b);
    }
    public static void main(String[] args) {
        swap(11,12);
        swap("himasnhu","Dixit");
        Number<Integer>n1= new Number<>();
        n1.setNumber(23);
        System.out.println(n1.getNumber());
       
         Number<String>n2= new Number<>();
        n2.setNumber("himanshu");
        System.out.println(n2.getNumber());
       
        Number<Double>n3= new Number<>();
        n3.setNumber(10.599);
        System.out.println(n3.getNumber());
    }
    }