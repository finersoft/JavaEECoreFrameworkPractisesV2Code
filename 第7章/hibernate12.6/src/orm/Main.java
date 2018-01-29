package orm;

import java.util.HashSet;
import java.util.Set;

/**
 * Main entity. @author MyEclipse Persistence Tools
 */

public class Main implements java.io.Serializable {

	private Long id;
	private String mainname;
	private Set subs = new HashSet(0);

	// Constructors

	/** default constructor */
	public Main() {
	}

	/** full constructor */
	public Main(String mainname, Set subs) {
		this.mainname = mainname;
		this.subs = subs;
	}

	// Property accessors

	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getMainname() {
		return this.mainname;
	}

	public void setMainname(String mainname) {
		this.mainname = mainname;
	}

	public Set getSubs() {
		return this.subs;
	}

	public void setSubs(Set subs) {
		this.subs = subs;
	}

}