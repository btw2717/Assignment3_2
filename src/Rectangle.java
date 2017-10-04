import java.util.Scanner;

/**
 * The Rectangle class computes the area and perimeter of a rectangle given user-entered length and height.
 * Created 03OCT2017
 * email: email
 * @author Sapper
 * @version 1.0
 */

public class Rectangle {

    /**
     * The main() method creates a keyboard scanner to read user input and stores it in variables which
     * are manipulated into computing perimeter and area.
     * @param args passing command line arguments to application
     */

    public static void main(String[] args) {

        Scanner keyboard = new Scanner(System.in);

        System.out.println("Hello! I will compute the area and perimeter of a rectangle for you.");
        System.out.println("Please enter the Height of your rectangle.");
        double height = keyboard.nextDouble();

        System.out.println("Please enter the Length of your rectangle.");
        double length = keyboard.nextDouble();

        double perimeter = (2 * length) + (2 * height);
        int neatPerimeter = (int)perimeter;
        double area = length * height;
        int neatArea = (int)area;

        System.out.println("Great!\n" +
                "The Area of your rectangle is: " + neatArea + "\nThe Perimeter of your rectangle is: " + neatPerimeter);


    }
}

