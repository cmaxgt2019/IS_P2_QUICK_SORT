package gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services;


public class DataPrinter implements IDataPrinter{

    @Override
    public void PrintWords(String words[]){
        int n = words.length;
        for (int i=0; i<n; ++i)
            System.out.print(words[i] + " ");
        System.out.println();
    }
    
    
    
}
