package gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services;

public class QuickSort implements IQuickSort{

    
    private static int divition(String words[], int left, int right) {
        String pivot = words[left];
        while (true) {
            while (words[left].compareTo(pivot) < 0) {
                left++;
            }
            while (words[right].compareTo(pivot) > 0) {
                right--;
            }
            if (left >= right) {
                return right;
            } else {
                String tmp = words[left];
                words[left] = words[right];
                words[right] = tmp;
                left++;
                right--;
            }
        }
    }
    
    @Override
    public  void quicksort(String words[], int left, int right) {
        if (left < right) {
            int partition = divition(words, left, right);
            quicksort(words, left, partition);
            quicksort(words, partition + 1, right);
        }
    }
    
    
    
    
}
