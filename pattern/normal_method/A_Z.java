public class A_Z {
    public static void main(String[] args) {
        int n=5;
        int row=n;
        int Star=0;
        int star1=0;
        int star2=0;
        int space=0;
        int space1=n-1;
        int space2=-1;
        System.out.println("A Pattern\n");
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
                if(row==(n/2)+1){
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

        //B
        System.out.println("\n\nB Pattern\n");
        row=n;
        space1=n-1;
        space2=n-2;
        while(row>0){
            if(row==1||row==n||row==n/2+1){
                int t=space1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                int t=space2;
                System.out.print("*");
                while(t>0){
                    System.out.print(" ");
                    t--;
                }
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }

            //C
            System.out.println("\n\nC Pattern\n");
            row=n;
            space1=n-1;
            space2=n-2;
            while(row>0){
            if(row==1||row==n){
                int t=space1;
                System.out.print(" ");
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }

            //D
        System.out.println("\n\nD Pattern\n");
        row=n;
        star1=n-1;
        space1=n-2;
        while(row>0){
            if(row==1||row==n){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                System.out.print("*");
                int t=space1;
                while(t>0){
                    System.out.print(" ");
                    t--;
                }
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }



        //E
        System.out.println("\n\nE Pattern\n");
        row=n;
        star1=n;
        space1=n-2;
        while(row>0){
            if(row==1||row==n||row==n/2+1){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }


        //F
        System.out.println("\n\nF Pattern\n");
        row=n;
        star1=n;
        space1=n-2;
        while(row>0){
            if(row==n||row==n/2+1){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                System.out.print("*");
               
            }   
            System.out.println();
            row--;
            }


        //G
        System.out.println("\n\nG Pattern\n");
        //H
        System.out.println("\n\nH Pattern\n");
        
        row=n;
        star1=n-2;
        space1=n-2;
        while(row>0){
            System.out.print("*");
            if(row==n/2+1){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                
                int t=space1;
                while(t>0){
                    System.out.print(" ");
                    t--;
                }
               
            }   
            System.out.println("*");
            row--;
            }



        //I
        System.out.println("\n\nI Pattern\n");
        row=n;
        star1=n;
        space1=n-2;
        while(row>0){
            if(row==1||row==n){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                
                int t=space1;
                while(t>0){
                    if(t==n/2+1){
                        System.out.print("*");
                        t--;
                    }else{
                        System.out.print(" ");
                        t--;
                    }
                }
            }   
            System.out.println();
            row--;
            }


        //J
        System.out.println("\n\nJ Pattern\n");
        row=n;
        star1=n;
        space1=n-1;
        while(row>0){
            if(row==n){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else if(row==1){
                System.out.print(" ");
                int t=star1-2;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
                System.out.print(" ");
            }else if(row==2){
                System.out.print("*");
                int t=space1-1;
                while(t>0){
                    System.out.print(" ");
                    t--;
                }
                System.out.print("*");
            }else{
                int t=space1;
                while(t>0){
                    System.out.print(" ");
                    t--;
                }
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }

            //K
            System.out.println("\n\nK Pattern\n");



            //L
            System.out.println("\n\nL Pattern\n");
            row=n;
            star1=n;
            space1=n-1;
            while(row>0){
            if(row==1){
                int t=star1;
                while(t>0){
                    System.out.print("*");
                    t--;
                }
            }else{
                System.out.print("*");
            }   
            System.out.println();
            row--;
            }

            //M
            System.out.println("\n\nM Pattern\n");
            //N
            System.out.println("\n\nN Pattern\n");
            //O
            System.out.println("\n\nO Pattern\n");
            //P
            System.out.println("\n\nP Pattern\n");
            //Q
            System.out.println("\n\nQ Pattern\n");
            //R
            System.out.println("\n\nR Pattern\n");





    }
}
