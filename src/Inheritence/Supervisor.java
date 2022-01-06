package src.Inheritence;

public class Supervisor extends Employee{
    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public int experience;
    public Supervisor(String id, String name, int experience) {
        super(id,name);
        this.experience = experience;

    }
}
