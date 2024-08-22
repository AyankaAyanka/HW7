public class Main {
    public static void main(String[] args) {
        Hero[] heroes = {
                new Magic(100, 20, "телекинес"),
                new Medic(80, 10, "лечение", 200),
                new Warrior(120, 30, "испарение")
        };

        for (Hero hero : heroes) {
            hero.applySuperAbility();
            if (hero instanceof Medic) {
                Medic medic = (Medic) hero;
                medic.increaseExperience();
            }
        }
    }
}
