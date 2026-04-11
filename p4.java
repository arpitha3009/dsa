public class p4 {
    public static void main(String[] args) {
        int n = 4;
        int p = 1;

        for(int i = 1; i <= n; i++) {
            for(int j = 1; j <= n; j++) {
                if(i % 2 == 1) { // odd row → uppercase
                    System.out.print((char)(p + 64) + " ");
                } else { // even row → lowercase
                    System.out.print((char)(p + 96) + " ");
                }
            }
            p++;
            System.out.println();
        }
    }
}