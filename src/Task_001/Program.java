package Task_001;

import java.util.Scanner;

/**
 *  Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
 *  и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению
 *  приложения, вместо этого, необходимо повторно запросить у пользователя ввод данных.
 * */
public class Program {
    public static void main(String[] args){
        System.out.println(input());
    }
    public static float input(){
        System.out.print("Введите дробное число: ");
        while (true){
            Scanner sc = new Scanner(System.in);
            if (!sc.hasNextFloat()){
                System.out.print("Вы что-то не то ввели, введите дробное число: ");
            }else{
                return sc.nextFloat();
            }
        }
    }
}
