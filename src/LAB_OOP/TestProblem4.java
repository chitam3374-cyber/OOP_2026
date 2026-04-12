package LAB_OOP;

import java.util.ArrayList;

class Course{
    private final String CourseCode;
    private final String CourseTitle;
    private final int Maxcapicity;
    private Staff lecture;
    public ArrayList <Student> Students;
    public Course(String CourseCode, String CourseTitle, int Maxcapicity){
        this.CourseCode = CourseCode;
        this.CourseTitle = CourseTitle;
        this.Maxcapicity = Maxcapicity;
        //Has a compossition
        Students=new  ArrayList<>();
    }
    // ĐĂNG KÍ LECTURE BẰNG CÁCH TRUYỀN THAM SỐ VÀO
    public void AssignLecture(Staff lecture){
        this.lecture = lecture;
    }
    // Throw exception
    // throws ... gọi tên exception
    public void addStudent(Student student) throws AcademicException{
        if(Students.size()>=Maxcapicity){
            //Nếu số lượng student đủ thì sẽ ném ra kết quả là Courrse is full
            throw new AcademicException("Course is full");
        }
        // ngược lại sẽ duyệt qua full mảng xem student đã có chưa sẽ ném ra kết quả Duplicate student
        // sẽ ném ra kết quả Duplicate student nếu có student rồi
        // sau đó thoát vòng lặp và thêm student vào mảng
        for(Student st:Students){

            if(st.getId().equals(student.getId())){
                throw  new AcademicException("Duplicate student");
            }
        }
        Students.add(student);

    }

    // đến hàm kiếm tra xem có xóa student bởi ID chưa
    //
    public boolean removeStudentByid(String id){
        return Students.removeIf(s -> s.getId().equals(id));
    }
    public boolean isFull(){
        return Students.size()>=Maxcapicity;
    }
    public int countStudent(){
        return Students.size();
    }
    public String toString(){
        return "Course: " + CourseCode +
                " - " + CourseTitle +
                "\nStudents: " + Students.size();
    }

}


public class TestProblem4 {
    static void main(String[] args){
        try {

            // tạo lecturer
            Staff lecturer = new Staff(
                    "John",
                    "john@gmail.com",
                    "T01",
                    "IT",
                    5000
            );

            // tạo course
            Course course = new Course(
                    "PRJ101",
                    "Java Programming",
                    3
            );

            // gán lecturer cho course
            course.AssignLecture(lecturer);

            // tạo student
            Student s1 = new Student(
                    "Tam",
                    "tam@gmail.com",
                    "S01",
                    "IT",
                    1
            );

            Student s2 = new Student(
                    "An",
                    "an@gmail.com",
                    "S02",
                    "Business",
                    2
            );

            Student s3 = new Student(
                    "Minh",
                    "minh@gmail.com",
                    "S03",
                    "Design",
                    3
            );

            // thêm student vào course
            course.addStudent(s1);
            course.addStudent(s2);
            course.addStudent(s3);

            // in course
            System.out.println(course);

            // số lượng student
            System.out.println("Number of students: "
                    + course.countStudent());

            // kiểm tra course full
            System.out.println("Course full: "
                    + course.isFull());

            // xóa student
            boolean removed = course.removeStudentByid("S02");

            System.out.println("Remove S02: " + removed);

            // số lượng student sau khi xóa
            System.out.println("Students after remove: "
                    + course.countStudent());

        }

        catch (AcademicException e){

            System.out.println("Error: " + e.getMessage());

        }
    }
}
