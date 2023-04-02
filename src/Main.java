public class Main {
    public static void main(String[] args) {
        Gryffindor[] gryffindors = {
                new Gryffindor("Гарри", "Поттер", 100, 100, 100, 100, 100),
                new Gryffindor("Гермиона", "Грейнджер", 80, 90, 100, 100, 100),
                new Gryffindor("Рон", "Уизли", 70, 80, 100, 90, 100),
        };

        Slytherin[] slytherins = {
                new Slytherin("Драко", "Малфой", 80, 90, 100, 50, 100, 90, 40),
                new Slytherin("Хрэхэм", "Монтегю", 60, 30, 10, 20, 50, 40, 40),
                new Slytherin("Грегори", "Гойл", 70, 40, 20, 40, 60, 40, 30),
        };

        Hufflepuff[] hufflepuffs = {
                new Hufflepuff("Захария", "Смит", 70, 80, 30, 90, 80),
                new Hufflepuff("Седрик", "Диггори", 60, 80, 100, 30, 10),
                new Hufflepuff("Джастин", "Финч", 30, 90, 10, 90, 100),
        };

        Ravenclaw[] ravenclaws = {
                new Ravenclaw("Чжоу", "Чанг", 50, 80, 50, 30, 90, 50),
                new Ravenclaw("Падма", "Патил", 30, 80, 60, 70, 90, 30),
                new Ravenclaw("Маркус", "Белби", 60, 40, 40, 90, 70, 80),
        };

        PrintService printService = new PrintService();
        PrintService.print(gryffindors);
        PrintService.print(slytherins);
        PrintService.print(hufflepuffs);
        PrintService.print(ravenclaws);
        System.out.println();
        theBestGryffindors(gryffindors);
        theBestSlytherin(slytherins);
        theBestHufflepuff(hufflepuffs);
        theBestRavenclaw(ravenclaws);
        System.out.println();
        Hogwarts.contrast(gryffindors[1], ravenclaws[2]);
    }

    public static void theBestGryffindors(Gryffindor[] gryffindors) {
        int sum = 0;
        int result = sum;
        String name = null;
        String surname = null;
        for (int i = 0; i < gryffindors.length; i++) {
            sum = gryffindors[i].getDistance() + gryffindors[i].getDistance() + gryffindors[i].getBravery() + gryffindors[i].getHonor() + gryffindors[i].getNobility();
            if (result < sum) {
                result = sum;
                name = gryffindors[i].getName();
                surname = gryffindors[i].getSurname();
            }
        }
        System.out.println("Лучший на факультете Гриффиндор: " + name + " " + surname + ". Его баллы: " + result);
    }


    public static void theBestSlytherin(Slytherin[] slytherins) {
        int sum = 0;
        int result = 0;
        String name = null;
        String surname = null;
        for (int i = 0; i < slytherins.length; i++) {
            sum = slytherins[i].getPower() +
                    slytherins[i].getDistance() +
                    slytherins[i].getAmbition() +
                    slytherins[i].getThistForPower() +
                    slytherins[i].getCunning() +
                    slytherins[i].getResourcefulness() +
                    slytherins[i].getDetermination();
            if (result < sum) {
                result = sum;
                name = slytherins[i].getName();
                surname = slytherins[i].getSurname();
            }
        }
        System.out.println("Лучший на факультете Слизерин: " + name + " " + surname + ". Его баллы: " + result);
    }

    public static void theBestHufflepuff(Hufflepuff[] hufflepuffs) {
        int sum = 0;
        int result = 0;
        String name = null;
        String surname = null;
        for (int i = 0; i < hufflepuffs.length; i++) {
            sum = hufflepuffs[i].getPower() +
                    hufflepuffs[i].getDistance() +
                    hufflepuffs[i].getHonesty() +
                    hufflepuffs[i].getLoyalty() +
                    hufflepuffs[i].getDiligence();
            if (result < sum) {
                result = sum;
                name = hufflepuffs[i].getName();
                surname = hufflepuffs[i].getSurname();
            }
        }
        System.out.println("Лучший на факультете Пуффендуй: " + name + " " + surname + ". Его баллы: " + result);
    }

    public static void theBestRavenclaw(Ravenclaw[] ravenclaws) {
        int sum = 0;
        int result = 0;
        String name = null;
        String surname = null;
        for (int i = 0; i < ravenclaws.length; i++) {
            sum = ravenclaws[i].getPower() +
                    ravenclaws[i].getDistance() +
                    ravenclaws[i].getCreativity() +
                    ravenclaws[i].getIntelligence() +
                    ravenclaws[i].getWit() +
                    ravenclaws[i].getCreativity();
            if (result < sum) {
                result = sum;
                name = ravenclaws[i].getName();
                surname = ravenclaws[i].getSurname();
            }
        }
        System.out.println("Лучший на факультете Когтевран: " + name + " " + surname + ". Его баллы: " + result);
    }
}