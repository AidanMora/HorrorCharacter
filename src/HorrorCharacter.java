/**
 * Date: 9/22/25
 * @author Aidan Mora
 */
abstract class HorrorCharacter {
    protected String name;
    protected int health;
    protected Vulnerability[] vulnerabilities;


    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities) {
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
    }

    public abstract void attack();
    public abstract void flee();


    public Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }
}