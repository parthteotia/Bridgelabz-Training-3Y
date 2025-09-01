public class Pens {
    public static void main(String[] args) {
        int pens = 14, students = 3;
        int each = pens / students;
        int remaining = pens % students;
        System.out.println("Each student gets " + each + " pens and remaining pens are " + remaining);
    }
}
