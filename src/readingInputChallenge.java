import java.util.Scanner;

public class readingInputChallenge {

        /* Shortest method*/
    public static void main(String[] args) {
        int count = 1;
        int sum = 0;

        while(count <= 5) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter Number #" + count);
            String a = scanner.nextLine();
            try{
                int x = Integer.parseInt(a);
                System.out.println("Number #" + count + ": " + x);
                count++;
                sum += x;
            } catch(NumberFormatException firstNumber) {
                System.out.println("enter a valid number");
            }
        }

        System.out.println("The sum of the given 5 numbers is: " + sum);

        /* Shortest method*/
//        sumOfFiveNumbers();
    }

//    public static void sumOfFiveNumbers() {
//
//        /* short method */
//
//        int z = 0;
//        for(int i = 1; i <= 5; i++) {
//            System.out.println("Enter Number #" + i);
//            int p = inputValidation();
//            System.out.println("Number #" + i + ": " + p);
//
//            z += p;
//        }
//
//        System.out.println("The sum of the given 5 numbers is: " + z);
//
//        /* short method */
//
//
//        /* medium method */
//
////        System.out.println("Enter 1st Number");
////        int p = inputValidation();
////        System.out.println("1st Number: " + p);
////
////        System.out.println("Enter 2nd Number");
////        int q = inputValidation();
////        System.out.println("2nd Number: " + q);
////
////        System.out.println("Enter 3rd Number");
////        int r = inputValidation();
////        System.out.println("3rd Number: " + r);
////
////        System.out.println("Enter 4th Number");
////        int s = inputValidation();
////        System.out.println("4th Number: " + s);
////
////        System.out.println("Enter 5th Number");
////        int t = inputValidation();
////        System.out.println("5th Number: " + t);
//
//        /* medium method */
//
//        /* Long method */
//
////        Scanner scanner = new Scanner(System.in);
//
////        while(p <=> 0) {
////
////            try{
////                System.out.println("Enter 1st Number");
////                String a = scanner.nextLine();
////                p = Integer.parseInt(a);
////            } catch(NumberFormatException firstNumber) {
////                System.out.println("enter a valid number");
////            }
////        }
////
////        while(q <=> 0) {
////            try{
////                System.out.println("Enter 2nd Number");
////                String b = scanner.nextLine();
////                q = Integer.parseInt(b);
////            } catch(NumberFormatException secondNumber) {
////                System.out.println("enter a valid number");
////            }
////        }
////
////        while(r <=> 0) {
////            try{
////                System.out.println("Enter 3rd Number");
////                String c = scanner.nextLine();
////                r = Integer.parseInt(c);
////            } catch(NumberFormatException thirdNumber) {
////                System.out.println("enter a valid number");
////            }
////        }
////
////        while(s <=> 0) {
////            try{
////                System.out.println("Enter 4th Number");
////                String d = scanner.nextLine();
////                s = Integer.parseInt(d);
////            } catch(NumberFormatException fourthNumber) {
////                System.out.println("enter a valid number");
////            }
////        }
////
////        while(t <=> 0) {
////            try{
////                System.out.println("Enter 5th Number");
////                String e = scanner.nextLine();
////                t = Integer.parseInt(e);
////            } catch(NumberFormatException fifthNumber) {
////                System.out.println("enter a valid number");
////            }
////        }
//
//        /* Long method */
//
////        System.out.println("The sum of the given 5 numbers is: " + (p + q + r + s + t));
//    }
//
//    public static int inputValidation() {
//
//        Scanner scanner = new Scanner(System.in);
//        int x = 0;
//        boolean test = true;
//        while(test) {
//
//            try{
//                String a = scanner.nextLine();
//                x = Integer.parseInt(a);
//                test = x <= 0 || x > 0 ? false : true;
//            } catch(NumberFormatException firstNumber) {
//                System.out.println("enter a valid number");
//            }
//
//        }
//
//        return x;
//    }
}
