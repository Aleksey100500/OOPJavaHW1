public class Program {
    public static void main(String[] args) {
        BaseHero hero_1 = new Arrower();
        System.out.println(hero_1.getInfo());

        BaseHero hero_2 = new Monk();
        System.out.println(hero_2.getInfo());

        BaseHero hero_3 = new Krestianin();
        System.out.println(hero_3.getInfo());

        BaseHero hero_4 = new Wizard();
        System.out.println(hero_4.getInfo());

        BaseHero hero_5 = new Kopeishik();
        System.out.println(hero_5.getInfo());

        BaseHero hero_6 = new Sniper();
        System.out.println(hero_6.getInfo());

        hero_1.Attack(hero_2, 1);
        System.out.println(hero_2.getInfo());
    }
}
