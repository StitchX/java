package cainiao;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class C3RegularExpression {
    /*
    正则表达式定义了字符串的模式。
    正则表达式可以用来搜索、编辑或处理文本。
    正则表达式并不仅限于某一种语言，但是在每种语言中有细微的差别。
     */
    /*
    java.util.regex 包主要包括以下三个类
        Pattern 类：
            pattern 对象是一个正则表达式的编译表示。Pattern 类没有公共构造方法。要创建一个 Pattern 对象，
                你必须首先调用其公共静态编译方法，它返回一个 Pattern 对象。该方法接受一个正则表达式作为它的第一个参数。
        Matcher 类：
            Matcher 对象是对输入字符串进行解释和匹配操作的引擎。与Pattern 类一样，Matcher 也没有公共构造方法。
                你需要调用 Pattern 对象的 matcher 方法来获得一个 Matcher 对象。
        PatternSyntaxException：
            PatternSyntaxException 是一个非强制异常类，它表示一个正则表达式模式中的语法错误。
     */

//    访问修饰符 关键字 返回类型 方法名 String类 字符串数组
    public static void main(String[] args) {
        String str = "i am a little pretty.";
        String par = ".*pretty.*";

//        System.out.println(Pattern.matches(par,str));  // true


//        捕获
//        捕获组是把多个字符当一个单独单元进行处理的方法，它通过对括号内的字符分组来创建。
        String st = " u are a it43208! ";
        String pa = "(\\D*)(\\d+)(.*)";

        Pattern r = Pattern.compile(pa);

        Matcher m = r.matcher(st);
        if(m.find()){
            System.out.println(m.group(0));  //u are a it43208  捕获组是通过从左至右计算其开括号来编号
            System.out.println(m.group(1));  //u are a it
            System.out.println(m.group(2));  // 43208
            System.out.println(m.group(3));  // !
        }else {
            System.out.println("没有匹配的");
        }


//        正则表达式语法
        String aa = "123 wer 3er rt34";
        String par1 = "^\\d.";

        Pattern pt1 = Pattern.compile(par1);
        Matcher mt1 = pt1.matcher(aa);
//        System.out.println(mt1.group(0));


//        Matcher 类的方法：索引方法提供了有用的索引值，精确表明输入字符串中在哪能找到匹配

        System.out.println("-------------------------------");
        String bb = "cat cat cat cattie cat";
        String par2="\\bcat\\b";
        Pattern pt2 = Pattern.compile(par2);
        Matcher mt2=pt2.matcher(bb);
        while (mt2.find()){
            System.out.println("start："+mt2.start());
            System.out.println("end："+mt2.end());
        }

//        matches 和 lookingAt 方法
//        matches 和 lookingAt 方法都用来尝试匹配一个输入序列模式。它们的不同是 matches 要求整个序列都匹配，而lookingAt 不要求。
//        lookingAt 方法虽然不需要整句都匹配，但是需要从第一个字符开始匹配。
        String cc = "oooooooofooooooooooooo";
        String dd="foooooooooooooooo";
        String ee = "foo";
        pt2 = Pattern.compile(ee);
        mt2 = pt2.matcher(cc);
        System.out.println(mt2.lookingAt());  // false
        mt2 = pt2.matcher(dd);
        System.out.println(mt2.lookingAt()); // true


//        replaceFirst 和 replaceAll 方法
//        replaceFirst 和 replaceAll 方法用来替换匹配正则表达式的文本。不同的是，replaceFirst 替换首次匹配，replaceAll 替换所有匹配。
        dd = mt2.replaceAll("cat");
        System.out.println(dd);

//        appendReplacement 和 appendTail 方法
//        Matcher 类也提供了appendReplacement 和 appendTail 方法用于文本替换
        String ff = "oo";
        pt2 = Pattern.compile(ff);
        mt2 = pt2.matcher(cc);
        StringBuffer sb = new StringBuffer();
        while (mt2.find()){
            mt2.appendReplacement(sb,"12");
        }
        System.out.println(sb.toString());
        mt2.appendTail(sb);
        System.out.println(sb.toString());




//        PatternSyntaxException 类的方法
//        PatternSyntaxException 是一个非强制异常类，它指示一个正则表达式模式中的语法错误。

    }
}
