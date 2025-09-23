public class Zombie extends HorrorCharacter {
    public Zombie(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{
                Vulnerability.BLUNT_DAMAGE,
                Vulnerability.BULLET,
                Vulnerability.FIRE
        });
    }
    @Override
    public void attack() {
        System.out.println("The " + name + " is lunging to eat you alive!");
    }

    @Override
    public void flee() {
        System.out.println("You turn and run away from the " + name +
                " (psst ur a coward! This zombie is a TWD tpy of zombie " +
                "so it's easy to kill! ");
    }

}