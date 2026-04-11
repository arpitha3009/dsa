public class p6 {
    public static void main(String[] args) {
        int n = 4;
        int p = 1;
        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= i; j++) {
             if (i%2==0)   {
                    System.out.print(j+" ");
             }
             else{
                  System.out.print((char)(j+64)+" ");

             }
               
            }
            p++;
            System.out.println();
        }
    }
}