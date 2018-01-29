package entity;

public class BigText {

	private long id;
	private String bigtext;

	public BigText() {
	}

	public BigText(long id, String bigtext) {
		super();
		this.id = id;
		this.bigtext = bigtext;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getBigtext() {
		return bigtext;
	}

	public void setBigtext(String bigtext) {
		this.bigtext = bigtext;
	}

}
