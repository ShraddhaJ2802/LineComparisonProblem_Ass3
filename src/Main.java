import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Welcome in Line Comparison problem");
        Scanner sc=new Scanner(System.in);
        double LengthOfLine1, LengthOfLine2;
        System.out.println("Enter the first point of x1 line1");
        int x1= sc.nextInt();
        System.out.println("Enter the first point of y1 line1");
        int y1= sc.nextInt();
        System.out.println("Enter the second point x2 of line1");
        int x2= sc.nextInt();
        System.out.println("Enter the second point y2 of line1");
        int y2= sc.nextInt();
        LengthOfLine1=Math.sqrt(((x2-x1)^2) + ((y2-y1)^2));
        System.out.println("Length of line1 is:"+LengthOfLine1);

        System.out.println("Enter the first point of x3 line2");
        int x3= sc.nextInt();
        System.out.println("Enter the first point of y3 line2");
        int y3= sc.nextInt();
        System.out.println("Enter the second point x4 of line2");
        int x4= sc.nextInt();
        System.out.println("Enter the second point y4 of line2");
        int y4= sc.nextInt();

        LengthOfLine2=Math.sqrt(((x4-x3)^2) + ((y4-y3)^2));
        System.out.println("Length of line1 is:"+LengthOfLine2);

        Double line1=Double.valueOf(LengthOfLine1);
        Double line2=Double.valueOf(LengthOfLine2);
        boolean result=line2.equals(line1);

        if(result==true)
        {
            System.out.println("Lines are equals using equals method");
        }
        else
        {
            System.out.println("Lines are not equals using equals method");
        }


    }
}