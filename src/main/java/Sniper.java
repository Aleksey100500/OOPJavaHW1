public class Sniper extends BaseHero {
    private int mana;
    private int maxMana;
    private int speed;
    private int initiative;
    public Sniper() {
        super(String.format("Hero_Sniper #%d", ++Sniper.number),
                Sniper.r.nextInt(100,120));
        this.maxMana = Sniper.r.nextInt(60,70);
        this.mana = maxMana;
        this.speed = 1;
        this.initiative = Sniper.r.nextInt(10,15);
    }

    public String getInfo() { return String.format("%s Mana: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.mana, this.speed, this.initiative); }
}
