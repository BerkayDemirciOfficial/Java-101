import java.util.Scanner;

public class TheAreaOfATriangle {

    public static void main(String[] args) {

        double edge1, edge2, edge3, u, area;

        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Edge 1 : ");
        edge1 = inp.nextDouble();

        System.out.print("Enter Edge 2 : ");
        edge2 = inp.nextDouble();

        System.out.print("Enter Edge 3 : ");
        edge3 = inp.nextDouble();

        u = (edge1 + edge2 + edge3) / 2;

        area = Math.sqrt(u * (u - edge1) * (u - edge2) * (u - edge3)) ;

        System.out.print("The area of a Triangle : " + area);

    }
}
