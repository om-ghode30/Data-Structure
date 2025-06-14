public class advance_pattren {
    public static void main(String[] args) {
        int n=18;
        //  System.out.println("0 1 2 3 4 5 6 7 8 9 10"); 
        for (int i = 0; i < n; i++){
            for (int j = 0; j < n; j++) {
                if(i==0||i==n-1||j==0||j==n-1    ||j==i||j+i==n-1     ||j+i==(n-1)/2||i-j==(n-1)/2   ||j-i==(n-1)/2||i+j==(n-1)+((n-1)/2)    ){ //    j==n/2-i||j==n/2+i
                    System.out.print("* ");
                }else{
                    System.out.print("  ");
                }
            }
        System.out.println();
        }
        //  System.out.println("0 1 2 3 4 5 6 7 8 9 10"); 
    }
}
