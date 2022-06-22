import java.util.*;
public class kmToMiles {
    public static void main(String[]args){
        // This program will convert the Kilometer into Miles
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the distance into kilometer");
        int distance=sc.nextInt();
        double miles=distance*0.6213;
        System.out.println("The distance in Miles is: "+miles);
    }
}
