public class Reduce {
    public static int main(int n) {
        return reduced(n);
    }
    public static int reduced(int n) {
        int steps = 0;
        while (n != 0) {
            if (n % 2 == 0) {
                n /= 2;

            } else {
                n -= 1;
            }
            steps++;
        }
        return steps;
    }



}
