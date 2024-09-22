import java.util.List;

public class TeacherView {

    public void showTeacherList(List<Teacher> teachers) {
        System.out.println("=== List of Teachers ===");
        if (teachers.isEmpty()) {
            System.out.println("The list of teachers is empty.");
        } else {
            for (Teacher teacher : teachers) {
                displayTeacher(teacher);
            }
        }
    }

    private void displayTeacher(Teacher teacher) {
        System.out.println("ID: " + teacher.getId() + ", Name: " + teacher.getName() + ", Subject: " + teacher.getSubject());
    }

    public void showMessage(String message) {
        System.out.println(message);
    }
}

//Применяемые принципы:
//SRP: Класс TeacherView отвечает только за отображение информации пользователю. Это упрощает тестирование и поддержку.