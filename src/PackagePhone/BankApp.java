package PackagePhone;
import java.util.Random;
import java.util.Scanner;
public class BankApp {
    private String name;
    private String password;
    private int bankAccount;
    private static Scanner scan = new Scanner(System.in);

    public void setPassword(String password) {
        this.password = password;
    }

    public String getPassword() {
        return password;
    }

    public int getBankAccount() {
        return bankAccount;
    }

    public void setBankAccount(int bankAccount) {
        this.bankAccount = bankAccount;
    }

    public void bankMethod () {

        System.out.println("Для входа в приложение \nВведите пароль:  ");
        String passwordInput = scan.next();
        if (passwordInput.equals(password)) {
            System.out.println("Доступ открыт! \nДобро пожаловать в аккаунт");
            System.out.println("Выберите операцию: \n1.Проверить баланс карты  \n2.Перевод денежных средств  \n3.Конвертация денег  \n4.Взять кредит  ");
            String opera = scan.next();
            if (opera.equals("1")) {
                System.out.println("Ваш баланс: " + bankAccount);
            } else if (opera.equals("2")) {
                System.out.println("Введите сумму перевода ");
                int pereVod = scan.nextInt();
                System.out.println("\"Введите счет пользователя (14 цифр) для перевода: \"");
                String dannye = scan.next();
                if (pereVod > bankAccount ) {
                    System.out.println("У вас недостаточно срдств для перевода ");
                }else if (dannye.length() != 14){
                    System.out.println("Вам надо было ввести 14 цифр!!! ");
                }else {
                    int result = (bankAccount - pereVod);
                    System.out.printf("Операция успешно выполнена! \n Вы перевели %d на счет %s \n Ваш текущий баланс на карте: %d\n" ,pereVod,dannye, result);
                }

            } else {
                System.out.println("Такой операции не существует");
            }


        }else {
            System.out.println("Вы неправильно вввели свой пароль в доступе отказано");
        }
        }

    }