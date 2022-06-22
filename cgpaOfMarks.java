import java.util.Scanner;
public class cgpaOfMarks {
    public static void main(String[]args){
        Scanner Sc=new Scanner(System.in);
        System.out.println("Enter the obtained marks out of 100");
        int s1=Sc.nextInt();
        System.out.println("Enter the obtained marks out of 100");
        int s2=Sc.nextInt();
        System.out.println("Enter the obtained marks out of 100");
        int s3=Sc.nextInt();
        float marks=s1+s2+s3;
        float percentage=(marks*100)/300;
        double cgpa =(percentage/9.5);
        System.out.println("The Obtained Cgpa is: "+cgpa);
    }
}
