package cn.ch07;

public class F2_recursiveBackTrack {
    public static void main(String[] args) {
        System.out.println("Fac of 5 is "+fac(5));
    }

    /*
    递归(recursive)就是一个过程调用过程本身。
    在递归调用中，一个过程执行的某一步要用到它的上一步(或上几步)的结果
    递归算法的基本模式
        f(n){ f(n-1); }

     */
//    递归算法求阶乘
    static long fac(int n){
        if (n==0) return 1;
        else return fac(n-1)*n;
    }
    /*
    回溯（back-track）
    回溯法也叫试探回溯法
    先选择某一可能的线索进行试探，每一步试探都有多种方式，将每一方式都一一试探，
        如果不符合条件就返回纠正，反复进行这种试探再返回纠正，直到得出全部符合条件的答案或是问题无解为止。
    回溯法的其本模式
        x++; if(…) x--;
     */
//    八皇后问题
    /*
    1848年提出，回溯算法的典型案例：
    问题表述为：在8×8格的国际象棋上摆放8个皇后，使其不能互相攻击，即任意两个皇后都不能处于同一行、同一列或同一斜线上，问有多少种摆法。
     */
    private static final int N=8;
    private int[]y;  //记录每列上皇后放的位置
    int count=0;  // 解的个数
    public void solve(){
        count = 0;
        y = new int[N+1];
        int x=1;
//        while (x>0){
//            y[x]++;
//            while ((y[x]<N)&&(!check(x))) y[x]++;
//            if (y[x]<=N){
//                if (x==N){  //找到一个完整的放置位置
//                    count++;
//                    print();
//                }else {
//                    x++;
//                }
//            }
//            else {
//                y[x]=0;
//                x--;
//            }
//        }
    }


}
    /*
    八皇后算法，百度答案：
    public class Queen {
    private int[] column; //同栏是否有皇后，1表示有
    private int[] rup; //右上至左下是否有皇后
    private int[] lup; //左上至右下是否有皇后
    private int[] queen; //解答
    private int num; //解答编号

    public Queen() {
        column = new int[8+1];
        rup = new int[(2*8)+1];
        lup = new int[(2*8)+1];
        for (int i = 1; i <= 8; i++)
            column[i] = 0;
        for (int i = 1; i <= (2*8); i++)
            rup[i] = lup[i] = 0;  //初始定义全部无皇后
        queen = new int[8+1];
    }

    public void backtrack(int i) {
        if (i > 8) {
            showAnswer();
        } else {
            for (int j = 1; j <= 8; j++) {
                if ((column[j] == 0) && (rup[i+j] == 0) && (lup[i-j+8] == 0)) {
                    //若无皇后
                    queen[i] = j; //设定为占用
                    column[j] = rup[i+j] = lup[i-j+8] = 1;
                    backtrack(i+1);  //循环调用
                    column[j] = rup[i+j] = lup[i-j+8] = 0;
                }
            }
        }
    }

    protected void showAnswer() {
        num++;
        System.out.println("\n解答" + num);
        for (int y = 1; y <= 8; y++) {
            for (int x = 1; x <= 8; x++) {
                if(queen[y]==x) {
                    System.out.print("Q");
                } else {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Queen queen = new Queen();
        queen.backtrack(1);
    }
}
     */
