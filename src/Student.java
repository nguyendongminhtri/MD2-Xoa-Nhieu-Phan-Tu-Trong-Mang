public class Student {
    int hamTraVe() {
        int i = 1;
        return i;
    }

//    public static void main(String[] args) {
//        Student student = new Student();
//        student.khongTraVe();
//    }
    private int id;

    public Student() {
    }

    public Student(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                '}';
    }
}
