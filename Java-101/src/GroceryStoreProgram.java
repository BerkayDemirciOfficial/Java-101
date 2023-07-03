import java.util.Scanner;

public class GroceryStoreProgram {

    public static void main(String[] args) {

        double apple = 3.67, tomato = 1.11, banana = 0.95, pear = 2.14, aubergine = 5.0;

        double applekg, tomatokg, bananakg, pearkg, auberginekg;

        double appleprice, bananaprice, pearprice, aubergineprice, tomatoprice, total;

        Scanner inp = new Scanner(System.in);

        System.out.print("Tomato kg : ");
        tomatokg = inp.nextDouble();

        System.out.print("Apple kg : ");
        applekg = inp.nextDouble();

        System.out.print("Aubergine kg : ");
        auberginekg = inp.nextDouble();

        System.out.print("Pear kg : ");
        pearkg = inp.nextDouble();

        System.out.print("Banana kg : ");
        bananakg = inp.nextDouble();

        bananaprice = bananakg * banana;
        tomatoprice = tomatokg * tomato;
        pearprice = pearkg * pear;
        appleprice = applekg * apple;
        aubergineprice = auberginekg * aubergine;

        total = bananaprice + appleprice + aubergineprice + pearprice + tomatoprice;

        System.out.println("Tomato price is " + tomatoprice + " Tl");
        System.out.println("Apple price is " + appleprice + " Tl");
        System.out.println("Aubergine price is " + aubergineprice + " Tl");
        System.out.println("Pear price is " + pearprice + " Tl");
        System.out.println("Banana price is " + bananaprice + " Tl");

        System.out.println("Total : " + total+ "TL");


    }
}
