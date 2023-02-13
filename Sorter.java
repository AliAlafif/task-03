import java.util.Arrays;

public class Sorter{
    public static void main(String[] args) {
        System.out.println("ALi Alafif");
        int[] a={5,6,2,4,6};
        System.out.println(Arrays.toString(SelectionSort(a)));
        System.out.println(Arrays.toString(insertionSort(a)));

    }

public static int[] SelectionSort(int[] array){
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

public static int[] sort(int[] array){
    return SelectionSort(array);
}

public static int[] insertionSort(int[] array){
    for(int i=1;i<array.length;i++){
        int temp=array[i];
        int j;
        for(j=i-1;j>=0 && temp<array[j];j--){
            array[j+1]=array[j];
        }
        array[j+1]=temp;
    }
    return array;
}
}