package StudentManagement;
// nhăcs đến sinh viên thì có tên tê, gpag, id, yob
// abstraction 
// bieu dien duoc doi tuong nhu ngoai doi thuc dd + hv + khuon
// che giau hoac show ra -> encapsulation goi tron trong khuon
public class Student {
    private String name;
    private double gpa;
    private String id;
    private int yob;
    public Student(String name, double gpa, String id, int yob) {
        this.name = name;
        this.gpa = gpa;
        this.id = id;
        this.yob = yob;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getGpa() {
        return gpa;
    }
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
    public String getId() {
        return id;
    }
    public void setId(String id) {
        this.id = id;
    }
    public int getYob() {
        return yob;
    }
    public void setYob(int yob) {
        this.yob = yob;
    }
    @Override
    public String toString() {
        return "Student [name=" + name + ", gpa=" + gpa + ", id=" + id + ", yob=" + yob + "]";
    }
    public void showProfile() {
        System.out.printf("|%-10s|%4f|%-10s|%4d|\n" ,
                        name, gpa, id, yob );
    }

}