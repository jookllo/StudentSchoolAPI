package ac.school.students.student.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "SchoolTeacher")
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
