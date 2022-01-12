package src.Exception;

import src.Inheritence.Employee;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class ExceptionPractice {

    private Employee sally;
    private String[] strings = {"String1", "String2", "String3", "String4"};
    private String file = "String.dat";

    public void testNullPointerException() {
        try {
            sally.getId();
        } catch (NullPointerException e) {
            System.out.println(e);
        }
    }

    public void testArrayOutOfIndexException() {
        try{
            strings[12].getBytes();
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e);
        }
    }

    public void testFileNotFoundException() {
        try {
            FileInputStream fis = new FileInputStream("Input.dat");
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
    }

    class CustomException extends Exception {
        String message;
        public CustomException(String message) {
            this.message =  message;
        }
    }

    public void testCustomException() throws CustomException {
        throw(new CustomException("You have done this new custom exception"));
    }
}
