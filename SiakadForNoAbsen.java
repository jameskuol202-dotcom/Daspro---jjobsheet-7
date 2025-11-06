import java.util.Scanner;
public class SiakadForNoAbsen {
public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    double highest = 0;
    double lowest = 100;
    double grade;

    for (int i = 1; i <= 10; i++) {

}
for (int i = 1; i <= 10; i++) {
     System.out.print("Enter the grade of the " + i + " student: ");
    grade = sc.nextDouble();

    if (grade > highest) {
        highest = grade;
    }

    if (grade < lowest) {
        lowest = grade;
    System.out.println("The highest grade:" + highest);
    System.out.println("The lowest grade" + lowest);
  
}
    
}
}
}