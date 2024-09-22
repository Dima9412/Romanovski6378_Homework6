import java.util.List;

public interface ITeacherRepository {
    void addTeacher(Teacher teacher);
    Teacher findById(int id);
    List<Teacher> findAll();
}

//Применяемые принципы:
//Принцип инверсии зависимостей (DIP): Использование интерфейса позволяет TeacherService зависеть от абстракции, а не от
// конкретной реализации. Это облегчает замену репозитория в будущем.