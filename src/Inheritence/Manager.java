package src.Inheritence;

import java.util.List;

public class Manager extends Supervisor{

    public List<String> qualification;

    public Manager(String id, String name, int experience, List<String> skillset) {
        super(id, name, experience);
        this.qualification = skillset;
    }
}
