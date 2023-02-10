public class Sorter{
    public static void main(String[] args) {
        System.out.println("ALi Alafif");
    }

public int[] SelectionSort(int[] array){
for(int i=0;i<array.length;i++){
    int min =i;
    for(int j=i+1;j<array.length;j++){
        if(array[j]<array[min]){
            min=j;
        }
    }
    if(i!= min){
        int temp=array[i];
        array[i]=array[min];
        array[min]=temp;
    }
}
return array;
}
}