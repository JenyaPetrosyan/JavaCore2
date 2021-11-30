package education;

public class Student {
    private String name;
    private String surname;
    private String email;
    private String phone;
    private String lesson;
    private int age;


    public Student(String name, String surname, String email,
                   String phone, String lesson, int age) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.phone = phone;
        this.lesson = lesson;
        this.age = age;
    }


    public Student() {

    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getSurname()
    {
        return surname;
    }

    public void setSurname(String surname)
    {
        this.surname = surname;
    }

    public String getEmail()
    {
        return email;
    }

    public void setEmail(String email)
    {
        this.email = email;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getLesson()
    {
        return lesson;
    }

    public void setLesson(String lesson) {
        this.lesson = lesson;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", email='" + email + '\'' +
                ", phone='" + phone + '\'' +
                ", lesson='" + lesson + '\'' +
                ", age=" + age +
                '}';
    }
}
