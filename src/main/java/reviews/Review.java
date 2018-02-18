package reviews;

public class Review {

	private Long id;
	private String description;
	private String location;
	private String title;
	private String category;
	private String imageUrl;
	private String imageUrl2;
	private String imageDescription;
	private String imageDescription2;

	public Review(Long id, String location, String title, String description, String category, String imageDescription,
			String imageUrl, String imageDescription2, String imageUrl2) {
		this.location = location;
		this.id = id;
		this.description = description;
		this.title = title;
		this.category = category;
		this.imageUrl = imageUrl;
		this.imageUrl2 = imageUrl2;
		this.imageDescription = imageDescription;
		this.imageDescription2 = imageDescription2;
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

	public String getImageDescription() {
		return imageDescription;
	}

	public String getImageDescription2() {
		return imageDescription2;
	}

}
