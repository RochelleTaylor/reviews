package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();
	private static Review Caribbeanvacation = new Review(28L,
			"The Caribbean is a region that consists of the Caribbean Sea, its islands and the surrounding coasts. The region is southeast of the Gulf of Mexico and the North American mainland, east of Central America, and north of South America.",
			"Caribbean", "Caribbean", "Caribbean Vacation", "Beautiful white sand and clear blue water",
			"./images/caribbean.jpg",
			"Barbuda: is a small island located in the eastern Caribbean that forms part of the sovereign Commonwealth nation of Antigua and Barbuda. It is located north of Antigua Island and is part of the Leeward Islands. Antigua and Barbuda became a sovereign nation on 1 November 1981 but remained part of the British Commonwealth and its constitutional monarchy.[4] The island is a popular tourist destination due to its moderate climate and coastline.",
			"./images/barbuda.jpg");
	private static Review Icelandvacation = new Review(38L,
			"The land of fire and ice, known for the Northern Lights and The Blue Lagoon ", "Iceland", "Iceland",
			"Iceland Vacation",
			"Blue Lagoon: "
					+ "The warm waters are rich in minerals like silica and sulfur and bathing in the Blue Lagoon is reputed to help some people suffering from skin diseases such as psoriasis. ... The lagoon is a man-made lagoon which is fed by the water output of the nearby geothermal power plant Svartsengi and is renewed every two days",
			"./images/BlueLagoon.jpg",
			"Norther Lights: The bright dancing lights of the aurora are actually collisions between electrically charged particles from the sun that enter the earth's atmosphere. The lights are seen above the magnetic poles of the northern and southern hemispheres. They are known as 'Aurora borealis' in the north and 'Aurora australis' in the south.. \r\n"
					+ "Auroral displays appear in many colours although pale green and pink are the most common. Shades of red, yellow, green, blue, and violet have been reported. The lights appear in many forms from patches or scattered clouds of light to streamers, arcs, rippling curtains or shooting rays that light up the sky with an eerie glow.",
			"./images/northernlights.jpg");
	private static Review Hawaiivacation = new Review(58L, "Beautiful scenerey, total relaxation and fun for all!",
			"Hawaii", "Hawaii", "Hawaii Vacation",
			"The Hawaiian Islands are a special place that can't be matched by other island destinations, which is one reason why people make repeated visits to the Islands each year. ... Of the eight, six are open to visitors; they include Oahu, Maui, Kauai, Molokai, Lanai, and Hawaii (often referred to as the Big Island)",
			"./images/hawaii.jpg",
			"Spanning 17 miles along Kauai’s North Shore, the Napali Coast is a sacred place defined by extraordinary natural beauty. These emerald-hued cliffs with razor-sharp ridges tower above the Pacific Ocean, revealing beautiful beaches and waterfalls that plummet to the lush valley floor. The rugged terrain appears much as it did centuries ago when Hawaiian settlements flourished in these deep, narrow valleys, existing only on the food they could grow and the fish they could catch",
			"./images/hawaii2.jpg");
	private static Review Greecevaction = new Review(68L,
			"Greece has the longest coastline in Europe and is the southernmost country in Europe. The mainland has rugged mountains, forests, and lakes, but the country is well known for the thousands of islands dotting the blue Aegean Sea to the east, the Mediterranean Sea to the south, and the Ionian Sea to the west",
			"Greece", "Greece", "Greece Vacation",
			"the island of Santorini is probably the most intriguing island of Greece. Simply its name is more than enough to unfold in mind stunning sunsets and scenery, white, red and black sand beaches, impresive traditional houses, balconies with vew to the Volcano and and lively night life. All the above, allong with the remains of the antiquity and the myth of the Lost Atlantis justify the words which the tourists determine this wonderful island.\r\n"
					+ "The active volcano of Santorini erupted in the 50's and ruined many towns of the island. Santorini is also called Thira and its capital is the town of Fira. It is a very touristy island and therefore rather expensive.",
			"./images/santorini.jpg",
			"The Acropolis of Athens is an ancient citadel located on a rocky outcrop above the city of Athens and contains the remains of several ancient buildings of great architectural and historic significance, the most famous being the Parthenon.",
			"./images/Acroplis.jpg");

	public Review findOne(long id) {
		return reviews.get(id);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public ReviewRepository() {
		this(Caribbeanvacation, Icelandvacation, Hawaiivacation, Greecevaction);

	}

	public ReviewRepository(Review... reviews) {
		populateReviewsMap(reviews);
	}

	private void populateReviewsMap(Review... reviews) {
		for (Review review : reviews) {
			this.reviews.put(review.getId(), review);
		}
	}

}
