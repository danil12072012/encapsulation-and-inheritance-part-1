public class ravenclaw extends hogwarts{
    private int mind;
    private int wisdom;
    private int wit;
    private int creativity;
    public ravenclaw(String name, int powerOfWitchcraft, int transgression, int mind, int wisdom, int wit, int creativity) {
        super(name, powerOfWitchcraft, transgression);
        if (mind < 0 && mind > 100) {
            System.out.println("Некорректно заполнена графа ум.");
        } else {
        this.mind = mind;}
        if (wisdom < 0 && wisdom > 100) {
            System.out.println("Некорректно заполнена графа мудрость.");
        } else {
        this.wisdom = wisdom;}
        if (wit < 0 && wit > 100) {
            System.out.println("Некорректно заполнена графа остроумие.");
        } else {
        this.wit = wit;}
        if (creativity < 0 && creativity > 100) {
            System.out.println("Некорректно заполнена графа творчество.");
        }
        this.creativity = creativity;
    }

    public int getMind() {
        return mind;
    }

    public void setMind(int mind) {
        this.mind = mind;
    }

    public int getWisdom() {
        return wisdom;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public int getWit() {
        return wit;
    }

    public void setWit(int wit) {
        this.wit = wit;
    }

    public int getCreativity() {
        return creativity;
    }

    public void setCreativity(int creativity) {
        this.creativity = creativity;
    }
    private int ability() {
        return mind + wisdom + wit + creativity;
    }
    public void compareRavenclaw(ravenclaw ravenclaw) {
        int ability1 = ability();
        int ability2 = ravenclaw.ability();
        if (ability1 > ability2) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n",getName(), ravenclaw.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Когтевранец %s лучше, чем когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Когтевранец %s такойже, как когтевранец %s: %d VS %d%n", ravenclaw.getName(), getName(), ability1, ability2);

        }
    }
    public String toString() {
        return String.format("%s; умны: %s; мудрость: %s; остроумие: %s; творчество: %s.", super.toString(), mind, wisdom, wit, creativity);
    }
}
