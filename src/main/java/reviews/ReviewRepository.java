package reviews;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import org.springframework.stereotype.Repository;

@Repository
public class ReviewRepository {

	Map<Long, Review> reviews = new HashMap<>();
	private static Review caribbeanvacation = new Review(28L,
			"Visit Aruba where you'll find dependable sunshine and high rise hotels walking distance from the beach ",
			"caribbean", "Caribbean", "Caribbean Vacation", "./images/caribbean.jpg", "./images/barbuda.jpg");
	private static Review icelandvacation = new Review(38L,
			"The land of fire and ice, known for the Northern Lights and The Blue Lagoon ", "iceland", "Iceland",
			"Iceland Vacation", "./images/BlueLagoon.jpg", "./images/northernlights.jpg");
	private static Review hawaiivacation = new Review(58L, "Beautiful scenerey, total relaxation and fun for all!",
			"hawaii", "Hawaii", "Hawaii Vacation", "./images/hawaii.jpg", "./images/hawaii2.jpg");

	public Review findOne(long id) {
		return reviews.get(id);
	}

	public Collection<Review> findAll() {
		return reviews.values();
	}

	public ReviewRepository() {
		this(caribbeanvacation, icelandvacation, hawaiivacation);

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
