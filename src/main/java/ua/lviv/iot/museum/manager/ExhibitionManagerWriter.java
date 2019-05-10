package ua.lviv.iot.museum.manager;

import ua.lviv.iot.museum.models.Exhibit;

import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.io.BufferedWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.util.List;


public class ExhibitionManagerWriter {

        private String filePath;

        public ExhibitionManagerWriter() { }

        public ExhibitionManagerWriter(final String filePathArg) {
            this.filePath = filePathArg;
        }


        public final void writeToFile(final List<Exhibit> exhibits) {
            File myFile = new File(filePath + ".csv");

            try (FileOutputStream fos = new FileOutputStream(myFile);
                 OutputStreamWriter osw =
                         new OutputStreamWriter(fos, StandardCharsets.UTF_8);
                 BufferedWriter writer = new BufferedWriter(osw)
            ) {
                for (Exhibit exhibit : exhibits) {
                    writer.write(exhibit.getHeaders());
                    writer.newLine();
                    writer.write(exhibit.toCSV());
                    writer.newLine();
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                System.out.println("End of writing to file");
            }
        }


        public final String getFilePath() {
            return filePath;
        }

        public final void setFilePath(final String filePathArg) {
            this.filePath = filePathArg;
        }
}

