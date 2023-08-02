package fighterGame;

public class Main {


    public static void main(String[] args) {


        Fighter berkay = new Fighter("Berkay", 12, 80, 70, 60 );
        Fighter berkayCan = new Fighter("BerkayCan", 10, 90, 80, 50);

        Ring match = new Ring(berkay, berkayCan, 75, 95);

        match.fight();

    }
}
