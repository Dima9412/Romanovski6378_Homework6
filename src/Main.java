public class Main {

    public static void main(String[] args) {

        ITeacherRepository repository = new InMemoryTeacherRepository();
        TeacherService teacherService = new TeacherService(repository);
        TeacherView teacherView = new TeacherView();
        InputHandler inputHandler = new InputHandler();

        TeacherController controller = new TeacherController(teacherService, teacherView, inputHandler);

        // Пример взаимодействия с пользователем
        controller.createTeacher(); // Создание учителя
        controller.showTeacherList(); // Показать список учителей
        controller.editTeacher(); // Редактирование учителя
        controller.showTeacherList(); // Показать обновленный список учителей
    }
}
//Применяемые принципы:
//DIP: Главный класс создает зависимости, что позволяет легко модифицировать или заменять компоненты без изменения
//логики приложения.

//В этом проекте мы применили несколько принципов SOLID:
//SRP (Принцип единственной ответственности): Каждый класс имеет четко определенную ответственность.
//OCP (Принцип открытости/закрытости): Легко добавлять новые функции без изменения существующего кода.
//LSP (Принцип подстановки Барбары Лисков): Замена одной реализации другой не нарушает работу программы.
//ISP (Принцип разделения интерфейса): Интерфейсы разделены на более мелкие для удобства использования.
//DIP (Принцип инверсии зависимостей): Зависимости от абстракций позволяют легко менять реализации.
//Эти принципы делают код более чистым, гибким и легким для сопровождения и тестирования.