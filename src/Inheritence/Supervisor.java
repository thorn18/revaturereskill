package src.Inheritence;

public class Supervisor extends Employee{
    public String getExperience() {
        return experience;
    }

    public void setExperience(String experience) {
        this.experience = experience;
    }

    public String experience;
    public Supervisor(String id, String name, String experience) {
        super(id,name);
        this.experience = experience;

    }
}
