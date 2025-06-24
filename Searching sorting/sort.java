import java.util.Arrays;
public class sort{

    public static int[] divide_array(int[] t,int start,int end){
        int[] l=new int[end-start];
        for(int i=start,j=0;i<end;j++,i++){
            l[j]=t[i];
        }
        return l;
    }


    public static int[] marge_sort(int[] a){
        int[] l={};
        int[] r={};
        if(a.length>1){
            int mid= a.length/2;
            l=divide_array(a, 0, mid);
            r=divide_array(a, mid, a.length);
            l=marge_sort(l);
            r=marge_sort(r);
        }
        int i=0,j=0,k=0;
        while(i<l.length && j<r.length){
            if(l[i]<r[j]){
                a[k]=l[i];
                i++;
            }else{
                a[k]=r[j];
                j++;
            }
                k++;
           
        }
         while (i < l.length) a[k++] = l[i++];
        while (j < r.length) a[k++] = r[j++];
            return a;
    }


    public static void main(String[] args) {


     int[] a={12,34,87,2,5,63,4,9};
        a=marge_sort(a);
        System.out.println("Bubble Sort : "+Arrays.toString(Bubble_sort(a)));
        System.out.println("Marge Sort : "+Arrays.toString(marge_sort(a)));
        System.out.println("Selection Sort with Acending order : "+Arrays.toString(selection_sort_acending(a)));
        System.out.println("Selection Sort with Descending order : "+Arrays.toString(selection_sort_decending(a)));

    }


    public static int[] selection_sort_acending(int[] a){
        int min;
        for (int i = 0; i < a.length; i++) {
            min=i;
            for (int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min=j;
                }
            }
            int temp=a[min];
            a[min]=a[i];
            a[i]=temp;   
        }
        return a;
    }

    public static int[] selection_sort_decending(int[] a){
        int max;
        for (int i = 0; i < a.length; i++) {
            max=i;
            for (int j=i+1;j<a.length;j++){
                if(a[max]<a[j]){
                    max=j;
                }
            }
            int temp=a[max];
            a[max]=a[i];
            a[i]=temp;   
        }
        return a;
    }

    
    public static int[] Bubble_sort(int[] a){
        for (int i = 0; i <a.length; i++) {
            for (int j=0;j<a.length-(i+1);j++){
                if(a[j]>a[j+1]){
                    int temp=a[j];
                    a[j]=a[j+1];
                    a[j+1]=temp;
                }
            }
               
        }
        return a;
    }









}