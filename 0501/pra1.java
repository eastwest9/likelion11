
class Calculator{
    int avg(int[] data){
        int sum=0;
        for(int i =0; i< data.length;i++){
            sum += data[i];
        }
        return sum/ data.length;
    }
}

public class pra1 {
    public static void main(String[] args) {

       Calculator cal = new Calculator();

       int[] data = {1,3,5,7,9,11};
       int result = cal.avg(data);

        System.out.println("avg : " + result);

    }
}
