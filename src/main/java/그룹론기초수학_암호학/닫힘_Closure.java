package 그룹론기초수학_암호학;

import java.math.BigInteger;
import java.text.NumberFormat;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.stream.Stream;

// 공집합이 아닌 집합 A의 두원소 a,b에 대한
// 연살의 결과 a = b가 항상 A의 원소가 될 때,
// 집합 A는 연산 = 에 대해 닫혀 있다고 한다
public class 닫힘_Closure {
    //A라는 집합은 자연수로 정의합니다
    //A의속하는 원소 a,b(무작위 자연수)가 있다고 가정했을때
    public static void main(String[] args){
        int natureNumber1 = (int)(Math.random() * 1000);
        int natureNumber2 = (int)(Math.random() * 1000);

        //자연수라는 집합안에 있는 모든원소 a,b에 대해서 a+b연산을
        //수행했을때 모든경우에 대해서 자연수임  -> 닫힘
        if(isNaturalNumber(natureNumber1 + natureNumber2))
            System.out.println("is Closure");
        else
            System.out.println("is Non-Closure");

        //자연수라는 집합안에 있는 모든원소 a,b에 대해서 a-b연산을
        //수행했을때 모든경우에 대해서 자연수가 아님 0> 닫힘아님
        if(isNaturalNumber(natureNumber1 - natureNumber2))
            System.out.println("is Closure");
        else
            System.out.println("is Non-Closure");

    }
    // 수 > 실수 > 유리수 > 정수 > 자연수
    static boolean isNaturalNumber(int number){
        if(number < 0) return false;
        else return true;
    }



}
