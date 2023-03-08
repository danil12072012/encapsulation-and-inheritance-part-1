public class gryffindor extends hogwarts{
    private int nobility;
    private int honor;
    private int bravery;
    public gryffindor(String name, int powerOfWitchcraft, int transgression, int nobility, int honor, int bravery) {
        super(name, powerOfWitchcraft, transgression);
        if (nobility < 0 && nobility > 100) {
            System.out.println("некорректно заполнена графа благородство");
        } else {
        this.nobility = nobility;}
        if (honor < 0 && honor > 100) {
            System.out.println("Некорректно заполнена графа честь");
        } else {
        this.honor = honor;}
        if (bravery < 0 && bravery > 100) {
            System.out.println("Некорректно заполнена графа храбрость");
        } else {
        this.bravery = bravery;}
    }

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
    private int ability() {
        return nobility + honor + bravery;
    }
    public void compareGryffindor(gryffindor gryffindor) {
        int ability1 = ability();
        int ability2 = gryffindor.ability();
        if (ability1 > ability2) {
            System.out.printf("Грифендорец %s лучше, чем грифендорец %s: %d VS %d%n",getName(), gryffindor.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Грифендорец %s лучше, чем грифендорец %s: %d VS %d%n", gryffindor.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Грифендорец %s такойже, как грифендорец %s: %d VS %d%n", gryffindor.getName(), getName(), ability1, ability2);

        }
    }
    public String toString() {
        return String.format("%s; благородство: %s; честь: %s; храбрость: %s.", super.toString(), nobility, honor, bravery);
    }
}
