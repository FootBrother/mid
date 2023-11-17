class Personel {
    public String name; // 名
    public int bornln; // 出生年
    public void show(){}
    
}

class Student extends Personel {
    public int id;
    public int grade;
    public String c1; // 修課
    public String c2;

    public Student(String name, int bornln, int id, int grade, String c1, String c2) {
        this.name = name;
        this.bornln = bornln;
        this.id = id;
        this.grade = grade;
        this.c1 = c1;
        this.c2 = c2;
    }

    public String toString() {
        return "name: " + name + "\nDate of born: " + bornln + "\nID: " + id + "\ngrade: " + grade + "\ncourse1: " + c1
                + "\ncourse2: " + c2;
    }
    public void show(){
        System.out.println(5);
    }
}

class Teacher extends Personel {
    public String course; // 教課

    public Teacher(String name, int bornln, String course) {
        this.name = name;
        this.bornln = bornln;
        this.course = course;
    }

    public String toString() {
        return "name: " + name + "\nDate of born: " + bornln + "\nCourse: " + course;
    }
    public void show(){
        System.out.println(5);
    }

}

public class j02 {
    public static void main(String[] args) {
        Personel[] persons = new Personel[4];
        persons[0] = new Student("Lin", 88, 940001, 1, "Chinese", "English");
        persons[1] = new Student("Wang", 87, 930001, 2, "Math", "English");
        persons[2] = new Teacher("Chang", 60, "English");
        persons[3] = new Teacher("Shaiu", 62, "Chinese");
        for (int i = 0; i < persons.length; i++) {
            persons[i].show();
            System.out.println("---------------------");
        }

    }
}