import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        System.out.println("Task 1");

        int[] numbers = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;

        double[] numbersTwo = {1.57, 7.654, 9.986};


        int[] numbersThree = {12, 13, 15, 98, 100};


        System.out.println("Task 2");


        System.out.println(Arrays.toString(numbers));


        System.out.println(Arrays.toString(numbersTwo));


        System.out.println(Arrays.toString(numbersThree));


        System.out.println("Task 3");

        for (int index = numbers.length - 1; index >= 0; index--) {
            System.out.print(numbers[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int index = numbersTwo.length - 1; index >= 0; index--) {
            System.out.print(numbersTwo[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();

        for (int index = numbersThree.length - 1; index >= 0; index--) {
            System.out.print(numbersThree[index]);
            if (index > 0) {
                System.out.print(", ");
            }
        }
        System.out.println();


        System.out.println("Task 4");

        for (int index = 0; index <= numbers.length; index++) {
            if (numbers[index] % 2 == 1) {
                numbers[index] = numbers[index] + 1;
            }
            System.out.println(Arrays.toString(numbers));
            break;
        }


    }
}

