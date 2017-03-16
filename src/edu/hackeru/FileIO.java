package edu.hackeru;

import java.io.*;

/**
 * Created by hackeru on 13/03/2017.
 */
public class FileIO {

    public static String read(String file){
        BufferedReader reader = null;
        try {
            StringBuilder builder = new StringBuilder();
            reader = new BufferedReader(new FileReader(file));
            String line = null;
            while ((line = reader.readLine()) != null) {
                builder.append(line).
                        append(System.lineSeparator());
            }
            return builder.toString();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
          close(reader);
        }
        return null;
    }

    private static void close(Closeable closable) {
        if (closable != null) {
            try {
                closable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    public static void write(String file, String data){
       write(file, data, false);
    }

    public static void writeln(String file, String data, boolean append){
        write(file, data + System.lineSeparator(), append);
    }

    public static void write(String file, String data, boolean append){
        FileWriter fileWriter = null;
        try {
            fileWriter = new FileWriter(file, append);
            fileWriter.write(data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            close(fileWriter);
        }
    }
}