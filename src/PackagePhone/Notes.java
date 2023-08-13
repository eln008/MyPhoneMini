package PackagePhone;
import java.util.Scanner;
public class Notes {
    private String inputNotes;
    private static Scanner scan = new Scanner (System.in);



public void ManipulaciaNotes(){
    System.out.println("1.Создать новую заметку \n2.Изменить текст \n3.Удалить заметку \n");
    String mani = scan.next();
    if (mani.equals("1")){
        System.out.println("Вы создали новую заметку! можете начать пиасть");
        String newNotes = scan.next();
        System.out.println("1.Создать новую заметку \n2.Изменить текст \n3.Удалить заметку \n");

    }else if (mani.equals("2")){
        System.out.println("ваш текст "+inputNotes);
    }else if (mani.equals("3")){
        inputNotes = "";
        System.out.println("Заметка успешно удалена!");
    } else {
        System.out.println("Некорректный выбор");
    }
    String mani2 = scan.next();
    if (mani.equals("2")){
        System.out.println(inputNotes);
        String textIz = scan.next();
        String result = (textIz + inputNotes);
        System.out.println("Измененный текст "+result);
    }else if (mani.equals("3")){
        inputNotes = "";
        System.out.println("Заметка успешно удалена!");
    } else {
        System.out.println("Некорректный выбор");
    }
}
    public Notes(String inputNotes) {
        this.inputNotes = inputNotes;
    }



}
