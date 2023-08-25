package collectionapiexem.vo;

public class MovieVO {
	// 멤버변수, 상태정보, 속성(property)
	private String title;
	private String director;
	private int year;
	private String country;
	
	// Default Constructor
	public MovieVO() {
	}
	
	// Constructor Overloading
	public MovieVO(String title, String director, int year, String country) {
		this.title = title;
		this.director = director;
		this.year = year;
		this.country = country;
	}

	// getter & setter
	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	// Object의 toString Override
	@Override
	public String toString() {
		return "MovieVO [title=" + title + ", director=" + director + ", year=" + year + ", country=" + country + "]";
	}	
}
