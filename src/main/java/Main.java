import com.calculator.Calculator;

import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Calculator obj = new Calculator();
        int option;
        boolean flag=true;
        double number1, number2, answer = 0;
//        System.out.println("Select options");
     while(flag){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the following operation\n1)Square root\n2)Factorial\n3)Log\n4)Power\n5)Exit\n");
        option = scanner.nextInt();
        if (option > 0 && option < 6) {
            switch (option) {
                case 1: {
                    number1 = scanner.nextDouble();
                    answer = obj.sqrt(number1);
                    break;
                }
                case 2: {
                    number1 = scanner.nextDouble();
                    answer = obj.factorial((int) number1);
                    break;
                }
                case 3: {
                    number1 = scanner.nextDouble();
                    answer = obj.log(number1);
                    break;
                }
                case 4: {
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    answer = obj.power(number1, number2);
                    break;
                }
                case 5:{
                    System.out.print("Turning off calculator");
                    flag=false;
                    return;
                }

            }
            System.out.println("Answer for the operation is " + answer);
        }
        else{
            System.out.print("Turning off calculator");
            flag=false;
        }
//        System.out.println("Kam thy gyu");
    }
    }
}
