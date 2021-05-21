import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int koef1 = 1;
        int x = 0;
        int koef2 = 0;
        int y = 1;
        long firstNumber;
        long secondNumber;
        long nod = 0;
        Scanner in = new Scanner(System.in);
        firstNumber = in.nextInt();
        secondNumber = in.nextInt();
        while( secondNumber != 0){
          int b = (int) (firstNumber / secondNumber);
          int a = (int) firstNumber;
          firstNumber = secondNumber;
          secondNumber = a % secondNumber;
          a = koef1;
          koef1 = x;
          x = a - x * b;
          a = koef2;
          koef2 = y;
          y = a - y * b;
          nod = firstNumber;
        }
        System.out.printf(nod + " " + koef1 + " " + koef2);
    }
}
