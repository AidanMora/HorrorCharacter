public class Vampire extends HorrorCharacter {
    private boolean transformed;

    public Vampire(String name, int health, Vulnerability[] vulnerabilities) {
        super(name, health, new Vulnerability[]{
                Vulnerability.CRUCIFIX,
                Vulnerability.SUNLIGHT});
        transformed = false;
    }
    @Override
    public void attack() {
        if (!transformed){
            System.out.println("The " + name + " is trying to bite your neck!");
        }else {
            System.out.println("The " + name + " turned into a bat and is clawing" +
                    "at your eyes with every swoop!");
    }
        }

    @Override
    public void flee() {
        System.out.println("You turn and run away from the " + name +
                " (it turned into a bat and transformed " +
                "back to a vampire in front of you and drains " +
                "you of all your blood! >:) ");
    }

}