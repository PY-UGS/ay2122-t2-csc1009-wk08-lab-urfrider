import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		try (Scanner sc = new Scanner(System.in)){
			CircleWithException circle = new CircleWithException();
			System.out.print("Radius of the circle: ");
			double radius = sc.nextDouble();
			circle.setRadius(radius);
			System.out.println("The radius of the circle is " + circle.getRadius());
			System.out.println("The area of the circle is " + circle.getArea());
			System.out.println("The diameter of the circle is " + circle.getDiameter());
		}catch(IllegalArgumentException e){
			System.out.println(e.getMessage());
		}catch(Exception e){
			System.out.println(e.getMessage());
		}
	}

}
