package PackagePhone;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Calculator calculator = new Calculator();
        Notes notes = new Notes("Text ");
        BankApp bankApp = new BankApp();
        bankApp.setPassword("qwerty8");
        bankApp.setBankAccount(20000);


        System.out.println("Для того чтобы зайти в приложение напишите слово в скобках " +"\n"+
                           "---------------------------" +"\n"+
                          "|  APPS                     |" +"\n"+
                          "|                           |" +"\n"+
                          "|                           |"+"\n"+
                          "|   Calculator   (cal)      |"+"\n"+
                          "|                           |" +"\n"+
                          "|   Notes        (note)     |"+"\n"+
                          "|                           |" +"\n"+
                          "|   BankApp      (bank)     |"+"\n"+
                          "|                           |" +"\n"+
                          "|                           |"+"\n"+
                          "|                           |" +"\n"+
                          "|                           |"+"\n"+
                          "|                           |" +"\n"+
                          "|   exit         (exit)     |"+"\n"+
                          "|                           |" +"\n"+
                          "----------------------------");
        String main = scan.next();
        if (main.equals("cal")){
            System.out.println(calculator.calcMethod());
        }else if (main.equals("note")){
            notes.ManipulaciaNotes();
        }else if (main.equals("bank")){
            bankApp.bankMethod();
        }else if (main.equals("exit")){
            System.exit(0);
        }









    }
}