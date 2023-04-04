public class prac {
    public static void main(String[] args) {
        int[] arr = {92,80,96};
        int sum = 0;
        for(int i =0 ; i< arr.length;i++){
            sum+=arr[i];
        }
        int mean = 0;
        mean = sum/ arr.length;
        double mean2 =0.0;
        mean2 = (double) sum /  arr.length;

        System.out.println("평균점수(실수형) = " + mean2);
        System.out.println("평균점수(정수형) = " + mean);
    }
}
