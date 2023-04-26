public class Main {
    public static void main(String[] args) {
        Array array1 = new Array(new int[]{1,5,3});
        Array array2 = new Array(new int[]{1,6,3});
        int[] a = new int[3];
        a = array1.getArray();
        System.out.println(a[1]);
        Service service = new Service();
        int summa = service.sum(array1);
        System.out.println(summa);
    }
}