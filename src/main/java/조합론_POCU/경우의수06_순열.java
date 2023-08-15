package 조합론_POCU;
//순열 : 순서를 따짐
//조합 : 순서를 안따짐
//n개 중 r개를 순열로 뽑는경우
// n! / n-r
public class 경우의수06_순열 {
    public static void main(String[] args){
        calculatePermutation(16,3);
    }
    static void calculatePermutation(int n, int r){
        System.out.println(getFactorial(n) / getFactorial(n-r));

    }

    static long getFactorial(long n){
        if(n == 1){
            return n;
        }
        return n * getFactorial(n-1);
    }
}



