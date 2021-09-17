import java.util.Scanner;

public class Main {

    public static void main(String[] args){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc=new Scanner(System.in);
        System.out.println("enter first coordinate:");
        int x1=sc.nextInt();
        int y1=sc.nextInt();
        System.out.println("enter second coordinate:");
        int x2=sc.nextInt();
        int y2=sc.nextInt();
        float square_length_of_x=(float)(Math.pow((x2-x1),2));
        float square_length_of_y=(float)(Math.pow((y2-y1),2));
        double length_of_line=Math.sqrt(square_length_of_x+square_length_of_y);
        System.out.println("length of line:"+length_of_line);
    }
}






