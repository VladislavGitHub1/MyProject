public class Service {

    public int sum (Array array){
        int[] arr = array.getArray();
        int sum = 0;
        for (int i = 0; i < 3; i++ ){
            sum += arr[i];

        }
        return sum;
    }
}
