import java.util.*;
public class leapyear {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the year\n");
        int year=sc.nextInt();
        if((year%4==0 && year%100!=0) ||(year%400==0)){
            System.out.println(" Given Year is leap year ");
        }
        else{
            System.out.println("Given year is not a leap yaer\n");
        }
    }
}
