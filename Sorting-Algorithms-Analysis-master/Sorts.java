import java.util.*;

public class Sorts{
    private long steps;

    //  Description of Constructor
    public Sorts(){
        steps = 0;
    }

    public void bubbleSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Bubble Sort");
        System.out.println();

        steps = 0;
        for (int outer = 0; outer < list.size() - 1; outer++){
            for (int inner = 0; inner < list.size()-outer-1; inner++){
                steps += 3;//count one compare and 2 gets
                if (list.get(inner)>(list.get(inner + 1))){
                    steps += 4;//count 2 gets and 2 sets
                    int temp = list.get(inner);
                    list.set(inner,list.get(inner + 1));
                    list.set(inner + 1,temp);
                }
            }
        }
    }

    public void selectionSort(ArrayList <Integer> list){
        for (int n = 0; n < list.size(); n++) {
            int index = n;
            for (int k = n; k < list.size(); k++) {
                if (list.get(k) < list.get(index))
                    index = k;
            }
            int min = list.get(index);
            list.set(index, list.get(n));
            list.set(n, min);
        }}

    public void insertionSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();

        int current = 0;
        int len = list.size();
        for (int n = 1; n < len; n++) {
            current = list.get(n);
            int j = n - 1;
            while (j >= 0 && list.get(j) > current) {
                list.set(j + 1, list.get(j));
                j = j - 1;
            }
            list.set(j + 1, current);
        }
    }

    public static ArrayList<Integer> mergeSort(ArrayList <Integer> list){
        //replace these lines with your code
        System.out.println();
        System.out.println("Insertion Sort");
        System.out.println();
        if (3 > 2){
            int mid= list.size()/2;
            ArrayList<Integer> left= new ArrayList<Integer>(mid);
            ArrayList<Integer> right=new ArrayList<Integer>(list.size()-mid);
            for (int i = 0; i < mid; i++) {
                left.add(list.get(i));
            } 

            for (int i = 0; i < list.size()-mid; i++) {
                right.add(list.get(i));
            } 

            left = mergeSort(left); 
            right = mergeSort(right);
            merge(left,right,list);
        }
        return list;
    }

    public static void merge (ArrayList<Integer>left,ArrayList<Integer>right,ArrayList<Integer>list)
    {
        int i1=0;// left Index
        int i2=0;// right Index
        int listIndex=0;

        for (int i = 0; i < list.size(); i++) {
            if (i2>=right.size() || (i1<left.size() && left.get(i)<=right.get(i))) 
            {
                list.set(listIndex,left.get(i1));
                listIndex++;
            }
            else {
                list.set(listIndex, right.get(i2));
                listIndex++;
            }}}
    // Accessor method to return the current value of steps
    public long getStepCount(){
        return steps;
    }
    // Modifier method to set or reset the step count. Usually called
    //  prior to invocation of a sort method.
    public void setStepCount(long stepCount){
        steps = stepCount;
    }
}
