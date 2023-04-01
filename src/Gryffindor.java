public class Gryffindor extends Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int distance;
    private int nobility;
    private int honor;
    private int bravery;


    public int getNobility() {
        return nobility;
    }

    public void setNobility(int nobility) {
        this.nobility = nobility;
    }

    public int getHonor() {
        return honor;
    }

    public void setHonor(int honor) {
        this.honor = honor;
    }

    public int getBravery() {
        return bravery;
    }

    public void setBravery(int bravery) {
        this.bravery = bravery;
    }

    public Gryffindor(String name, String surname, int power, int distance, int nobility, int honor, int bravery) {
        super(name, surname, power, distance);
        this.nobility = nobility;
        this.honor = honor;
        this.bravery = bravery;
    }
}
