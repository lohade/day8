import java.util.Scanner;

public class Main {
    int x1,y1,x2,y2,x3,y3,x4,y4;
    double line1, line2;
    Scanner sc = new Scanner(System.in);
    public static void welcome(){
        System.out.println("......Welcome to Line Comparison Computation Program using OOPS...");
    }

    public double lengthOfLine1(){
        System.out.println("enter first coordinate of first line:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter second coordinate of first line:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length_of_line1=Math.sqrt((double)(Math.pow((x2-x1),2))+(double) Math.pow((y2-y1),2));
        System.out.println("length of line 1:"+length_of_line1);
        return length_of_line1;

    }

    public double lengthofline2(){
        System.out.println("enter first coordinate of second line:");
         x3=sc.nextInt();
         y3=sc.nextInt();
        System.out.println("enter second coordinate of second line:");
        x4=sc.nextInt();
        y4=sc.nextInt();
        double length_of_line2=Math.sqrt((double)(Math.pow((x4-x3),2))+(double) Math.pow((y4-y3),2));
        System.out.println("length of line 2:"+length_of_line2);
        return length_of_line2;

    }
    double length1=lengthOfLine1();
    double length2=lengthofline2();
    public void equalTo(){
        if(length1==length2){
            System.out.println("length of Line is equal");

        }
        else{
            System.out.println("length of line is not equal");
        }

    }

    public void compareTo(){
        if( length1>length2){
            System.out.println("length of first line is greater");
        }
        else if(length1<length2){
            System.out.println("length of second line is greater");
        }
        else{
            System.out.println("length of both line is equal");
        }
    }
    public static void main(String[] args) {
	// write your code here
        welcome();
        Main line=new Main();
        line.equalTo();
        line.compareTo();





    }
}
