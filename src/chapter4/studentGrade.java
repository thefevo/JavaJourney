package chapter4;

public class studentGrade {
    public static void main(String[] args) {

        int studentGrade = 0;
        if (studentGrade >= 90) {
        }
        {
            System.out.println("A");
        }
    
        if (studentGrade >= 80) {
            System.out.println("B");
        } 
        
        else {
            if (studentGrade >= 70) {
                System.out.println("C");
            } else {
                if (studentGrade >= 60) {
                    System.out.println("D");
                } else {
                    System.out.println("F");
                }
            }
        }
    }
}
