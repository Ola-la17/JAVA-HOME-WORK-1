
* TASK 1
* Вычислить n-ое треугольного число(сумма чисел от 1 до n)

package HW1;

import java.util.Scanner;


class Task1_1 {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.printf("Введите число:");

        String number = iScanner.nextLine();
        int num = Integer.parseInt(number);
        iScanner.close();

        int amount;
        amount = (num * (num + 1)) / 2;

        int result = 1;
        for (int i = 2; i <= num; i++) {
            result = result * i;
     }
}
