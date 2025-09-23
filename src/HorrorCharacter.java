/**
 * Date: 9/22/25
 * Abstract class for HorrorCharacter
 * Sets the protected attributes
 * @author Aidan Mora
 */
abstract class HorrorCharacter {
    protected String name;
    protected int health;
    protected Vulnerability[] vulnerabilities;

    /**
     *
     * @param name character name
     * @param health hp for each character
     * @param vulnerabilities each character's weaknesses
     */
    public HorrorCharacter(String name, int health, Vulnerability[] vulnerabilities) { //constructor
        this.name = name;
        this.health = health;
        this.vulnerabilities = vulnerabilities;
    }

    /**
     * Abstract attack method
     */
    public abstract void attack();
    /**
     * Abstract flee method
     */
    public abstract void flee();

    /**
     * gets each vulnerability
     * @return vulnerabilities
     */
    public Vulnerability[] getVulnerabilities() {
        return vulnerabilities;
    }
}