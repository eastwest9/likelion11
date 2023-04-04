import java.util.*;
public class ex4 {
    public static void main(String[] args) {
        String[] name = {"james", "Cathy", "Kenny", "Martin", "Crystal"};
        int[] height = {'1','2','3','4','5'};
        Scanner scanner = new Scanner(System.in);
        for(int i =0; i< name.length;i++){
            System.out.print(name[i]+"의 신장을 입력하세요! ");
            height[i] = scanner.nextInt();
        }
        int sum = 0;
        for(int i =0; i< name.length;i++){
            System.out.println(name[i]+"의 키는 "+height[i]+ "입니다.");
            sum+=height[i];
        }
        System.out.println("신장의 합계 : "+ sum);
        int mean =0;
        mean = sum / name.length;
        System.out.println("평균 신장 : "+ mean);

    }
}
