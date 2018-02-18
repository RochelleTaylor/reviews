package reviews;

import static org.hamcrest.Matchers.containsInAnyOrder;
import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;
import static org.mockito.Mockito.when;

import java.util.Collection;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

public class ReviewRepositoryTest {

	private ReviewRepository underTest;

	private long firstReviewId = 28L;

	@Mock
	private Review firstReview;

	private long secondReviewId = 38L;
	@Mock
	private Review secondReview;

	private long thirdReviewId = 58L;
	@Mock
	private Review thirdReview;
	@Mock
	private Review fourthReview;
	private long fourthReviewId = 68L;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		when(firstReview.getId()).thenReturn(firstReviewId);
		when(secondReview.getId()).thenReturn(secondReviewId);
		when(thirdReview.getId()).thenReturn(thirdReviewId);
		when(fourthReview.getId()).thenReturn(fourthReviewId);
	}

	@Test
	public void shouldFindFirstReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview, secondReview);
		Review result = underTest.findOne(firstReviewId);

		assertThat(result, is(firstReview));
	}

	@Test
	public void shouldFindSecondReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview, secondReview, thirdReview);
		Review result = underTest.findOne(secondReviewId);
		assertThat(result, is(secondReview));
	}

	@Test
	public void shouldFindThirdReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview, secondReview, thirdReview);
		Review result = underTest.findOne(thirdReviewId);

		assertThat(result, is(thirdReview));
	}

	@Test
	public void shouldFindFourthReview() {
		ReviewRepository underTest = new ReviewRepository(firstReview, secondReview, thirdReview, fourthReview);
		Review result = underTest.findOne(fourthReviewId);

		assertThat(result, is(fourthReview));
	}

	@Test
	public void shouldFindAll() {
		underTest = new ReviewRepository(firstReview, secondReview, thirdReview, fourthReview);
		Collection<Review> result = underTest.findAll();
		assertThat(result, containsInAnyOrder(firstReview, secondReview, thirdReview, fourthReview));
	}
}
