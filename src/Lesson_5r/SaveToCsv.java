package Lesson_5r;

import java.io.*;

public class SaveToCsv {

    public static void main(String[] args) {

        String[] myHeader = {"Value1", "Value2", "Value3"};
        int[][] myData = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};

        AppData appData = new AppData(myHeader, myData);
        appData.WriteToFile("D:\\Mytest.csv");

    }

    public static class AppData {
        private String[] header;
        private int[][] data;

       public AppData(String[] header, int[][] data) {
           this.header = header;
           this.data = data;
       }

       public void WriteToFile (String fileName) {
           File file = new File(fileName);

           if (file.exists()) file.delete();


           try (BufferedWriter out = new BufferedWriter(new FileWriter(fileName))) {

               //Пишем заголовок
               for (int i = 0; i < header.length - 1; i++)
                   out.write(header[i]+",");
               if (header.length>0)  out.write(header[header.length - 1]+"\n");

               //Пишем данные
               for (int j = 0; j < data.length - 1; j++) {

                   for (int i = 0; i < data[j].length - 1; i++)
                       out.write(data[j][i] + ",");
                   if (data[j].length > 0)
                       out.write(data[j][data[j].length - 1] + "\n");
               }

           } catch (IOException e) {
               e.printStackTrace();
           }


       }

    }

}
