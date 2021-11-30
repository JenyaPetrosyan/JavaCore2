package education;

public class LessonStrage {
    private Lesson[] lessons = new Lesson[13];
    private int size;

    public void edd(Lesson lesson) {
        if ( size ==lessons.length ) {
            extend();
        }
        lessons[size++]=lesson;
    }

    public void extend() {
        Lesson[] ls = new Lesson[lessons.length + 10];
        System.arraycopy(lessons, 0,ls,0,size);
        lessons=ls;

    }

    public void print() {
        for (int i = 0; i < size; i++) {
            System.out.println(lessons[i]);

        }

    }
    public Lesson getByEmail(String email) {
        for (int i = 0; i < size; i++) {
            if (lessons[i].getNzme().equals(email)) {
                return lessons[i];
            }
        }
        return null;
    }
    public void delete(int index) {
        for (int i = index + 1; i < size; i++) {
            lessons[i - 1] = lessons[i];

        }
        size--;
    }
    public void deleteLessonByName(String name){
        for (int i = 0; i < size; i++) {
            if(lessons[i].getNzme().equals(name)) {

                delete(i);
            }
        }
    }


}
