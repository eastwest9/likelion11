import java.util.*;
public class prac2 {
    public static void main(String[] args) {
        int a=0, b=0;
        String op=null;
        Scanner s = new Scanner(System.in);

        System.out.println("숫자를 입력하세요!");
        a = s.nextInt();
        System.out.println("숫자를 입력하세요!");
        b = s.nextInt();
        System.out.println("기호를 입력하세요!");
        op = s.next();
        int rel=0;
        if(op.equals("+")){
            rel = a+b;
            System.out.println(a+" 더하기 "+ b+" = "+ rel);
        }
        else if(op.equals("-")){
            rel = a-b;
            System.out.println(a+" 빼기 "+ b+" = "+ rel);
        }
        else if(op.equals("*")){
            rel = a*b;
            System.out.println(a+" * "+ b+" = "+ rel);
        }
        else if(op.equals("%")){
            float rel2;
            rel2 = (float) a/(float) b;
            System.out.println(a+" 나누기 "+ b+" = "+ rel2);
        }
    }
}
