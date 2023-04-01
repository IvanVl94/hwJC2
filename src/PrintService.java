public class PrintService {

    public static void print(Gryffindor[] gryffindors) {
        System.out.println("Гриффиндор");
        for (int i = 0; i < gryffindors.length; i++) {
            Gryffindor gryffindor = gryffindors[i];
            System.out.println("Имя " + gryffindor.getName()
                    + " Фамилия " + gryffindor.getSurname()
                    + " Мощность " + gryffindor.getPower()
                    + " Расстояние трансгрессии " + gryffindor.getDistance()
                    + " Благородство " + gryffindor.getNobility()
                    + " Честь " + gryffindor.getHonor()
                    + " Храбрость " + gryffindor.getBravery());
        }
    }

    public static void print(Slytherin[] slytherins) {
        System.out.println("Слизерин");
        for (int i = 0; i < slytherins.length; i++) {
            Slytherin slytherin = slytherins[i];
            System.out.println("Имя " + slytherin.getName()
                    + " Фамилия " + slytherin.getSurname()
                    + " Мощность " + slytherin.getPower()
                    + " Расстояние трансгрессии " + slytherin.getDistance()
                    + " Хитрость " + slytherin.getCunning()
                    + " Решительность " + slytherin.getDetermination()
                    + " Амбициозность " + slytherin.getAmbition()
                    + " Находчивость " + slytherin.getResourcefulness()
                    + " Жажда власти " + slytherin.getThistForPower());
        }
    }
    public static void print(Hufflepuff[] hufflepuffs) {
        System.out.println("Пуффендуй");
        for (int i = 0; i < hufflepuffs.length; i++) {
            Hufflepuff hufflepuff = hufflepuffs[i];
            System.out.println("Имя " + hufflepuff.getName()
                    + " Фамилия " + hufflepuff.getSurname()
                    + " Мощность " + hufflepuff.getPower()
                    + " Расстояние трансгрессии " + hufflepuff.getDistance()
                    + " Трудолюбивость " + hufflepuff.getDiligence()
                    + " Верность " + hufflepuff.getLoyalty()
                    + " Честность " + hufflepuff.getHonesty());
        }
    }
    public static void print(Ravenclaw[] ravenclaws) {
        System.out.println("Когтевран");
        for (int i = 0; i < ravenclaws.length; i++) {
            Ravenclaw ravenclaw = ravenclaws[i];
            System.out.println("Имя " + ravenclaw.getName()
                    + " Фамилия " + ravenclaw.getSurname()
                    + " Мощность " + ravenclaw.getPower()
                    + " Расстояние трансгрессии " + ravenclaw.getDistance()
                    + " Ум " + ravenclaw.getIntelligence()
                    + " Мудрость " + ravenclaw.getWisdom()
                    + " Остроумие " + ravenclaw.getWit()
                    + " Творчество " + ravenclaw.getCreativity());
        }
    }
}
