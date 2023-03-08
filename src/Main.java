import java.util.Random;

public class Main {
    private static final Random RANDOM = new Random();
    public static void main(String[] args) {
        gryffindor garry = generateGryffindor("Гарри Поттер");
        gryffindor germiona = generateGryffindor("Гермиона Грейнджер");
        gryffindor ron = generateGryffindor("Рон Уизли");
        hufflepuff zahariya = generateHufflepuff("Захария Смит");
        hufflepuff sedrik = generateHufflepuff("Седрик Диггори");
        hufflepuff djastin = generateHufflepuff("Джастин Финч-Флетчли");
        ravenclaw chjou = generateRavenclaw("Чжоу Чанг");
        ravenclaw padma = generateRavenclaw("Падма Патил");
        ravenclaw markus = generateRavenclaw("Маркус Белби");
        slytherin drgo = generateSlytherin("Драко Малфой");
        slytherin grehem = generateSlytherin("Грэхэм Монтегю");
        slytherin gregoriy = generateSlytherin("Грегори Гойл");

        chjou.compareRavenclaw(markus);
        chjou.print();
        markus.print();

        germiona.compareHogwarts(sedrik);
        germiona.print();
        markus.print();
    }
    private static gryffindor generateGryffindor(String name) {
        return new gryffindor(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static hufflepuff generateHufflepuff(String name) {
        return new hufflepuff(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static ravenclaw generateRavenclaw(String name) {
        return new ravenclaw(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
    private static slytherin generateSlytherin(String name) {
        return new slytherin(name,
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100),
                RANDOM.nextInt(100));
    }
}