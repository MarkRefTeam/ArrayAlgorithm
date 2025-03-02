import org.w3c.dom.ls.LSOutput;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        System.out.println("Welcome to reflection algorithm");

        //Create an array with predefined values
        //you don't need to get input from the user.
        //Then, perform the following operations:

        int[] numbers = {23, 45, 78, -10, 150, 3, 7, 8, 100, 73, 22, -50, 200};
        System.out.println("Number of elements in array: ");
        System.out.println(Arrays.toString(numbers));

        //Print the largest element of the array.
        //Print the smallest element of the array.

        int min = numbers[0];
        int max = numbers[0];

        for (int i = 1; i < numbers.length; i++) {
            if (min > numbers[i]) {
                min = numbers[i];
            }
            if (max < numbers[i]) {
                max = numbers[i];
            }
        }
        System.out.println("Minimum: " + min);
        System.out.println("Maximum: " + max);

        //Count how many elements are greater than 100.
        //Count how many elements are between -50 and 78.
        //Count how many elements are divisible by 2.
        //Count how many elements are not divisible by 3.
        //Count how many times the number 73 can be found in that array.

        int countGreaterThan100 = 0;

        for (int num : numbers) {
            if (num > 100) {
                countGreaterThan100++;
            }
        }
        System.out.println("Number of elements greater than 100: " + countGreaterThan100);

        int countBetween = 0;
        for (int num : numbers) {
            if (num >= -50 && num <= 78) {
                countBetween++;
            }
        }
        System.out.println("Number of elements between 50 and 78: " + countBetween);

        int countDivisibleBy2 = 0;
        for (int num : numbers) {
            if (num % 2 == 0) {
                countDivisibleBy2++;
            }
        }
        System.out.println("Number of elements divisible by 2: " + countDivisibleBy2);

        //I renamed the variable for better readability.

        int countNotDivisibleBy3 = 0;
        for (int num : numbers) {
            if (num % 3 != 0) {
                countNotDivisibleBy3++;
            }
        }
        System.out.println("Number of elements not divisible by 3: " + countNotDivisibleBy3);

        //I renamed the variable for better readability.

        int occurrences73 = 0;
        for (int num : numbers) {
            if (num == 73) {
                occurrences73++;
            }
        }
        System.out.println("Occurrences of 73:  " + occurrences73);

        //Check if the number 100 can be found in that array.
        //Check if any number greater than 100 can be found in that array.
        //Print the index of the first occurrence of 7 in the array - if 7 is not present, print -1.

        //I renamed the variable for better readability.

        boolean is100Found = false;
        for (int num : numbers) {
            if (num == 100) {
                is100Found = true;
                break;
            }
        }
        System.out.println("Is 100 in the array? " + is100Found);

        //I renamed the variable for better readability.

        int firstOccurrenceIndex = -1;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] == 7) {
                firstOccurrenceIndex = i;
                break;
            }
        }
        System.out.println("Index of first occurrance of 7: " + firstOccurrenceIndex);

        //Calculate the sum of the elements in the array.
        //Calculate the product of the elements in the array.
        //Calculate the following sum:
        //n1+n2+n3-n4+n5+n6+n7-n8 ,…

        //Okey, im deleted "if (num >= 1 && num <= 8) { and "else"
        //Now we can use all numbers!
        //im called a "default" for finish switch statement!

        int num;
        for (int currentNum : numbers) {
            num = currentNum;

            System.out.println("Current num: " + num);

            switch (num) {
                case 1:
                    System.out.println("N1");
                    break;
                case 2:
                    System.out.println("N2");
                    break;
                case 3:
                    System.out.println("N3");
                    break;
                case 4:
                    System.out.println("N4");
                    break;
                case 5:
                    System.out.println("N5");
                    break;
                case 6:
                    System.out.println("N6");
                    break;
                case 7:
                    System.out.println("N7");
                    break;
                case 8:
                    System.out.println("N8");
                    break;
                default:
                    System.out.println("Skipping num: " + num);
            }
        }

        int sum = 0;
        for (int currentNum : numbers) {
            sum += currentNum;
        }
        System.out.println("Sum: " + sum);

        int product = 1;
        for (int currentNum : numbers) {
            product *= currentNum;
        }
        System.out.println("Product: " + product);

        //I renamed the variable for better readability.

        int alternatingSum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (i % 2 == 0) {
                alternatingSum += numbers[i];
            } else {
                alternatingSum -= numbers[i];
            }
        }
        System.out.println("Special Sum: " + alternatingSum);
    }
}






























