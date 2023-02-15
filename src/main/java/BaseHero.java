import java.util.Random;

public class BaseHero {
    protected String name;
    protected int hp;
    protected int MaxHP;
    protected static int number;
    protected static Random r;

    static {
        BaseHero.number = 0;
        BaseHero.r = new Random();
    }

    public BaseHero(String name, int hp) {
        this.name = name;
        this.hp = hp;
        this.MaxHP = hp;
    }

    public String getInfo() {
        return String.format("Name: %s HP: %d Type: %s",
                this.name, this.hp, this.getClass().getSimpleName());
    }

    private void getDamage(int damage) {
        if (this.hp - damage > 0) { hp -= damage; }
        else { String.format("Your hero was killed..."); }
    }

    public void Attack(BaseHero target, int speedYourCharacter) {
        int damage = speedYourCharacter + (this.hp % 10);
        System.out.printf("Your %s has been damaged on %d HP\n", target.name, damage);
        target.getDamage(damage);
    }


}
