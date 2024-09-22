import java.util.Scanner;

public class InputHandler {

    private final Scanner scanner;

    public InputHandler() {
        this.scanner = new Scanner(System.in);
    }

    public String getTeacherName() {
        System.out.print("Enter teacher name: ");
        return scanner.nextLine();
    }

    public String getSubject() {
        System.out.print("Enter subject: ");
        return scanner.nextLine();
    }

    public int getTeacherId() {
        System.out.print("Enter ID of the teacher to edit: ");
        return Integer.parseInt(scanner.nextLine());
    }

    public String getNewName() {
        System.out.print("Enter new teacher name: ");
        return scanner.nextLine();
    }

    public String getNewSubject() {
        System.out.print("Enter new subject: ");
        return scanner.nextLine();
    }
}

//Применяемые принципы:
//SRP: Этот класс отвечает только за обработку ввода от пользователя, что упрощает логику контроллера.