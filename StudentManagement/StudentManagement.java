package StudentManagement;

import java.util.ArrayList;
import java.util.List;

public class StudentManagement {
    public static void main(String[] args) {
        List<Student> arr = initData();
        Student x = searchAStudent(arr, "se4448");
        if(x == null)
            System.out.println("Not found");
        else 
            x.showProfile();
    }
    public static List<Student> initData() {
        List<Student> arr = new ArrayList();
        Student s1 = new Student("Thịnh", 4, "SE4444", 2005);
        Student s2 = new Student("Khá", 5, "SE55555", 2005);
        Student s3 = new Student("Ronaldo", 6, "SE666666", 2005);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        return arr;
    }
    public static Student searchAStudent(List<Student> arr, String id) {
        if(arr.isEmpty())
            return null;
        for(int i = 0; i < arr.size(); i ++) {
            Student tmp = arr.get(i);
            if(tmp.getId().equalsIgnoreCase(id))
                return tmp;
        }
        return null;
    }
    public static void sortStudent() {
        List<Student> arr = new ArrayList();
        Student s1 = new Student("Thịnh", 4, "SE4444", 2005);
        Student s2 = new Student("Khá", 5, "SE55555", 2005);
        Student s3 = new Student("Ronaldo", 6, "SE666666", 2005);
        arr.add(s1);
        arr.add(s2);
        arr.add(s3);
        for (int i = 0; i < arr.size() - 1; i ++) {
            for (int j = i + 1; j < arr.size(); j ++) {
                if(arr.get(i).getGpa() > arr.get(j).getGpa()) {
                    Student tmp = arr.get(i);
                    arr.get(i) = arr.get(j);
                    arr.get(j) = tmp;
                }
            }
        }
    }
}
