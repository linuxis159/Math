package 암호학;

//a  = r mod m if m divides (a-r) = m / a-r
//2  = 12 mod 5  -> ( 2 - 12 ) / 5 = 5 / -10
//7  = 12 mod 5  -> ( 7 - 12 ) / 5 = 5 / -5
//-3 = 12 mod 5  -> (-3 - 12 ) / 5 = 5 / -15

public class 모듈러연산 {
    public static void main(String[] args){
        eulerTheorem(5, 3, 4);
    }
    public static void eulerTheorem(int p, int q, int a){
        if(!getCoprimeByEuclideanAlgorithm(p, q)){
            System.out.println("서로수가아님");
        }

        int n = p * q;

        if(!getCoprimeByEuclideanAlgorithm(n, a)){
            System.out.println("서로수가아님");
        }
        double c = Math.pow( a , (p-1) * (q-1)  );
        double b = Math.pow( a , (p-1) * (q-1) +1 );
        System.out.println("moduler result : " + (b % n));

    }
    //서로소 구하기
    public static boolean getCoprimeByEuclideanAlgorithm(long a, long b){
        long remainder1 = a % b;
        long remainder2 = b;
        long quoient = 0;
        if(remainder1 == 0){
            System.out.println("몫:"+(a/b));
            return false;
        }
        for(;;){
            if(remainder1 >= remainder2){
                quoient = remainder2 / remainder1;
                remainder1 = remainder2 % remainder1;
            }
            else if(remainder2 >= remainder1){
                quoient = remainder1 / remainder2;
                remainder2 = remainder1 % remainder2;
            }

            if(remainder1 == 0 || remainder2 == 0){
                if(quoient == 1){
                    return true;
                }
                else{
                    System.out.println("몫"+quoient);
                    return false;
                }
            }

        }
    }

}
