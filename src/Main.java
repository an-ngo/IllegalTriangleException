import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input 3 side of triangle: ");
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        try{
            Triangle triangle = new Triangle(a, b, c);
        }
        catch(IllegalTriangleException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }
}
