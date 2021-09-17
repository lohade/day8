import java.util.Scanner;

public class Main {


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
        //find length of line
        double length_of_line1=Math.sqrt((double)(Math.pow((x2-x1),2))+(double) Math.pow((y2-y1),2));


        System.out.println("enter first coordinate of second line:");
        int x3=sc.nextInt();
        int y3=sc.nextInt();
        System.out.println("enter second coordinate of second line:");
        int x4=sc.nextInt();
        int y4=sc.nextInt();
        //find length of line2
        double length_of_line2=Math.sqrt((double)(Math.pow((x4-x3),2))+(double) Math.pow((y4-y3),2));




        System.out.println("length of line 1:"+length_of_line1);
        System.out.println("length of line 2:"+length_of_line2);
        //compare line of length
        if(length_of_line1==length_of_line2){
            System.out.println("length of Line is equal");

        }
        else{
            System.out.println("length of line is not equal");
        }


    }
}






