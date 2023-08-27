package 확률_POCU;


//사건이 일어나는 경우의수(사건) / 모든경우의수(표본공간)
//모든 경우의 집합 -> 표본 공간(sample space)
//모든 경우의 수에서 하나를 뽑는 절차 -> 실험(Experiment)
//유한 표본공간(경우의수가 무한이아닌)가정하에확률성립
public class 확률01 {
    public static void main(String[] args){
        calculateProbability(100, 30);
    }
    static void calculateProbability(int sampleSpace, int experiment){
        System.out.println((double) experiment / sampleSpace);
    }
}

