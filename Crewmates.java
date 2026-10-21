    
   public class Crewmates {

    private String namn;
    private int hp;
    private int oxygen;

    public Crewmates(String string, int i, int j) {
        //TODO Auto-generated constructor stub
    }

    public void Crewmate(String namn, int hp, int oxygen) {
        this.namn = namn;
        this.hp = hp;
        this.oxygen = oxygen;
    }

    public void takeDamage(int dmg) {
        hp -= dmg;
        // System.out.print("\n" + namn + " tog: " + dmg + " skada");
        if (hp < 0) hp = 0;
    }
    public boolean isDead(){
    return hp <= 0;
    }
        
    public int getHp() {
        return hp;
    }
    public int getOxygen(){
        return oxygen;
    }

    public String getNamn() {
        return namn;
    }
    public boolean isAlive(){
        return hp >= 0;
    }
    
}