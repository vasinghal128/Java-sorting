public class insertionsort {
    public static void insertion(int a[]){
        for(int i=1;i<a.length;i++){
            int curr = a[i];
            int prev = i-1;
            // find out right place
            while(prev>=0 && a[prev]>curr){
                a[prev+1] = a[prev];
                prev--;
            }
            //insertion
            a[prev+1] = curr;
        }
        for(int j=0;j<a.length;j++){
            System.out.print(a[j]);
        }
    }
    public static void main(String arags[]){
        int a[] = {5,4,1,3,2};
        insertion(a);


    }    
}
