import java.util.List;

public class TeacherService {
    private final ITeacherRepository teacherRepository;

    public TeacherService(ITeacherRepository teacherRepository) {
        this.teacherRepository = teacherRepository;
    }

    public Teacher createTeacher(String name, String subject) {
        Teacher newTeacher = new Teacher(name, subject);
        teacherRepository.addTeacher(newTeacher);
        return newTeacher;
    }

    public void editTeacher(int id, String newName, String newSubject) {
        Teacher teacher = teacherRepository.findById(id);
        if (teacher != null) {
            teacher.setName(newName);
            teacher.setSubject(newSubject);
        } else {
            // Обработка случая, когда учитель не найден (например, выброс исключения)
            throw new IllegalArgumentException("Teacher not found with ID: " + id);
        }
    }

    public List<Teacher> getTeacherList() {
        return teacherRepository.findAll();
    }
}

//Применяемые принципы:
//SRP: Этот класс отвечает только за бизнес-логику управления учителями.
//DIP: Зависимость от интерфейса ITeacherRepository позволяет легко изменять реализацию без изменения бизнес-логики.