package chapter4;

public class Studenttest {
    public static void main(String[] args) {
        classstudent1 account1 = new classstudent1("james brown",93.5);
        classstudent1 account2 = new classstudent1("james scott",72.75);

        System.out.printf("%s's letter grade is: %s%n",account1.getName(),account1.getLetterGrade());
        System.out.printf("%s's letter grade is: %s%n",account2.getName(),account2.getLetterGrade());
    }
}
