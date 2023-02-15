public class Krestianin extends BaseHero {
    private int mana;
    private int maxMana;
    private int initiative;

    private int speed;

    public Krestianin() {
        super(String.format("Hero_Farmer #%d", ++Krestianin.number),
                Krestianin.r.nextInt(100, 150));
        maxMana = r.nextInt(60, 80);
        mana = maxMana;
        initiative = r.nextInt(15,20);
        speed = 3;
    }

    public String getInfo() { return String.format("%s Mana: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.mana, this.speed, this.initiative); }
}
