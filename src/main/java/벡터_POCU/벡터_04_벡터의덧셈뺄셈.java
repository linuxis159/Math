package 벡터_POCU;
// 덧셈 : 성분별로 더하기
public class 벡터_04_벡터의덧셈뺄셈 {
    public static void main(String[] args){
        Vector_ a = new Vector_(3,4);
        Vector_ b = new Vector_(1,-2);
        a.print();
        a.add(b);
        a.print();

    }

}
