import java.util.Scanner;

public class question7 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the lenght of hexagon");
        double x=sc.nextDouble();
        double Area=(x*x*3*Math.sqrt(3))/2;
        System.out.println("the area of the hexagon"+Area);
       
	}

}

