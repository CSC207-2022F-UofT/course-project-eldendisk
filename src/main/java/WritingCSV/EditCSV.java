package WritingCSV;

import java.io.*;

public class EditCSV {

    public static void Write(String line, String filepath) throws IOException {
        /*** Writes the line into the file provided, assuming it's already put in the csv form. i.e. It's already in
         * the form separated by comma, for example, "1, Magician, 90".
          */
        FileWriter fw = new FileWriter(filepath, true);
        PrintWriter pw = new PrintWriter(fw);
        pw.println(line);
        pw.flush();
        pw.close();
    }
    public static void DeleteLineById(String filepath, int remove_line) throws IOException {
        int position = 0;
        String tempFile = "temp.txt";
        File old = new File(filepath);
        File newf = new File(tempFile);
        String curr_line ;
        String data[];

        FileWriter fw = new FileWriter(filepath, true);
        PrintWriter pw = new PrintWriter(fw);

        FileReader fr = new FileReader(filepath);
        BufferedReader br = new BufferedReader(fr);

        while( (curr_line= br.readLine()) != null && position != remove_line){
                pw.println(curr_line);
            }
        fw.close();
            pw.close();
            fr.close();
            br.close();
            old.delete();
            File dump = new File(filepath);
            newf.renameTo(dump);
        }

    }
}
