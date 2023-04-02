public class Hogwarts {
    private String name;
    private String surname;
    private int power;
    private int distance;
    private int sum;

    public Hogwarts(String name, String surname, int power, int distance) {
        this.name = name;
        this.surname = surname;
        this.power = power;
        this.distance = distance;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public int getSum() {
        return getDistance() + getPower();
    }
    public static void contrast (Hogwarts student1, Hogwarts student2 ){
        int student1Sum = student1.getSum();
        int student2Sum = student2.getSum();
        if (student2Sum < student1Sum) {
            System.out.println(student1.getName() + " " + student1.getSurname() + " обладает большей силой, чем "
                    + student2.getName() + " " + student2.getSurname());
        } else if ( student2Sum > student1Sum) {
            System.out.println(student2.getName() + " " + student2.getSurname() + " обладает большей силой, чем "
                    + student1.getName() + " " + student1.getSurname());
        }else {
            System.out.println(student2.getName() + " " + student2.getSurname()  + " и "+ student1.getName() + " "
                    + student1.getSurname() + " обладают одинаковой силой.");
        }

    }

}
