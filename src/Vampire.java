/**
 * Date: 9/22/25
 * Vampire character class
 * @author Aidan Mora
 */
public class Vampire extends HorrorCharacter implements Transformable {
    private boolean transformed;

    /**
     * This is the constructor for the vampire class
     * Transformed is set to false by default (false = bat) (!false = vampire)
     * @param name name of the vampire
     * @param health hp of the vampire
     * @param vulnerabilities the vampire's weaknesses
     */
    public Vampire(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{ // references the parent class to get these attributes / vulnerabilities
                Vulnerability.CRUCIFIX,
                Vulnerability.SUNLIGHT});
        transformed = false; // defaults to false (not transformed)
    }

    /**
     * Attack method for the vampire character
     * Attack Method (transformed):: Neck Bite
     * Attack Method (!transformed): Eye Clawing
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void attack() {
        if (!transformed){
            System.out.println(name + " is trying to bite your neck!\n");
        }else {
            System.out.println(name + " turned into a bat and is clawing" +
                    "at your eyes with every swoop!\n");
    }
        }

    /**
     * Flee method for the vampire character
     * Flee Method: Run (blood gets drained)
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void flee() {
        System.out.println("You turn and run away from " + name +
                " (" + name + " turned into a bat and transformed " +
                "back to a vampire in front of you and drains " +
                "you of all your blood! >:) \n");
    }
    /**
     * if the vampire is transformed it will print either first sout or second sout
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void transform() {
        transformed = !transformed; // flips from true -> false | false -> true
        if (transformed){
            System.out.println(name + " transformed into a bat!\n");
        } else {
            System.out.println(name + " transformed into normal vampire form!\n");
        }
    }
}