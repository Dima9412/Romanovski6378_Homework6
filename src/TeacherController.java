import java.util.List;

public class TeacherController {

    private final TeacherService teacherService;
    private final TeacherView teacherView;
    private final InputHandler inputHandler;

    public TeacherController(TeacherService teacherService, TeacherView teacherView, InputHandler inputHandler) {
        this.teacherService = teacherService;
        this.teacherView = teacherView;
        this.inputHandler = inputHandler;
    }

    public void createTeacher() {
        String name = inputHandler.getTeacherName();
        String subject = inputHandler.getSubject();

        Teacher newTeacher = teacherService.createTeacher(name, subject);

        teacherView.showMessage("Teacher created successfully with ID: " + newTeacher.getId());

    }

    public void editTeacher() {
        int id = inputHandler.getTeacherId();
        String newName = inputHandler.getNewName();
        String newSubject = inputHandler.getNewSubject();

        try {
            teacherService.editTeacher(id, newName, newSubject);
            teacherView.showMessage("Teacher edited successfully.");
        } catch (IllegalArgumentException e) {
            teacherView.showMessage(e.getMessage());
        }
    }

    public void showTeacherList() {
        List<Teacher> teachers = teacherService.getTeacherList();
        teacherView.showTeacherList(teachers);
    }
}

//Применяемые принципы:
//SRP: Этот класс управляет взаимодействием между представлением и сервисом, что делает его более понятным и легким для
//тестирования.
//DIP: Контроллер зависит от абстракций (InputHandler, TeacherService, TeacherView), что делает его гибким.