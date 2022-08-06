package Homework_week_10;

public class Do_while {
    public static void main(String[] args) {
        int i =0, k=20;
        do{
           // if (i %2==1) // to print odd numbers.
            if (i%2==0) // to print even numbers
               System.out.println(i);

            i++;
        } while (i<=20);
    }
}
