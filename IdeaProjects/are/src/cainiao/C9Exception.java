package cainiao;

import java.io.IOException;

public class C9Exception {

    public void aa() throws InterruptedException {
        Thread.sleep(1000*3);
    }

    public static void main(String[] args) {
        try {

        }catch (ArrayIndexOutOfBoundsException a){

        }catch (IndexOutOfBoundsException i){

        }finally {
            System.out.println("无论任何方式都会输出；非强制写入");
        }

    }
}
