package 벡터_POCU;

public class Vector_ {
        int x;
        int y;
        double scalar;
        public Vector_(int x, int y){
            this.x = x;
            this.y = y;
            this.scalar = Math.sqrt((x * x) + (y * y));
        }
        void add(Vector_ target){
            this.x = this.x + target.x;
            this.y = this.y + target.y;
            recalculateScalar();
        }

        void print(){
            System.out.println("x:" + this.x + " y:" + this.y + " scalar:" + this.scalar);
        }

        void recalculateScalar(){
            this.scalar = Math.sqrt((x * x) + (y * y));
        }

}
