import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first coordinate:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter second coordinate:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        double square_length_of_x=(double)((x2-x1)*(x2-x1));
        double square_length_of_y=(double)((y2-y1)*(y2-y1));
        double length_of_line=Math.sqrt(square_length_of_x-square_length_of_y);
        System.out.println(+length_of_line);



    }
}
