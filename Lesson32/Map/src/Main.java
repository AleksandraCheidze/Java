import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Main {

  public static void main(String[] args) throws FileNotFoundException {
    // Входной файл: in.txt
    // В первой строке дано количество записей.
    // Далее, каждая запись содержит фамилию кандидата и число голосов,
    // отданных за него в одном из штатов.
    // Подведите итоги выборов: для каждого из участника голосования определите число отданных
    // за него голосов.

    // Пример ввода:
    // 5
    // McCain 10
    // McCain 5
    // Obama 9
    // Obama 8
    // McCain 1

    // Пример вывода:
    // McCain 16
    // Obama 17
    readInput("res/in.txt");//chitaem fail
  }
  private static void readInput(String filename) throws FileNotFoundException {
    //metod kotorij schitaet kolichestvo strok
    Scanner scanner = new Scanner(new File(filename));
    int n = scanner.nextInt(); //chitaekolichestvo strok
    scanner.nextLine();//perehodim na noviju stroku
    System.out.println("In file " + filename + " is " + n + " lines with data");

  }

}