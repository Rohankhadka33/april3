public class c1 {
    public static void main(String[] args) {
        int newarr[] = new int[10];
        for  (int i=0;i<10;i++){
            newarr[i]=i;
        }

        for (int j=9;j>=0;j--){
            System.out.println(String.valueOf(newarr[j]));
        }

    }
}
