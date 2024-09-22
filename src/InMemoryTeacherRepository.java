import java.util.ArrayList;
import java.util.List;

public class InMemoryTeacherRepository implements ITeacherRepository {
    private List<Teacher> teachers = new ArrayList<>();

    @Override
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    @Override
    public Teacher findById(int id) {
        for (Teacher teacher : teachers) {
            if (teacher.getId() == id) {
                return teacher;
            }
        }
        return null; // Или выбросить исключение
    }

    @Override
    public List<Teacher> findAll() {
        return new ArrayList<>(teachers); // Возвращаем копию списка
    }
}

//Применяемые принципы:
//SRP (Принцип единственной ответственности): Этот класс отвечает только за хранение и управление данными о учителях.
//DIP: Реализация интерфейса ITeacherRepository позволяет легко заменить этот класс на другую реализацию (например,
// для работы с базой данных).