import java.util.Scanner;

public class Main {

    static void compareTo(double value1,double value2){
        if(value1>value2){
            System.out.println("length of first line is greater");
        }
        else if(value1<value2){
            System.out.println("length of second line is greater");
        }
        else{
            System.out.println("length of both line is equal");
        }
    }
    public static void main(String[] args) {
        // write your code here
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first coordinate of first line:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter second coordinate of first line:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double length_of_line1=Math.sqrt((double)(Math.pow((x2-x1),2))+(double) Math.pow((y2-y1),2));


        System.out.println("enter first coordinate of second line:");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        System.out.println("enter second coordinate of second line:");
        int x4=sc.nextInt();
        int y4=sc.nextInt();
        int length_of_line2=(int)Math.sqrt((Math.pow((x4-x3),2))+ Math.pow((y4-y3),2));

        //float length_of_line=Math.sqrt(square_length_of_x+square_length_of_y);


        System.out.println("length of line 1:"+length_of_line1);
        System.out.println("length of line 2:"+length_of_line2);

        System.out.println();
        compareTo(length_of_line1,length_of_line2);
        if(length_of_line1==length_of_line2){
            System.out.println("length of Line is equal");

        }
        else{
            System.out.println("length of line is not equal");
        }


    }
}





