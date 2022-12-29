package all.a9Array;

//java 基本数据类型传递参数时是值传递 ；引用类型传递参数时是引用传递 。
//    然而数组虽然是引用传递 ，但是将引用 z = null 只是将引用z不指向任何对象 ，并不会对原先指向的对象数据进行修改 。
class ZDemo01 {
    static void doIt(int[] z) {
        z = null; // z 指向null
    }
}
