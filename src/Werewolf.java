public class Werewolf extends HorrorCharacter {
    private boolean transformed;

    public Werewolf(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{
                Vulnerability.SILVER,
                Vulnerability.DECAPITATION,
                Vulnerability.WOLFSBANE});
        transformed = false;
    }
    @Override
    public void attack() {
        if (!transformed) {
            System.out.println("The " + name + " is foaming at the mouth snarling, " +
                    "ready to lunge!");
        } else {
            System.out.println("The " + name + " turned into a human with tattered" +
                    "clothes, and you two are just standing there awkwardly! yikes....");
        }
    }

    @Override
    public void flee() {
        System.out.println("You turn and run away from the " + name + " " +
                " (you don't get very far and die horrifically :o ");
    }

}