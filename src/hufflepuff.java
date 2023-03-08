public class hufflepuff extends hogwarts{
    private int industriousness;
    private int loyalty;
    private int honesty;
    public hufflepuff(String name, int powerOfWitchcraft, int transgression,int industriousness, int loyalty, int honesty) {
        super(name, powerOfWitchcraft, transgression);
        if (industriousness < 0 && industriousness > 100) {
            System.out.println("Некорректно заполнена графа трудолюбие.");
        } else {
        this.industriousness = industriousness;}
        if (loyalty < 0 && loyalty > 100) {
            System.out.println("Некорректно заполнена графа верность.");
        } else {
        this.loyalty = loyalty;}
        if (honesty < 0 && honesty > 100) {
            System.out.println("Некорректно заполнена графа честность");
        } else {
        this.honesty = honesty;}
    }

    public int getIndustriousness() {
        return industriousness;
    }

    public void setIndustriousness(int industriousness) {
        this.industriousness = industriousness;
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
    private int ability() {
        return industriousness + loyalty + honesty;
    }
    public void compareHufflepuff(hufflepuff hufflepuff) {
        int ability1 = ability();
        int ability2 = hufflepuff.ability();
        if (ability1 > ability2) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n",getName(), hufflepuff.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Пуффендуец %s лучше, чем пуффендуец %s: %d VS %d%n", hufflepuff.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Пуффендуец %s такойже, как пуффендуец %s: %d VS %d%n", hufflepuff.getName(), getName(), ability1, ability2);

        }
    }
    public String toString() {
        return String.format("%s; трудолюбие: %s; верность: %s: честность: %s.", super.toString(), industriousness, loyalty, honesty);
    }
}
