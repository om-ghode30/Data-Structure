class a{
    public static void main(String args[]){
        int star1=0;
        int star2=0;
        int n=5;
        int space1=n-1;
        int space2=-1;
        int row=n;
        while(row>0){
            int t=space1;
            while(t>0){
                System.out.print(" ");
                t--;
            }

            space1--;
            System.out.print("*");
            t=space2;
            while(t>0){
                if(row==n/2+1){
                    System.out.print("*");
                    t--;
                }else{
                    System.out.print(" ");
                    t--;
                }
                
            }
            space2+=2;
            if(row!=n){
                System.out.print("*");
            }
            
            System.out.println();
            row--;
        }
    }
}