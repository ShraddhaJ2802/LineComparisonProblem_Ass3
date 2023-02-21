import java.util.Scanner;

public class Main {


    public double calculateLength(int x1 , int x2 ,int y1 , int y2)
    {
        double LengthOfLine;
        LengthOfLine=Math.sqrt(((x2-x1)^2) + ((y2-y1)^2));
        return LengthOfLine;
    }

    public void linesEqual( Double line1 , Double line2) {
        boolean result = line2.equals(line1);

        if (result == true) {
            System.out.println("Lines are equals using equals method");
        } else {
            System.out.println("Lines are not equals using equals method");
        }
    }

    public void linesCompare( Double line1 , Double line2) {
        int compareValue = line2.compareTo(line1);
        if (compareValue > 0) {
            System.out.println("Line 2 is greater than line 1");
        } else if (compareValue < 0) {
            System.out.println("Line2 is less than line 1");
        } else {
            System.out.println("Lines are equals");
        }
    }
    public static void main(String[] args) {
        System.out.println("Welcome in Line Comparison problem");
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter the first point of x1 line1");
        int x1= sc.nextInt();
        System.out.println("Enter the first point of y1 line1");
        int y1= sc.nextInt();
        System.out.println("Enter the second point x2 of line1");
        int x2= sc.nextInt();
        System.out.println("Enter the second point y2 of line1");
        int y2= sc.nextInt();

        Main line=new Main();
       double LengthOfLine1=line.calculateLength(x1 , x2 , y1 , y2);

        System.out.println("Length of line1 is:"+LengthOfLine1);

        System.out.println("Enter the first point of x3 line2");
        int x3= sc.nextInt();
        System.out.println("Enter the first point of y3 line2");
        int y3= sc.nextInt();
        System.out.println("Enter the second point x4 of line2");
        int x4= sc.nextInt();
        System.out.println("Enter the second point y4 of line2");
        int y4= sc.nextInt();

        double LengthOfLine2= line.calculateLength(x1 , x2 , y1 , y2);
        System.out.println("Length of line1 is:"+LengthOfLine2);

        Double line1=Double.valueOf(LengthOfLine1);
        Double line2=Double.valueOf(LengthOfLine2);
        line.linesEqual(line1 , line2);
        line.linesCompare(line1 , line2);

        //CompareTo method
       /* int compareValue=line2.compareTo(line1);
        if(compareValue > 0)
        {
            System.out.println("Line 2 is greater than line 1");
        } else if (compareValue < 0) {
            System.out.println("Line2 is less than line 1");
        }
        else
        {
            System.out.println("Lines are equals");
        }*/
    }
}