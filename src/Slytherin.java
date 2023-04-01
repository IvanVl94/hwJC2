public class Slytherin extends Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int distance;
    private int cunning;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int thistForPower;

    public Slytherin(String name, String surname, int power, int distance, int cunning, int determination, int ambition, int resourcefulness, int thistForPower) {
        super(name, surname, power, distance);
        this.cunning = cunning;
        this.determination = determination;
        this.ambition = ambition;
        this.resourcefulness = resourcefulness;
        this.thistForPower = thistForPower;
    }

    public int getCunning() {
        return cunning;
    }

    public void setCunning(int cunning) {
        this.cunning = cunning;
    }

    public int getDetermination() {
        return determination;
    }

    public void setDetermination(int determination) {
        this.determination = determination;
    }

    public int getAmbition() {
        return ambition;
    }

    public void setAmbition(int ambition) {
        this.ambition = ambition;
    }

    public int getResourcefulness() {
        return resourcefulness;
    }

    public void setResourcefulness(int resourcefulness) {
        this.resourcefulness = resourcefulness;
    }

    public int getThistForPower() {
        return thistForPower;
    }

    public void setThistForPower(int thistForPower) {
        this.thistForPower = thistForPower;
    }
}
