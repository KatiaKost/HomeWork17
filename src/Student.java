public class Student {
}
class StudentTest {
    public static void main(String[] args) {
        Student st1 = new Student();
        Student st2 = new Student();
        Student st3 = new Student();
        Student st4 = new Student();
        Student st5 = new Student();
        Student st6 = new Student();
        Student st7 = new Student();
        Student st8 = new Student();

        st3 = null;
        st4 = null;
        st5 = null;
        st6 = null;
        st7 = null;
        st8 = null;

        System.out.println(st1);// там будет хэш-код объекта
        System.out.println(st2);// там будет хэш-код объекта

    }
}