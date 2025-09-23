public class Vampire extends HorrorCharacter {
    public Vampire(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{
                Vulnerability.CRUCIFIX,
                Vulnerability.SILVER,
                Vulnerability.SUNLIGHT
        });
    }
    @Override
    public void attack() {
        System.out.println("The " + name + " is trying to bite your neck!");
    }

    @Override
    public void flee() {
        System.out.println("You turn and run away from the " + name);
    }

}