package src.SpringJPA.src.main.java.com.revature.service;

import com.revature.beans.Employee;

public class FileSaverService implements Saver {
    String fileName;

    public FileSaverService() {
    }

    public FileSaverService(String fileName) {
        this.fileName = fileName;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    @Override
    public void save(Employee employee) {
        // perform operations to save Employee object in the file
        System.out.println("Saving employee object in the file");
        System.out.println("The file name : "+fileName);
        System.out.println("Saved employee : "+employee);
    }
}
