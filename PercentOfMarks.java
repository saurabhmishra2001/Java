import java.util.Scanner;
public class PercentOfMarks {
    public static void main(String[]args){
        Scanner Sc = new Scanner(System.in);        //This program calculates  the percentage of a student marks out of 100
        System.out.println("Enter the number of first Subject ");
        int s1=Sc.nextInt();
        System.out.println("Enter the number of Second Subject ");
        int s2=Sc.nextInt();
        System.out.println("Enter the number of Third Subject ");
        int s3=Sc.nextInt();
        System.out.println("Enter the number of Forth Subject ");
        int s4=Sc.nextInt();
        System.out.println("Enter the number of Fifth Subject ");
        int s5=Sc.nextInt();
        float sum=s1+s2+s3+s4+s5;
        System.out.print("The Total obtained marks is: ");
        System.out.println(sum);
        float percentage=(sum*100)/500;
        System.out.print("Obtained percentage is: ");
        System.out.println(percentage);
    }

}
