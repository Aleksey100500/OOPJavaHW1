public class Wizard extends BaseHero{
    private int mana;
    private int maxMana;
    private int speed;
    private int initiative;
    public Wizard() {
        super(String.format("Hero_Wizard #%d", ++Wizard.number),
                Wizard.r.nextInt(100,130));
        this.maxMana = Wizard.r.nextInt(100,150);
        this.mana = maxMana;
        this.speed = 1;
        this.initiative = Wizard.r.nextInt(10,15);
    }

    public String getInfo() { return String.format("%s Mana: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.mana, this.speed, this.initiative); }
}
