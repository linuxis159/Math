package 확률_POCU;
//여사건 : 어떤 사건이 일어나지 않을 확률
//예시 8비트의 수에서 값이 1인 비트가 최소 하나 있을 확률
//합사건 : 사건1과 사건2가 동시에 일어날 확률
//합사건 예시1 : 시작번호가 3, or 뒤로부터 두자리 숫자가 77 -> 당첨번호
//시작번호가 3 -> 1000, 뒷번호가 77 -> 100, 시작번호가 3이면서 77-> 10
//1000 + 100 - 10
public class 확률02_여사건과합사건 {
    public static void main(String[] args){
        calculateComplementaryEvent(getSampleSpace(2,8), 1);
    }

    static int getSampleSpace(double event, double trial){
        return (int)Math.pow(event, trial);
    }
    static void calculateComplementaryEvent(int sampleSpace, int experiment){
        System.out.println(1-((double)experiment / sampleSpace));
    }
    static void calculateUnionEvent(int sampleSpace, int experiment){

    }
}
