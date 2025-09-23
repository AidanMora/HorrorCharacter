/**
 * Date: 9/22/25
 * Zombie character class
 * @author Aidan Mora
 */
public class Zombie extends HorrorCharacter {
    /**
     * Constructor for the zombie character
     * Uses constructor chaining to reference the vulnerabilities from the enum list
     * @param name name of the zombie
     * @param health hp of the zombie
     * @param vulnerabilities the zombies weaknesses
     */
    public Zombie(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{ // references the parent class to get these attributes / vulnerabilities
                Vulnerability.BLUNT_DAMAGE,
                Vulnerability.BULLET,
                Vulnerability.FIRE
        });
    }

    /**
     * Attack method for the zombie character
     * Attack Method: Lunge / Eat Alive
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void attack() {
        System.out.println(name + " is lunging to eat you alive!\n");
    }

    /**
     * Flee method for the zombie character
     * Flee Method: Run (get called a coward)
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void flee() {
        System.out.println("You turn and run away from " + name +
                " (psst ur a coward! " + name + " is a TWD type of zombie " +
                "so it's easy to kill! \n");
    }

}