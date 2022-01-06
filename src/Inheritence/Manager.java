package src.Inheritence;

import java.util.List;

public class Manager extends Supervisor{

    public List<String> skillset;

    public Manager(String id, String name, String experience, List<String> skillset) {
        super(id, name, experience);
        this.skillset = skillset;
    }
}
