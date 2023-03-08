public class slytherin extends hogwarts{
    private int trick;
    private int determination;
    private int ambition;
    private int resourcefulness;
    private int lustForPower;
    public slytherin(String name, int powerOfWitchcraft, int transgression, int trick, int determination, int ambition, int resourcefulness, int lustForPower) {
        super(name, powerOfWitchcraft, transgression);
        if (trick < 0 && trick > 100) {
            System.out.println("Некорректно заполнена графа хитрость.");
        } else {
        this.trick = trick;
        }
        if (determination < 0 && determination > 100) {
            System.out.println("Некорректно заполнена графа решительность.");
        } else {
            this.determination = determination;
        }
        if (ambition < 0 && ambition > 100) {
            System.out.println("Некорректно заполнена графа амбициозность.");
        } else {
            this.ambition = ambition;
        }
        if (resourcefulness < 0 && resourcefulness > 100) {
            System.out.println("Некорректно заполнена графа находчивость.");
        } else {
            this.resourcefulness = resourcefulness;
        }
        if (lustForPower < 0 && lustForPower > 100) {
            System.out.println("Некорректно заполнена графа жажда власти.");
        } else {
            this.lustForPower = lustForPower;
        }
    }

    public int getTrick() {
        return trick;
    }

    public void setTrick(int trick) {
        this.trick = trick;
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

    public int getLustForPower() {
        return lustForPower;
    }

    public void setLustForPower(int lustForPower) {
        this.lustForPower = lustForPower;
    }
    private int ability() {
        return trick + determination + ambition + resourcefulness + lustForPower;
    }
    public void compareSlytherin(slytherin slytherin) {
        int ability1 = ability();
        int ability2 = slytherin.ability();
        if (ability1 > ability2) {
            System.out.printf("Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n",getName(), slytherin.getName(), ability1, ability2);

        } else if (ability2 > ability1) {
            System.out.printf("Слизеренец %s лучше, чем слизеренец %s: %d VS %d%n", slytherin.getName(), getName(), ability1, ability2);
        } else {
            System.out.printf("Слизеренец %s такойже, как слизеренец %s: %d VS %d%n", slytherin.getName(), getName(), ability1, ability2);

        }
    }
    public String toString() {
        return String.format("%s; хитрость: %s; решительность: %s; амбициозность: %s; находчивость: %s; жажда власти: %s.", super.toString(),trick, determination, ambition, resourcefulness,lustForPower);
    }
}
