package ua.lviv.iot.second;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import ua.lviv.iot.museum.models.*;

@SpringBootApplication
@EntityScan("ua.lviv.iot")
@ComponentScan("ua.lviv.iot")
public class SecondApplication {

	public static void main(String[] args) {
		SpringApplication.run(SecondApplication.class, args);
	}

	@Bean
	public CommandLineRunner armorBean(final ArmorRepository armorRepository) {
		Armor armor = new Armor("ArmorName", true,
				19, "Ukraine", new Volume(1, 2, 3, 4),
				InterestedPeople.EIGHT_PER_TEN, Topic.WORLD_WAR_II, 30,
				new Date(12, 12, 2018), false, false, Suit.BODY);
		return (args) -> {
			armorRepository.save(armor);
			armorRepository.findAll().forEach(obj -> System.out.println(obj));
		};
	}

	@Bean
	public CommandLineRunner crownBean(final CrownRepository crownRepository) {
		return (args) -> {
			crownRepository.save(new Crown("CrownName", true,
					19, "Ukraine", new Volume(4, 3, 2, 1),
					InterestedPeople.SEVEN_PER_TEN, Topic.ANCIENT_ROME, 30,
					new Date(13, 12, 2018), true, 17));
			crownRepository.findAll().forEach(obj -> System.out.println(obj));
		};
	}

	@Bean
	public CommandLineRunner paintingBean(
			final PaintingRepository paintingRepository) {
		return (args) -> {
			paintingRepository.save(new Painting("PaintingName", false,
					19, "Ukraine", new Volume(1, 1, 1, 1),
					InterestedPeople.TEN_PER_TEN, Topic.WORLD_WAR_II, 30,
					new Date(12, 12, 2018), Style.ABSTRACT_ART, false));
			paintingRepository.findAll().forEach(o -> System.out.println(o));
		};
	}

	@Bean
	public CommandLineRunner vaseBean(final VaseRepository vaseRepository) {
		return (args) -> {
			vaseRepository.save(new Vase("VaseName", false,
					19, "Ukraine", new Volume(3, 3, 3, 5),
					InterestedPeople.NINE_PER_TEN, Topic.ANCIENT_GREECE, 30,
					new Date(12, 12, 2018), "clay", true));
			vaseRepository.findAll().forEach(obj -> System.out.println(obj));
		};
	}
}
