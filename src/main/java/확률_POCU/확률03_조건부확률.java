package 확률_POCU;
//조건부확률 : 어떤사건 F가 발생했을 때
//그런 상황 하에서 사건 E가 일어날 확률
//1. 동전3번 던지려함, 처음 던지니 앞면이 나옴, 이제 두번 더 던지면
//   앞면이 나온 총횟수가 홀수 번일 확률
// 전체 경우의수 8
// 첫번째 면이 앞면이 나올 확률= 1/2
// -> 현재 표본공간1/4
// -> 1/4 * 2 = 1/2
//공식 : P(E|F)
//2.자녀 성비 예측하기
//총자녀거 몇명인가? -> 총 자녀수는 2명
//자식중 최소 한 명이 딸인가? -> 최소 한명은 딸임
//다음과 같이 응답한 사람들중 딸만 2명인 가족의 비율

public class 확률03_조건부확률 {
    public static void main(String[] args){
        calculateConditionalProbability(getSampleSpace(2,3),2, 5);
    }

    static int getSampleSpace(double event, double trial){
        return (int)Math.pow(event, trial);
    }
    static void calculateConditionalProbability(int sampleSpace, int eventF, int eventE){

    }

}

