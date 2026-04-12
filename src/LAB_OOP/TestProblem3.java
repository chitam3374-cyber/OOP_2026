package LAB_OOP;

class Studentm {
    private String name;
    private String email;
    private String id;

    public Studentm(String name, String email, String id) throws AcademicException {
        this.name = name;
        this.id = id;
        // Gọi setEmail để tận dụng logic kiểm tra lỗi
        setEmail(email);
    }

    public void setEmail(String Email) throws AcademicException {
        if (Email == null || !Email.contains("@")) {
            throw new AcademicException("Invalid Email: " + Email);
        }
        this.email = Email;
    }

    public String getEmail() { return email; }
    // ... các getter khác
}

class AcademicException extends Exception {
    public AcademicException(String message) {
        super(message);
    }
}

public class TestProblem3 {
    public static void main(String[] args) {
        try {
            // Trường hợp này sẽ bắn ra Exception vì thiếu "@"
            Studentm s1 = new Studentm("chungchitam", "cc7820197", "ITITIU25032");

            // Nếu không có lỗi, dòng này sẽ chạy:
            System.out.println("Student created: " + s1.getEmail());

        } catch (AcademicException e) {
            // In ra thông báo lỗi cụ thể mà bạn đã định nghĩa
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Error: " + e.getMessage());
        }
    }
}





