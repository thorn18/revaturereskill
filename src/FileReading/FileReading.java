package src.FileReading;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileReading {

    public static void main(String[] args) {

        try{
            FileInputStream fis = new FileInputStream("input.dat");
            FileOutputStream fos =new FileOutputStream("output.dat");
            int numberOfBytes = fis.available();
            byte[] data = new byte[numberOfBytes];
            fis.read(data);
            String csv = new String(data);
            String[] studentCSV = csv.split("\n");
            for(int c = 0; c< studentCSV.length;c++) {
                Student student = Student.parseStudent(studentCSV[c]);
                int total = student.getSub1()+ student.getSub2()+student.getSub3();
                double avg = (double)total/3;
                ProcessedStudent ps= new ProcessedStudent();
                ps.setId(student.id);
                ps.setName(student.name);
                ps.setSub1(student.sub1);
                ps.setSub2(student.sub2);
                ps.setSub3(student.sub3);
                ps.setAverage(avg);
                ps.setTotal(total);
                fos.write((ps.toCSV()+ "\n").getBytes());
            }
            fos.close();
            fis.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
