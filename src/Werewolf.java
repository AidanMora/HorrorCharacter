/**
 * Date: 9/22/25
 * Werewolf character class
 * @author Aidan Mora
 */
public class Werewolf extends HorrorCharacter implements Transformable{
    private boolean transformed;

    /**
     * This is the constructor for the werewolf class
     * transformed is set to false by default (false = human) (!false = werewolf)
     * @param name name of the werewolf
     * @param health hp of the werewolf
     * @param vulnerabilities the werewolf's weaknesses
     */
    public Werewolf(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{
                Vulnerability.SILVER,
                Vulnerability.DECAPITATION,
                Vulnerability.WOLFSBANE});
        transformed = false;
    }

    /**
     * Attack method for the werewolf character
     * Attack Method (transformed):: Lunge
     * Attack Method (!transformed): Stand awkwardly
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void attack() {
        if (!transformed) { // if not transformed into a human
            System.out.println(name + " is foaming at the mouth snarling, " +
                    "ready to lunge!\n");
        } else {
            System.out.println(name + " turned into a human with tattered" +
                    "clothes, and you two are just standing there awkwardly! yikes....\n");
        }
    }

    /**
     * Flee method for the werewolf character
     * Flee Method: Run (die horrifically)
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void flee() {
        System.out.println("You turn and run away from " + name +
                " (you don't get very far and die horrifically :o \n");
    }

    /**
     * if the werewolf is transformed it will print either first sout or second sout
     * Overrides from method in HorrorCharacter Class
     */
    @Override
    public void transform() {
        transformed = !transformed; // flips from true -> false | false -> true
        if (transformed) {
            System.out.println(name + " transformed into sad human form!\n");
        } else {
            System.out.println(name + " transformed into a scary Werewolf!\n");
        }
    }
}