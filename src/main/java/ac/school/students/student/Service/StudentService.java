package ac.school.students.student.Service;

import ac.school.students.student.Model.Guardian;
import ac.school.students.student.Model.Student;
import ac.school.students.student.Model.Teacher;
import ac.school.students.student.Repositroy.GuardianRepository;
import ac.school.students.student.Repositroy.StudentRepository;
import ac.school.students.student.Repositroy.TeacherRepository;
import org.springframework.stereotype.Service;
import lombok.RequiredArgsConstructor;

import java.util.List;
import java.util.Optional;

@Service
@RequiredArgsConstructor
public class StudentService {
    private final StudentRepository studentRepository;
    private final TeacherRepository teacherRepository;
    private final GuardianRepository guardianRepository;

    public List<Student> findAllStudents(){
        return studentRepository.findAll();
    }
    public List<Teacher> findAllTeachers(){
        return teacherRepository.findAll();
    }
    public List<Guardian> findAllGuardians(){
        return guardianRepository.findAll();
    }
    public Optional<Student> findStudentById(int id){
        return studentRepository.findById(id);
    }
    public Optional<Teacher> findTeacherById(int id){
        return teacherRepository.findById(id);
    }
    public Optional<Guardian> findGuardianById(int id){
        return guardianRepository.findById(id);
    }

    
}
