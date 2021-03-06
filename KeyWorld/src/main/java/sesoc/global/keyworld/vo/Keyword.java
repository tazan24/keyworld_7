package sesoc.global.keyworld.vo;

public class Keyword {
	private int keyword_num;
	private String nation_num;
	private String keyword;
	private Double latitude;
	private Double longitude;
	private Double point;
	
	public Keyword() {}

	public Keyword(int keyword_num, String nation_num, String keyword, Double latitude, Double longitude,
			Double point) {
		super();
		this.keyword_num = keyword_num;
		this.nation_num = nation_num;
		this.keyword = keyword;
		this.latitude = latitude;
		this.longitude = longitude;
		this.point = point;
	}

	public int getKeyword_num() {
		return keyword_num;
	}

	public void setKeyword_num(int keyword_num) {
		this.keyword_num = keyword_num;
	}

	public String getNation_num() {
		return nation_num;
	}

	public void setNation_num(String nation_num) {
		this.nation_num = nation_num;
	}

	public String getKeyword() {
		return keyword;
	}

	public void setKeyword(String keyword) {
		this.keyword = keyword;
	}

	public Double getLatitude() {
		return latitude;
	}

	public void setLatitude(Double latitude) {
		this.latitude = latitude;
	}

	public Double getLongitude() {
		return longitude;
	}

	public void setLongitude(Double longitude) {
		this.longitude = longitude;
	}

	public Double getPoint() {
		return point;
	}

	public void setPoint(Double point) {
		this.point = point;
	}

	@Override
	public String toString() {
		return "Keyword [keyword_num=" + keyword_num + ", nation_num=" + nation_num + ", keyword=" + keyword
				+ ", latitude=" + latitude + ", longitude=" + longitude + ", point=" + point + "]";
	}
	
}
