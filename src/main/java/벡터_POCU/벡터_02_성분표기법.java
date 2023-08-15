package 벡터_POCU;

//각도 45도, 길이 4.234인 벡터 있음
//벡터의 시작점은 0.0, 끝점은 3,3
//시작점을 꼬리(tail), 끝점을 머리(head)라고 함
//성분표기법으로 (3,3)
//각각의 x,y에 대해서 성분(component) 라고함
//3차원 벡터라면 성분이 3개(x,y,z)인거임
public class 벡터_02_성분표기법 {
    public static void main(String[] args){
        System.out.println(getVectorLength(3,3));
        System.out.println(Math.toDegrees(getVectorAngle(3,3)));
    }
    static double getVectorLength(int x, int y){
        return Math.sqrt((x * x) + (y * y));

    }

    //탄젠트 -> y/x, 높이 / 밑변
    //역탄젠트(arctan) = 각도
    //역함수는 주어진 함수의 출력을 입력으로 받아 원래의 입력을 출력으로 반환합니다
    static double getVectorAngle(int x, int y){
        //
        return Math.atan2(y,x);
    }
}

