public class b {
    public static void main(String[] args) {
        int star1=0;
        int star2=0;
        int n=5;
        int space1=n-1;
        int space2=-1;
        int row=n;
        while(row>0){
            
                if(row==1||row==n/2+1||row==n){
                    star1=n;
                    while(star1>1){
                        System.out.print("*");
                        star1--;
                    }
                    
                }else{
                      space1=n;
                    System.out.print("*");
                    while(space1>1){
                        System.out.print(" ");
                        space1--;
                    }
                    System.out.print("*");
                }
                System.out.println();
                row--;
            }            
        }
    }

