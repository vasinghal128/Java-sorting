public class selection {
    public static void selectionsort(int a[]){
        for(int i=0;i<a.length-1;i++){
            int min = i;
            for(int j=i+1;j<a.length;j++){
                if(a[min]>a[j]){
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }
        for(int k=0;k<a.length;k++){
            System.out.print(a[k]);
        }
    }
    public static void main(String args[]){
        int a[] = {5,4,2,3,1} ;
        selectionsort(a);
    }    
}
