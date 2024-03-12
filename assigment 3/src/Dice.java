public class Dice {
    private final Die die1;
    private final Die die2;

    public Dice() {
        this.die1 = new Die();
        this.die2 = new Die();
    }

    public int getDie1Value() {
        return die1.getValue();
    }

    public int getDie2Value() {
        return die2.getValue();
    }

    public int getSum() {
        return getDie1Value() + getDie2Value();
    }

    public void roll() {
        die1.roll();
        die2.roll();
    }

    public void printRoll() {
        System.out.println("Die 1: " + getDie1Value());
        System.out.println("Die 2: " + getDie2Value());
        System.out.println("Total: " + getSum());
        if (getSum() == 7) {
            System.out.println("Craps!");
        } else if (getSum() == 2) {
            System.out.println("Snake eyes!");
        } else if (getSum() == 12) {
            System.out.println("Box cars!");
        }
    }
}
