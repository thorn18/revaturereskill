package src.FileReading;

public class ProcessedStudent {
    int id;
    String name;
    int sub1;

    public ProcessedStudent() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSub1() {
        return sub1;
    }

    public void setSub1(int sub1) {
        this.sub1 = sub1;
    }

    public int getSub2() {
        return sub2;
    }

    public void setSub2(int sub2) {
        this.sub2 = sub2;
    }

    public int getSub3() {
        return sub3;
    }

    public void setSub3(int sub3) {
        this.sub3 = sub3;
    }

    public double getAverage() {
        return average;
    }

    public void setAverage(double average) {
        this.average = average;
    }

    public int getTotal() {
        return total;
    }

    public void setTotal(int total) {
        this.total = total;
    }

    public ProcessedStudent(int id, String name, int sub1, int sub2, int sub3, double average, int total) {
        this.id = id;
        this.name = name;
        this.sub1 = sub1;
        this.sub2 = sub2;
        this.sub3 = sub3;
        this.average = average;
        this.total = total;
    }

    int sub2;
    int sub3;
    double average;

    public String toCSV() {
        return "ProcessedStudent{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sub1=" + sub1 +
                ", sub2=" + sub2 +
                ", sub3=" + sub3 +
                ", average=" + average +
                ", total=" + total +
                '}';
    }

    int total;

    public static ProcessedStudent parseProcessedStudent(String csv) {
        String[] values = csv.split(",");
        int id = Integer.parseInt((values[0].trim()));
        String name = values[1].trim();
        int sub1 = Integer.parseInt((values[2].trim()));

        int sub2 = Integer.parseInt((values[3].trim()));

        int sub3 = Integer.parseInt((values[4].trim()));
        double avg = Double.parseDouble(values[5].trim());
        int total =  Integer.parseInt((values[6].trim()));

        ProcessedStudent newStudent  = new ProcessedStudent(id,name,sub1,sub2,sub3,avg,total);
        return newStudent;

    }


}
