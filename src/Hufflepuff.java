public class Hufflepuff extends Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int distance;
    private int diligence;
    private int loyalty;
    private int honesty;

    public Hufflepuff(String name, String surname, int power, int distance, int diligence, int loyalty, int honesty) {
        super(name, surname, power, distance);
        this.diligence = diligence;
        this.loyalty = loyalty;
        this.honesty = honesty;
    }

    public int getDiligence() {
        return diligence;
    }

    public void setDiligence(int diligence) {
        this.diligence = diligence;
    }

    public int getLoyalty() {
        return loyalty;
    }

    public void setLoyalty(int loyalty) {
        this.loyalty = loyalty;
    }

    public int getHonesty() {
        return honesty;
    }

    public void setHonesty(int honesty) {
        this.honesty = honesty;
    }
}
