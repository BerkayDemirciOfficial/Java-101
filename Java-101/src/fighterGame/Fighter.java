package fighterGame;

public class Fighter {

    String name;
    int damage;
    int weight;
    int health;
    int blocked;


    Fighter(String name, int damage, int weight, int health, int blocked) {
        this.name = name;
        this.damage = damage;
        this.weight = weight;
        this.health = health;
        this.blocked = blocked;
    }

    int beat(Fighter opponent) {
        System.out.println(this.name + " fighter damage " + this.damage + " to " + opponent.name);


        if (opponent.isBlocked()) {
            System.out.println(opponent.name + " blocked the attack. ");
        }

        if (opponent.health - this.damage < 0) {
            return 0;
        }

        return opponent.health - this.damage;
    }


    boolean isBlocked() {

        double randomValue = Math.random() * 100;
        return randomValue <= blocked;
    }



}
