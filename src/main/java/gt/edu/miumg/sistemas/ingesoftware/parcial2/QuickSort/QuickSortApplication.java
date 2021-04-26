package gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort;

import gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services.DataPrinter;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services.IDataPrinter;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services.IQuickSort;
import gt.edu.miumg.sistemas.ingesoftware.parcial2.QuickSort.Services.QuickSort;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class QuickSortApplication implements CommandLineRunner{

	public static void main(String[] args) {
		SpringApplication.run(QuickSortApplication.class, args);
	}

    @Override
    public void run(String... args) throws Exception {
        
        
        IQuickSort quickSort = new QuickSort();
        IDataPrinter print = new DataPrinter();
		
		String[] array= {"Gomez", "Hernandez", "Max","Wellinton"};
      
		quickSort.quicksort(array, 0, array.length - 1);
		print.PrintWords(array);
        
    }

}
