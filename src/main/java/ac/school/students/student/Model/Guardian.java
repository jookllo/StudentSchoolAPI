package ac.school.students.student.Model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
@Table(name = "StudentGuardian")
public class Guardian {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int guardianId;
    
    private String guardianFname;
    private String guardianLname;

    @Column(unique = true)
    private String guardianEmail;

    @Column(unique = true)
    private int guardianPhoneNumber;

    private String guardianStudentRelationship;

    private String contactMethod;
}
