public class Monk extends BaseHero {
    private int mana;
    private int maxMana;
    private int speed;
    private int initiative;

    public Monk() {
        super(String.format("Hero_Monk #%d", ++Monk.number),
                Monk.r.nextInt(120, 170));
        maxMana = r.nextInt(80, 110);
        mana = maxMana;
        initiative = r.nextInt(13,16);
        speed = 2;
    }

    public String getInfo() { return String.format("%s Mana: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.mana, this.speed, this.initiative); }
}
