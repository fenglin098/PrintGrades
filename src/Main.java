import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        int gradeNum;
        String answer;
        Scanner keyboard = new Scanner(System.in);
        do {
            System.out.println("Enter an exam score: ");
            gradeNum = keyboard.nextInt();
            if (gradeNum > 96) {
                System.out.println("Good job. Your grade is " + "A+");
            } else if (gradeNum > 93 && gradeNum < 96) {
                System.out.println("Good job. Your grade is " + "A");
            } else if (gradeNum > 89 && gradeNum < 94) {
                System.out.println("Good job. Your grade is " + "A-");
            } else if (gradeNum > 86 && gradeNum < 90) {
                System.out.println("Good job. Your grade is " + "B+");
            } else if (gradeNum > 83 && gradeNum < 87) {
                System.out.println("Good job. Your grade is " + "B");
            } else if (gradeNum > 79 && gradeNum < 84) {
                System.out.println("Good job. Your grade is " + "B-");
            } else if (gradeNum > 76 && gradeNum < 80) {
                System.out.println("Good job. Your grade is " + "C+");
            } else if (gradeNum > 73 && gradeNum < 77) {
                System.out.println("Good job. Your grade is " + "C");
            } else if (gradeNum > 69 && gradeNum < 74) {
                System.out.println("Good job. Your grade is " + "C-");
            } else if (gradeNum > 59 && gradeNum < 70) {
                System.out.println("Good job. Your grade is " + "D");
            } else {
                System.out.println("Go back to school if you get below 60");
            }

            System.out.println("Do you want to enter another score? (Y/N)?");
            answer = keyboard.next();
        }while(answer.equalsIgnoreCase("Y"));

    }
}
