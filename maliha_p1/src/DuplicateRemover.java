
import java.io.*;
import java.util.*;
public class DuplicateRemover {
    private Set<String> uniqueWords;

    public void remove(String dataFile) throws IOException{
        String wordInString;
        uniqueWords = new HashSet<String>();
        Scanner scnr=new Scanner(new File(dataFile));
        while(scnr.hasNext())
        {
            wordInString=scnr.next();
            uniqueWords.add(wordInString);
        }
        scnr.close();
    }

    public void write(String outputFile) throws IOException {
        PrintWriter outFile = new PrintWriter(new File(outputFile));
        for (String wordInString : uniqueWords)
        {
            outFile.println(wordInString);
        }
        outFile.flush();
        outFile.close();

    }
}