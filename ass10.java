public class ass10 {
  public static void main(String[] args) {
    long sum = 0;
    for (int i = 2; i < n; ++i) {
      if (isPrime(i)) {
        sum += i;
      }
    }
    return sum;
  }

  private static boolean isPrime(int n) {
    if (n == 2) {
      return true;
    }
    if (n < 2 || n % 2 == 0) {
      return false;
    }
    for (int i = 3, limit = (int) Math.sqrt(n); i <= limit; i += 2) {
      if (n % i == 0) {
        return false;
      }
    }
    return true;
  }
}
