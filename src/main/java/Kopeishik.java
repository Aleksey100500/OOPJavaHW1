public class Kopeishik extends BaseHero {
    private int energy;
    private int maxEnergy;
    private int speed;
    private int initiative;
    public Kopeishik() {
        super(String.format("Hero_Kopeishik #%d", ++Kopeishik.number),
                Wizard.r.nextInt(100,150));
        this.maxEnergy = Kopeishik.r.nextInt(100, 120);
        this.energy = maxEnergy;
        this.speed = 2;
        this.initiative = Kopeishik.r.nextInt(10,16);
    }

    public String getInfo() { return String.format("%s Energy: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.energy, this.speed, this.initiative); }
}
