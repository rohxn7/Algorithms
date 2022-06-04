import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
            int i=4;
            double d=4.0;
            String s="HackerRank";
            Scanner sc=new Scanner(System.in);
            int no1=sc.nextInt();
            System.out.println(i+no1);
            double no2=sc.nextDouble();
            System.out.println(d+no2);
            String st= sc.nextLine();
            st+=sc.nextLine();
            System.out.println(s+" "+st);
    }
}
