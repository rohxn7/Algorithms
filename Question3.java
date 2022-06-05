import java.sql.SQLOutput;
import java.util.Scanner;

public class Question3 {

    public static void main(String[] args) {
        double meal_cost;
        int tip_percent,tax_percent,total_cost;
        double tip,tax;
        Scanner sc=new Scanner(System.in);
        meal_cost=sc.nextDouble();
        tip_percent= sc.nextInt();
        tax_percent= sc.nextInt();
        tip=((double) tip_percent/100)*(double)meal_cost;
        tax=((double) tax_percent/100)*(double)meal_cost;
        total_cost= (int)(meal_cost+tax+tip);
        System.out.println(total_cost);
    }
}
