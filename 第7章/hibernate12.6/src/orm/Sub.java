package orm;

/**
 * Sub entity. @author MyEclipse Persistence Tools
 */

public class Sub implements java.io.Serializable {

	private Long id;
	private Main main;
	private String subname;

	// Constructors

	/** default constructor */
	public Sub() {
	}

	/** full constructor */
	public Sub(Main main, String subname) {
		this.main = main;
		this.subname = subname;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

}