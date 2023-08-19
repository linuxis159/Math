package 조합론_POCU;

//1.순열로 구함
//2.조합은 순서는 관계없기 때문에 중복된 거 빼주면됨
//예시 1 :6개의 펜중 2개선택
//순열로 구하면 경우의수 30개
//2개 선택이니까 2! 만큼 나눠줌
//30 / 2! = 15
//만약에 3개 선택이면 6 * 5 * 4 해서 120
//120 / 3! = 20
public class 경우의수07_조합 {


    public static void main(String[] args){
        calculateCombination(9,2);
        calculateCombination(9,7);
    }

    static void calculateCombination(int n, int r){
        System.out.println(getFactorial(n) / (getFactorial(n-r) * getFactorial(r)) );
    }


    static long getFactorial(long n){
        if(n == 1){
            return n;
        }
        return n * getFactorial(n-1);
    }
}
