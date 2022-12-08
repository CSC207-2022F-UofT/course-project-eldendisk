package WritingCSV;

import java.io.*;
import java.util.Scanner;

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
            String tempFile = "temp.txt";
            File old = new File(filepath);
            File newf = new File(tempFile);

            try {
                FileWriter fw = new FileWriter(tempFile, true);
                BufferedWriter bw = new BufferedWriter(fw);
                PrintWriter pw = new PrintWriter(bw);
                Scanner sc = new Scanner(new File(filepath));

                while (sc.hasNext()){
                    String line = sc.nextLine();
                    if ((int) line.charAt(0) != remove_line){
                        pw.println(line);
                    }
                }
                sc.close();
                pw.flush();
                pw.close();
                old.delete();
                File dump = new File(filepath);
                newf.renameTo(dump);
            }
            catch (Exception e) {
                throw new RuntimeException(e);
            }
    }

    public static void OverWrite(String filepath, String overwriting_info, int id) {
        String tempFile = "temp.txt";
        File old = new File(filepath);
        File newf = new File(tempFile);

        try {
            FileWriter fw = new FileWriter(tempFile, true);
            BufferedWriter bw = new BufferedWriter(fw);
            PrintWriter pw = new PrintWriter(bw);
            Scanner sc = new Scanner(new File(filepath));

            while (sc.hasNext()){
                String line = sc.nextLine();
                if ((int) line.charAt(0) == id){
                    pw.println(overwriting_info);
                }
                else{
                    pw.println(line);
                }
            }
            sc.close();
            pw.flush();
            pw.close();
            old.delete();
            File dump = new File(filepath);
            newf.renameTo(dump);
        }
        catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

