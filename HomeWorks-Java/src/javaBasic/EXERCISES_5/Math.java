package javaBasic.EXERCISES_5;

class Math {
    public int sumIterative(int x){
        int result = 0;
        for (int i = 0; i <= x; i++) {
            result +=i;
        }
        return result;
    }

    public int sumRecursive(int n){
        if ( n <= 1 ) {
            return n;
        }
        return n + sumRecursive(n-1);
    }

    public int sumIterative(int low, int high){
        int result = 0;
        for (int i = low; i <= high; i++) {
            result+=i;
        }
        return result;
    }

    public int sumRecursive(int low, int high ){
        if ( high <= low ) {
            return low;
        }
        return high + sumRecursive( low, high - 1 );
    }

    public int multiplyIterative(int a, int b){
        int result = 0;
        for (int i = 1; i < a; i++) {
            result += i + b;
        }
        return result;
    }

    public int multiplyRecursive(int a, int b){
        if (a < 1) return a;
        return b + multiplyRecursive(a-1 , b);
    }

    public long doubleFactorialIterative(int n){
        long result = 1;
        for (int i = n; i > 1; i-=2){
            result*=i;
        }
        return result;
    }

    public long doubleFactorialRecursive(long n){
        if(n<=1) return n;
        return n * doubleFactorialRecursive(n-2);
    }

    public long fibonacciIterative(long n){
        if (n <= 1) return n;
        int previous = 0;
        int next = 1;
        int sum;
        for (int i = 2; i <= n; i++) {
            sum = previous;
            previous = next;
            next = sum + previous;
        }
        return next;
    }

    public long fibonacciRecursive(long n){
        if (n <= 1) return n;
        else return fibonacciRecursive(n - 1) + fibonacciRecursive(n - 2);
    }

}
