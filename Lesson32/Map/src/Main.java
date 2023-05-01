import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.Map;
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
    Map<String, Integer> result = new HashMap<>();
    //metod kotorij schitaet kolichestvo strok
    Scanner scanner = new Scanner(new File(filename));
    int n = scanner.nextInt(); //chitaekolichestvo strok
    scanner.nextLine();//perehodim na noviju stroku
    for (int i = 0; i < n; i++) { //chitaem novie stroki n raz
      String lastName = scanner.next();
      int newVotes = scanner.nextInt();//prochital golosa
      scanner.nextLine(); //perehodim na novuju stroku
      if (!result.containsKey(lastName)) {//esli eto novij kandidat i ego net v nashei baze
        result.put(lastName, 0);//dobavljaem emu novij schetchik
      }
      //teperj prochitanij kandidat tochno estj v results
      int oldVotes = result.get(lastName);//prediduschie znachenie
      // schetchika (dlja novogo kandidata 0)
        result.put(lastName,oldVotes + newVotes);//k prediduschemu dobavljaem nomer

      }

    }


  }

