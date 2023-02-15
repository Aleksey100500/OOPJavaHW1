public class Arrower extends BaseHero {
    private int energy;
    private int maxEnergy;
    private int speed;
    private int initiative;

    public Arrower() {
        super(String.format("Hero_Arrower #%d", ++Arrower.number),
                Arrower.r.nextInt(100,170));
        this.maxEnergy = Arrower.r.nextInt(100, 120);
        this.energy = maxEnergy;
        this.speed = 1;
        this.initiative = Arrower.r.nextInt(10,16);

    }

    public String getInfo() { return String.format("%s Energy: %d Speed: %d Initiative: %d "
            , super.getInfo(), this.energy, this.speed, this.initiative); }
}
