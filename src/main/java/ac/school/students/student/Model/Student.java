package ac.school.students.student.Model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NonNull;

@Entity
@Data
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int studentId;

    @NonNull
    private String studentFname;
    
    @NonNull
    private String studentLname;
    
    private int studentGrade;
    
    @Column(unique = true)
    private int studentEmail;
    
    private String guardianName;
    
    private String guardianPhoneNumber;
    
}
