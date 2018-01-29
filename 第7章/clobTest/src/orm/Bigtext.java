package orm;

/**
 * Bigtext entity. @author MyEclipse Persistence Tools
 */

public class Bigtext implements java.io.Serializable {

	// Fields

	private Long id;
	private String bigtext;

	// Constructors

	/** default constructor */
	public Bigtext() {
	}

	/** full constructor */
	public Bigtext(String bigtext) {
		this.bigtext = bigtext;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getBigtext() {
		return this.bigtext;
	}

	public void setBigtext(String bigtext) {
		this.bigtext = bigtext;
	}

}