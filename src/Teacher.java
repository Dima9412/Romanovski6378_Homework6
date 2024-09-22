public class Teacher {
    private static int idCounter = 1; // Статический счетчик для генерации ID
    private final int id; // ID теперь финальный
    private String name;
    private String subject;

    // Конструктор теперь без параметра id
    public Teacher(String name, String subject) {
        this.id = idCounter++; // Увеличиваем счетчик при создании нового учителя
        this.name = name;
        this.subject = subject;
    }

    // Геттеры
    public int getId() {
        return id; // ID доступен только для чтения
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    @Override
    public String toString() {
        return "Teacher{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", subject='" + subject + '\'' +
                '}';
    }
}

//Применяемые принципы:
//Инкапсуляция: Поле id теперь финальное и доступно только для чтения. Это предотвращает изменение идентификатора после
// создания объекта, что обеспечивает целостность данных.