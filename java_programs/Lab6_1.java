import java.util.Scanner;

public class Lab6_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = Integer.parseInt(args[0]);
        Student[] s = new Student[x];
        for (int i = 0; i < x; i++) {
            System.out.println("Enter sub no:");
            int m = sc.nextInt();
            s[i] = new Student(i, m);
            s[i].cspi();
        }
    }
}
class Student {
    int id_no;
    int no_of_subject_registered;
    int[] subject_credits;
    String[] grade_obtained;
    double spi;

    public Student(int id_no, int no_of_subject_registered) {
        this.id_no = id_no;
        this.no_of_subject_registered = no_of_subject_registered;
        subject_credits = new int[no_of_subject_registered];
        grade_obtained = new String[no_of_subject_registered];
        Scanner s = new Scanner(System.in);

        for (int i = 0; i < no_of_subject_registered; i++) {
            System.out.println("enter credit");

            subject_credits[i] = s.nextInt();
            System.out.println("enter grade");
            grade_obtained[i] = s.next();

        }
    }

    void cspi() {
        int marks = 0;
        int credit = 0;

        for (int i = 0; i < no_of_subject_registered; i++) {
            String tempgrade = grade_obtained[i];
            if (tempgrade.equals("A++")) {
                marks += (10 * subject_credits[i]);
                credit += subject_credits[i];
            } else if (tempgrade.equals("A")) {
                marks += (9 * subject_credits[i]);
                credit += subject_credits[i];
            } else if (tempgrade.equals("B+")) {
                marks += (8 * subject_credits[i]);
                credit += subject_credits[i];
            }
        }
        spi = (marks) / credit;
        System.out.println("spi:"+spi);
    }

}