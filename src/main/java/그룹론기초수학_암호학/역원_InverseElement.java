package 그룹론기초수학_암호학;
//임의의 실수 a에 대하여
// a + (-a) = (-a) + a = 0 -> 항등원 a + 0 = 0 + a = a 에 대한 역원
// a * 1/a = 1/a * a  = 1 를 만족하는 -a, 1/a가 존재한다 -> a * 1 = 1 * a = a에 대한 역원
// -> -a를 덧셈에 대한 역원, 1/a를 곱셉에 대한 역원 이라고 한다
public class 역원_InverseElement {
    public static void main(String[] args){
        System.out.println(problem1(10));
        System.out.println(problem2(1000));

    }
    static int problem1(int num){
        for(int i=0;i<214000000;i++){
            if(i - num == 0){
                return i;
            }
        }
        return 0;
    }
    static int problem2(int num){
        for(int i=1;i<214000000;i++){
            if(num * ((float)1/i) == 1){
                return i;
            }
        }
        return 0;
    }

}
