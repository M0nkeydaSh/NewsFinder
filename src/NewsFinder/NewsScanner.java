package NewsFinder;

import java.util.Scanner;

public interface NewsScanner {

    default String  printCategory(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Напишите про что новости вы хотиде увидеть: ");
        return sc.next();
    }
}
