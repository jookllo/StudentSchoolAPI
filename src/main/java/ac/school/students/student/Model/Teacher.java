package ac.school.students.student.Model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.Data;

@Entity
@Data
public class Teacher {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int teacherId;

    private String teacherFname;
    
    private String teacherLname;
    
    private String subjectTaught;
    
    @Column(unique = true)
    private String teacherEmail;

    @Column(unique = true)
    private int teacherPhoneNumber;

    private int teacherOfficeHours;
    
}
