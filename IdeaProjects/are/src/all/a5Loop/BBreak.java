package all.a5Loop;

public class BBreak {
    public static void main(String[] args) {
        label: for (int j=0;j<10;j++){
            for (int k=0;k<10;k++){
                if (j==3){
                    break label; // 指定结束循环 label
                }
            }
        }
    }
}
