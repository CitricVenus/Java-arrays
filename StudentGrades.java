import javax.naming.PartialResultException;
import java.util.*;
public class StudentGrades {
    public static void main(String[] args) {

        int option;
        int grades_option;
        int student_number;
        int new_grade;
        double max;
        double min;
        double avrg;
        double [] grades_array = new double[10];

        Scanner scanner = new Scanner(System.in);

        System.out.println("--------------------------------------------------------");
        System.out.println("Welcome to the system");

        do {

            System.out.println("--------------------------------------------------------");
            System.out.println("What do you want to do ?");
            System.out.println(  "1: Input grades\n" +
                    "2: Calculate the average grade\n" +
                    "3: Find the highest and lowest grades\n" +
                    "4: Display the grades\n" +
                    "5: Exit\n");

            option = scanner.nextInt();
            if (option == 1){

                do {
                    System.out.println("-----------Input grades----------------------------------------");
                    System.out.println("Do you want to insert all grades or just change one grade?");
                    System.out.println( "1: Change all grades\n" +
                                        "2: Change one grade\n"+
                                        "3: Exit\n");
                    grades_option = scanner.nextInt();
                    if (grades_option == 1){
                        System.out.println("------------------Change all grades-----------------------");
                        for (int i = 0 ; i < grades_array.length ; i ++){
                            System.out.println("Write the grade for student number " + (i+1));
                            new_grade = scanner.nextInt();
                            grades_array[i] = new_grade;
                        }


                    } else if (grades_option == 2) {
                        System.out.println("---------------------Change one grade-----------------------");
                        System.out.println("Write the number of the student  you want to change: ");
                        student_number = scanner.nextInt();
                        System.out.println("Write the new grade to update: ");
                        new_grade = scanner.nextInt();
                        grades_array[student_number-1] = new_grade;
                    }else if(grades_option == 3) {
                        break;

                    }else {
                        System.out.println("Write a valid option");
                    }
                }while(grades_option!=3);


            }
            else if (option == 2){
                System.out.println("------------Calculate the average grade--------------------------------");
                double sum_aux = 0;
                for (double items : grades_array) {
                    sum_aux += items;
                }
                avrg = sum_aux/grades_array.length;
                System.out.println("The average grade is: " +avrg);
            }
            else if (option == 3){
                System.out.println("-----------Find the highest and lowest grades--------------------------------");
                max = grades_array[grades_array.length-1];
                min = grades_array[grades_array.length-1];
                double aux;
                for (int i = 0 ; i < grades_array.length ; i++){
                    aux = grades_array[i];
                    if(aux > max){
                        max = aux;
                    }
                    if (aux < min){
                        min = aux;
                    }

                }
                System.out.println("The max value is: " + max);
                System.out.println("The min value is: " + min);
            }
            else if (option == 4){
                System.out.println("---------------------Display the grades---------------------");
                System.out.println("The grades are: ");
                for (double items:grades_array){
                    System.out.println(items);
                }

            }else if (option == 5){
                break;
            }else {
                System.out.println("Write a valid option");
            }

        }while(option!=5);
        System.out.println("Exiting the system");


    }
}
