package reviews;

public class Review {

	private Long id;
	private String description;
	private String location;
	private String title;
	private String category;
	private String imageUrl;
	private String imageUrl2;

	public Review(Long id, String description, String location, String title, String category, String imageUrl,
			String imageUrl2) {
		this.location = location;
		this.id = id;
		this.description = description;
		this.title = title;
		this.category = category;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
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

	public String getImageUrl() {
		return imageUrl;
	}

	public String getImageUrl2() {
		return imageUrl2;
	}

}
