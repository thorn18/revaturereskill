package src.SpringJPA.src.main.java.com.revature.controller;

import com.revature.beans.Employee;
import com.revature.service.Saver;

public class SaverController {
    Saver saver;

    public SaverController() {
    }

    public SaverController(Saver saver) {
        this.saver = saver;
    }

    public Saver getSaver() {
        return saver;
    }

    public void setSaver(Saver saver) {
        this.saver = saver;
    }

    public void save(Employee employee){
        saver.save(employee);
    }
}
