* TASK 3
// Вывести все простые числа от 1 до 1000 (простые числа - это числа которые делятся только на себя и на единицу без остатка. 
package HW1;


public class Task1_3 {
    public static void main(String[] args) {

        boolean cheсk = true;
        for (int i = 2; i <= 1000; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cheсk = false;
                    break;
                }
            }
            if (cheсk) System.out.println(i);
            else cheсk = true;
        }
    }
}
