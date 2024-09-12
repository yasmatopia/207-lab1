public class Multiples {
    public static int main(int n, int a, int b) {
        return multiples(n, a, b);
    }

    public static int main() {
        return multiples(1000, 3, 5);
    }
    public static int multiples(int n, int a, int b) {
        int i = 1;
        int sum = 0;

        while (i < n) {
            if (i % a == 0 || i % b == 0){
                sum += 1;
            }
            i++;
        }
        return sum;
    }
}

