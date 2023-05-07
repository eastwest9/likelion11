import java.util.Scanner;

class Rectangle{
    int width, height;
    Rectangle(int width, int height){
        this.height = height;
        this.width = width;
    }
    int cal(int w, int h){
        int area = 0;
        area = w * h;
        return area;
    }
}

public class pra3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("사각형의 가로와 세로길이를 띄어쓰기 기준으로 입력해주세요.");
        int w = sc.nextInt();
        int h = sc.nextInt();

        Rectangle rect = new Rectangle(w,h);

        System.out.println(rect.cal(rect.width, rect.height));
    }
}
