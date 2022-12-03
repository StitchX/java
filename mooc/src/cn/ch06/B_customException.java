package cn.ch06;

import javax.xml.crypto.Data;

public class B_customException {
    /*
    创建用户自定义异常时
        (1) 继承自Exception类或某个子Exception类
        (2) 定义属性和方法，或重载父类的方法
     */

    /*
    重抛异常和异常链接：
    对于异常，不仅要进行捕获处理，有时候还需要将此异常进一步传递给调用者，
    以便让调用者也能感受到这种异常。这时可以在catch语句块或finally语句块中采取
    以下三种方式：
        （1）将当前捕获的异常再次抛出：throw e;
        （2）重新生成一个异常，并抛出，如：throw new Exception("some message");
        （3）重新生成并抛出一个新异常，该异常中包含了当前异常的信息，如：
            throw new Exception("some message"，e);
            可用e.getCause() 来得到内部异常
     */

    public static void main(String[] args) {

        try {
            BankATM.GetBalanceInfo(12345L);
        }catch (Exception e){
            System.out.println("something wrong"+e);
            System.out.println("cause"+e.getCause());
        }
    }


}
class DataHouse{
    public static void FindData(long ID) throws DatahouseException{
        if (ID>0 && ID<1000){
            System.out.println("id:"+ID);
        }else {
            throw new DatahouseException("cannot find the id");
        }
    }
}

class BankATM{
    public static void GetBalanceInfo(long ID) throws MyAppException{
        try {
            DataHouse.FindData(ID);
        }catch (DatahouseException e){
            throw new MyAppException("invalid id",e);
        }

    }
}

class DatahouseException extends Exception{
    public DatahouseException(String message){
        super(message);
    }
}

class MyAppException extends Exception{
    public MyAppException(String message){
        super(message);
    }
    public MyAppException(String message,Exception cause){
        super(message,cause);
    }
}