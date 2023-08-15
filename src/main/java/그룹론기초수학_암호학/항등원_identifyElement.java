package 그룹론기초수학_암호학;

//임의의 실수 a 에 대하여 교환법칙 성립
//a + 0 = 0 + a = a
//a * 1 = 1 * a = a
// -> 0을 덧셈에 대한 항등원, 1을 곱셉에 대한 항등원 이라고 한다


//a - 0 = 0 - a = a
//a / 1 = 1 / a = a
// - 와 / 는 항등원 성립안함

/*
    간단한설명 : 집합 S의 임의의 언소 a와 원소 e를 연산한 결과가 a가 될때 e를 연산에 대한
    항등원이라고 한다
*/

public class 항등원_identifyElement {
    public static void main(String[] args){
    if(isIdentifyElementOfAdd(20000,50000)){
        System.out.println("0 is identifyElement of add");
    }
    else{
        System.out.println("0 is not identifyElement of add");
    }
}


//actually, actual number .. but simply integer


//start ~ end , 0 is identifyElement of add
    static boolean isIdentifyElementOfAdd(int start, int end){
        for(int i=start ;start<=end; i++){
            if( i + 0 != i + 0 || i + 0 != i)
                return false;
        }
        return true;
    }

    //start ~ end , 1 is identifyElement of multify
    static boolean isIdentifyElementOfMultify(int start, int end){
        for(int i=start ;start<=end; i++){
            if( i * 1 != 1 * i || 1 * i != i)
                return false;
        }
        return true;
    }
}