package at.ac.fhcampuswien;

import com.sun.tools.jdeprscan.scan.Scan;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void largestNumber(){
        double number = 0;
        double a = 0;
        Scanner sc1 = new Scanner(System.in);
        for(int i = 1;;i++){
            System.out.print("Number "+i+": ");
            a = sc1.nextDouble();
            if(a <= 0 && i == 1){
                System.out.println("No number entered.");
                return;
            }
            if (a <= 0){
                break;
            }
            if(a > number){
                number = a;
            }
        }
        System.out.printf("The largest number is %,.2f",number);
        System.out.println();
        // input your solution here
    }

    //todo Task 2
    public void stairs(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("n: ");
        int n = sc1.nextInt();
        int outp = 1;
        if (n <= 0){
            System.out.println("Invalid number!");
        }
        for (int a = 1; a <= n;a++){
            for(int b = 1; b <= a;b++){
                System.out.print(outp+" ");
                outp++;
            }
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 3
    public void printPyramid(){
        final int CONST = 6;
        for(int i = 1;i<=CONST;i++){
            for (int x = 6;x>i;x--){
                System.out.print(" ");
            }
            for(int z = 0;z<(i*2)-1;z++){
                System.out.print("*");
            }
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 4
    public void printRhombus(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("h: ");
        int h = sc1.nextInt();
        System.out.print("c: ");
        String c = sc1.next();
        if (h%2==0){
            System.out.println("Invalid number!");
            return;
        }
        char c1 = c.charAt(0);

        for(int i = 0;i<=h/2;i++){
            for (int x = h/2;x>i;x--){
                System.out.print(" ");
            }
            for(int z = 0;z<(i*2)+1;z++){
                System.out.print((char)(c1 - Math.abs(z-i)));
            }
            System.out.println();
        }
        for(int i = h/2-1;i>=0;i--){
            for (int x = h/2;x>i;x--){
                System.out.print(" ");
            }
            for(int z = 0;z<(i*2)+1;z++){
                System.out.print((char)(c1 - Math.abs(z-i)));
            }
            System.out.println();
        }
        // input your solution here
    }

    //todo Task 5
    public void marks(){
        Scanner sc1 = new Scanner(System.in);
        double number = 0;
        double a;
        double counter = 0;
        int negcounter = 0;
        for (int i = 1;;i++){
            System.out.print("Mark "+i+": ");
            a = sc1.nextDouble();

            if(a <= 5 && a >= 1){
                number += a;
                counter++;
            }

            if(a > 5){
                i--;
                System.out.println("Invalid mark!");
            }

            if(a==5){
               negcounter++;
            }

            if( a == 0){
                break;
            }
        }
        if(number == 0 && counter == 0){
            System.out.println("Average: 0.00");
            System.out.println("Negative marks: "+negcounter);
            return;
        }
        System.out.printf("Average: %,.2f", number/counter);
        System.out.println();
        System.out.println("Negative marks: "+negcounter);
        // input your solution here
    }

    //todo Task 6
    public void happyNumbers(){
        Scanner sc1 = new Scanner(System.in);
        System.out.print("n: ");
        int input = sc1.nextInt();
        if (input <= 0){
            return;
        }

        int sum = 0;
        int endsum = 0;

        while(input != 0){
            int digit = input%10;
            sum+=Math.pow(digit,2);
            input/=10;
            if (input == 0){
                input = sum;
                endsum = sum;
                sum = 0;
            }
            if (endsum == 1){
                System.out.println("Happy number!");
                break;
            }
            if (endsum == 4){
                System.out.println("Sad number!");
                break;
            }
        }
        // input your solution here
    }

    public static void main(String[] args){
        App exercise2 = new App();

        System.out.println("Task 1: Largest Number");
        exercise2.largestNumber();

        System.out.println("\nTask 2: Stairs");
        exercise2.stairs();

        System.out.println("\nTask 3: Pyramide");
        exercise2.printPyramid();

        System.out.println("\nTask 4: Raute");
        exercise2.printRhombus();

        System.out.println("\nTask 5: Notendurchschnitt");
        exercise2.marks();

        System.out.println("\nTask 6: Fröhliche Zahlen");
        exercise2.happyNumbers();
    }
}