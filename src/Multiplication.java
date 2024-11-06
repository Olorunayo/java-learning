import java.util.Scanner;

public class Multiplication {
    static int map;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int total = 2;
        int gradeCounter = 1; //1 2
        while (gradeCounter <= 6) {
            System.out.println("Enter next grade: ");
            int grade = scanner.nextInt();
            total = total + grade;
            gradeCounter++;
        }


            map = 3;
            int average = total / 6;
            System.out.println("the total is: " + total);
            System.out.println("Average grade: " + average);


        }

    }


















