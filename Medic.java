public class Medic extends Hero {
    private int healPoints;

    public Medic(int health, int damage, String superAbilityType, int healPoints) {
        super(health, damage, superAbilityType);
        this.healPoints = healPoints;
    }

    public int getHealPoints() {
        return healPoints;
    }

    public void increaseExperience() {
        healPoints += healPoints * 0.1;
        System.out.println("Медик увеличил опыт лечения, теперь healPoints = " + healPoints);
    }

    @Override
    public void applySuperAbility() {
        System.out.println("Medic применил суперспособность " + getSuperAbilityType());
    }
}

