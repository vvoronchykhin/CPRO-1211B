public class Die {
    private int value;

    public Die() {
        this.value = 0;
    }

    public void roll() {
        this.value = (int) (Math.random() * 6) + 1;
    }

    public int getValue() {
        return value;
    }
}
