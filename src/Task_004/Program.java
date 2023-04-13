package Task_004;

import java.util.Scanner;

public class Program {
    public static void main(String[] args){
        System.out.print("Введите строку: ");
        Scanner sc = new Scanner(System.in);
        validator(sc);
    }

    public static void validator (Scanner sc) throws RuntimeException {
        String str = sc.nextLine();
        if (str.trim().isEmpty())
            throw new RuntimeException("Пустую строку вводить нельзя!");
        else
            System.out.println(str);
    }
}
