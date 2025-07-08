package Builder;

public class BuilderMain {
    public static void main(String[] args) throws Exception {
        // Example usage of the Builder pattern
        Student student = Student.getBulider()
                .setName("Kiran")
                .setId(123)
                .setAge(19)
                .setAddress("Guntur")
                .build();
        System.out.println(student);
    }
}
