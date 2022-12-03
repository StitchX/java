package shangguigu;
// 二维数组打印一个，杨辉三角

public class ProjectTwo {
    public static void main(String[] args) {
        int[][] a = new int[10][];

        for (int j=0;j<a.length;j++){
            a[j] = new int[j+1];
            for (int k=0;k<a[j].length;k++){
                if (k==0 || k==j){
                    a[j][k]=1;
                }else {
                    a[j][k]=a[j-1][k-1]+a[j-1][k];
                }

            }
        }


        for (int j=0;j<a.length;j++){
            for (int k=0;k<a[j].length;k++){
                System.out.print(a[j][k]);
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}
