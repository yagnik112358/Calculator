import com.calculator.Calculator;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Calculator obj = new Calculator();
        int option;
        double number1,number2,answer = 0;
        System.out.println("Select options");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Choose one of the following operation\n1)Square root\n2)Factorial\n3)Log\n4)Power\n");
        option = scanner.nextInt();
        if(option>0 && option <5){
            switch (option){
                case 1:
                {
                    number1 = scanner.nextDouble();
                    answer = obj.sqrt(number1);
                    break;
                }
                case 2:
                {
                    number1 = scanner.nextDouble();
                    answer = obj.factorial((int)number1);
                    break;
                }
                case 3:
                {
                    number1 = scanner.nextDouble();
                    answer= obj.log(number1);
                    break;
                }
                case 4:
                {
                    number1 = scanner.nextDouble();
                    number2 = scanner.nextDouble();
                    answer = obj.power(number1,number2);
                    break;
                }
                default:{
                    return;
                }
            }
        }
        System.out.println("Answer for the operation is "+ answer);
        System.out.println("Kam thy gyu");
    }
}
