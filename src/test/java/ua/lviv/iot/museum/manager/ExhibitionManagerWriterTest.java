package ua.lviv.iot.museum.manager;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ua.lviv.iot.museum.models.*;

import java.io.*;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class ExhibitionManagerWriterTest {

    private List<Exhibit> exhibits = new ArrayList<>();
    private ExhibitionManagerWriter exhibitionManagerWriter =
            new ExhibitionManagerWriter();
    private String filePath = "myFile";

    private Armor armor = new Armor("ArmorName", true,
            19, "Ukraine", new Volume(1, 2, 3, 4),
            InterestedPeople.EIGHT_PER_TEN, Topic.WORLD_WAR_II, 30,
            new Date(12, 12, 2018), false, false, Suit.BODY);
    private Crown crown = new Crown("CrownName", true,
            19, "Ukraine", new Volume(4, 3, 2, 1),
            InterestedPeople.SEVEN_PER_TEN, Topic.ANCIENT_ROME, 30,
            new Date(13, 12, 2018), true, 17);
    private Painting painting = new Painting("PaintingName", false,
            19, "Ukraine", new Volume(1, 1, 1, 1),
            InterestedPeople.TEN_PER_TEN, Topic.WORLD_WAR_II, 30,
            new Date(12, 12, 2018), Style.ABSTRACT_ART, false);
    private Vase vase = new Vase("VaseName", false,
            19, "Ukraine", new Volume(3, 3, 3, 5),
            InterestedPeople.NINE_PER_TEN, Topic.ANCIENT_GREECE, 30,
            new Date(12, 12, 2018), "clay", true);

    @BeforeEach
    void preparation() {
        exhibits.add(armor);
        exhibits.add(crown);
        exhibits.add(painting);
        exhibits.add(vase);

        exhibitionManagerWriter = new ExhibitionManagerWriter(filePath);
    }

    @AfterEach
    void clean() {
        exhibits.clear();
    }

    @Test
    void testWriteToFile() {
        File myFile = new File(filePath + ".csv");
        exhibitionManagerWriter.writeToFile(exhibits);

        try (FileInputStream fis = new FileInputStream(myFile);
             InputStreamReader isr =
                     new InputStreamReader(fis, StandardCharsets.UTF_8);
             BufferedReader reader = new BufferedReader(isr)
        ) {
            for (Exhibit exhibit : exhibits) {
                assertEquals(exhibit.getHeaders(), reader.readLine(),
                        "Headers were not written");

                assertEquals(exhibit.toCSV(), reader.readLine(),
                        "Values were not written");
            }
            assertNull(reader.readLine(), "File has some overage");
        } catch (Exception e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Reading ended");
        }
    }

    @Test
    void testGettersAndSettersFilePath() {
        exhibitionManagerWriter.setFilePath(filePath);
        assertEquals(filePath, exhibitionManagerWriter.getFilePath(),
                "Getter or Setter failed");
    }
}
