import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int length = scanner.nextInt();
        int[] array = new int[length];
        int check = 0;
        for (int i = 0; i < length; i++) {
            int input = scanner.nextInt();
            array[i] = input;
        }
        int n = scanner.nextInt();
        for (int i = 0; i < array.length; i++) {
            if (array[i] == n) {
                check += 1;
            }
        }
        System.out.println(check);
    }
}