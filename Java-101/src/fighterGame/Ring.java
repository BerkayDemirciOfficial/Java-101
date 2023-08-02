package fighterGame;

public class Ring {

    Fighter fighter1;
    Fighter fighter2;
    int minimumWeight;
    int maximumWeight;


    Ring(Fighter fighter1, Fighter fighter2, int minimumWeight, int maximumWeight) {

        this.fighter1 = fighter1;
        this.fighter2 = fighter2;
        this.minimumWeight = minimumWeight;
        this.maximumWeight = maximumWeight;
    }

    void fight() {

        if (isControl()) {

            if (isRandomStart()) {

                while (fighter1.health > 0 && fighter2.health > 0) {


                    this.fighter2.health = this.fighter1.beat(this.fighter2);
                    System.out.println(this.fighter2.name + " health " + this.fighter2.health);

                    if (isWin()) {
                        break;
                    }

                    this.fighter1.health = this.fighter2.beat(this.fighter1);
                    System.out.println(this.fighter1.name + " health " + this.fighter1.health);

                    if (isWin()) {
                        break;

                    }

                }

            } else {

                while (fighter1.health > 0 && fighter2.health > 0) {


                    this.fighter1.health = this.fighter2.beat(this.fighter1);
                    System.out.println(this.fighter1.name + " health " + this.fighter1.health);

                    if (isWin()) {
                        break;
                    }

                    this.fighter2.health = this.fighter1.beat(this.fighter2);
                    System.out.println(this.fighter2.name + " health " + this.fighter2.health);

                    if (isWin()) {
                        break;

                    }

                }
            }
            System.out.println(this.fighter1.name + " health " + this.fighter1.health);
            System.out.println(this.fighter2.name + " health " + this.fighter2.health);


        } else {
            System.out.println("The weights do not match. ");

        }

    }


    boolean isControl() {
        return (this.fighter1.weight >= minimumWeight && this.fighter1.weight <= maximumWeight) && (this.fighter2.weight >= minimumWeight && this.fighter2.weight <= maximumWeight);
    }


    boolean isWin() {

        if (this.fighter1.health == 0) {
            System.out.println(this.fighter2.name + " won !!!");
            return true;
        }
        if (this.fighter2.health == 0) {
            System.out.println(this.fighter1.name + " won !!!");
            return true;
        }
        return false;
    }

    boolean isRandomStart() {
        double randomStartValue = Math.random();

        if (randomStartValue <= 0.5) {
            return true;
        } else {
            return false;
        }

    }
}



