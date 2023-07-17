import java.util.Scanner;
public class SingleNumber {
    static int singleNumber(int[] matrix) {
        int result = 0;
        for (int i = 0; i < matrix.length; i++) {
            result = result ^ matrix[i];
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int rows = scanner.nextInt();
        int matrix[] = new int[rows];
        for (int i = 0; i < rows; i++) {
            matrix[i] = scanner.nextInt();
        }
        System.out.println(singleNumber(matrix));
    }
}
