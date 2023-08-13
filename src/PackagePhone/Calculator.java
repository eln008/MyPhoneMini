package PackagePhone;
import java.util.Scanner;

public class Calculator {

    private  int inputFirstNum;
    private  int inputSecondNum;
    private String operChar;


     public int calcMethod(){
         Scanner scan = new Scanner(System.in);
         System.out.println("Выберите операцию: '+', '-', '*','/'");
         operChar=scan.next();
         System.out.println("Введите превое число: ");
         inputFirstNum = scan.nextInt();
         System.out.println("Введите второе число: ");
         inputSecondNum = scan.nextInt();

         if (operChar.equals("-")){
             System.out.println(inputFirstNum - inputSecondNum);
         } else if (operChar.equals("+")){
             System.out.println(inputFirstNum + inputSecondNum);
         }else if (operChar.equals("*")){
             System.out.println(inputFirstNum * inputSecondNum);
         }else if (operChar.equals("/")){
             if (inputSecondNum == 0) {
                 System.out.println("Ошибка: деление на ноль");
             }
             System.out.println(inputFirstNum / inputSecondNum);
         }

         return 0;
     }


}
