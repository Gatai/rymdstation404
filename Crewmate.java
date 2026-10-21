
public class Crewmate {

    private String name;
    private int healthPoint;
    private int oxygenLevel; // suit
    private int energy;

    public Crewmate(String name, int healthPoint, int oxygenLevel, int energy) {

        this.name = name;
        this.healthPoint = healthPoint;
        this.oxygenLevel = oxygenLevel;
        this.energy = energy;
    }

    public String getName() {
        return name;
    }

    public int getHealthPoint() {
        return healthPoint;
    }

    public int getOxygenLevel() {
        return oxygenLevel;
    }

    public int getEnergy() {
        return energy;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHealthPoint(int healthPoint) {
        this.healthPoint = healthPoint;
    }

    public void setOxygenLevel(int oxygenLevel) {
        this.oxygenLevel = oxygenLevel;
    }

    public void setEnergy(int energy) {
        this.energy = energy;
    }

    // public void takeDamage(int dmg) {
    // hp -= dmg;
    // // System.out.print("\n" + namn + " tog: " + dmg + " skada");
    // if (hp < 0)
    // hp = 0;
    // }

    // public boolean isDead() {
    // return hp <= 0;
    // }

    // public int getHp() {
    // return hp;
    // }

    // public int getOxygen() {
    // return oxygen;
    // }

    // public String getNamn() {
    // return namn;
    // }

    // public boolean isAlive() {
    // return hp >= 0;
    // }

}