package LevelOne;

public class PenDistributed {
    public static void main(String[] args) {
        int pens=14;
        int students=3;
        
        int penperStudent = pens/students;
        int remainingPen = pens%students;
        System.out.println(penperStudent);
        System.out.println(remainingPen);
    }
}
