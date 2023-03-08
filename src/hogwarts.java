public abstract class hogwarts {
    private String name;
    private int powerOfWitchcraft;
    private int transgression;
    public hogwarts(String name, int powerOfWitchcraft, int transgression) {
        this.name = name;
        this.powerOfWitchcraft = powerOfWitchcraft;
        this.transgression = transgression;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPowerOfWitchcraft() {
        return powerOfWitchcraft;
    }

    public void setPowerOfWitchcraft(int powerOfWitchcraft) {
        this.powerOfWitchcraft = powerOfWitchcraft;
    }

    public int getTransgression() {
        return transgression;
    }

    public void setTransgression(int transgression) {
        this.transgression = transgression;
    }

    private int ability() {
        return powerOfWitchcraft + transgression;
    }
    public void compareHogwarts(hogwarts hogwarts) {
        int ability1 = ability();
        int ability2 = hogwarts.ability();
        if (ability1 > ability2) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n",getName(), hogwarts.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Студент %s лучше, чем студент %s: %d VS %d%n", hogwarts.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Студент %s такойже, как студент %s: %d VS %d%n", hogwarts.getName(), getName(), ability1, ability2);

        }
    }
    public String toString() {
        return String.format("Студент: %s; сила магии: %s; сила трансгрессии: %s", name, powerOfWitchcraft, transgression);
    }
    public void print() {
        System.out.println(this);
    }
}
