import java.util.*;

class Replace {
    public static void main(String args[]) {
        int num = 10040;
        int new_num = 0;
        int place = 1;

        while (num > 0) {
            int d = num % 10;

            if (d == 0) {
                d = 1;
            }

            new_num = new_num + (d * place);
            place = place * 10;
            num = num / 10;
        }

        System.out.println("New number: " + new_num);
    }
}