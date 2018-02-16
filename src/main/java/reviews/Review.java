package reviews;

public class Review {

	private Long id;
	private String description;
	private String location;
	private String title;
	private String category;

	public Review(Long id, String description, String location, String title, String category) {
		this.location = location;
		this.id = id;
		this.description = description;
		this.title = title;

	}

	public Long getId() {
		return id;

	}

	public String getDescription() {
		return description;
	}

	public String getLocation() {
		return location;
	}

	public String getTitle() {
		return title;
	}

	public String getCategory() {
		return category;
	}

}
