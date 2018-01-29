package orm;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Main entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "MAIN", schema = "Y2")

public class Main implements java.io.Serializable {

	// Fields

	private Long id;
	private String mainname;
	private Set<Sub> subs = new HashSet<Sub>(0);

	// Constructors

	/** default constructor */
	public Main() {
	}

	/** minimal constructor */
	public Main(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Main(Long id, String mainname, Set<Sub> subs) {
		this.id = id;
		this.mainname = mainname;
		this.subs = subs;
	}

	// Property accessors
	@Id
	@Column(name = "ID", unique = true, nullable = false, precision = 18, scale = 0)
	@SequenceGenerator(name = "idautoRef", sequenceName = "idauto")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "idautoRef")
	public Long getId() {
		return this.id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	@Column(name = "MAINNAME", length = 50)

	public String getMainname() {
		return this.mainname;
	}

	public void setMainname(String mainname) {
		this.mainname = mainname;
	}

	@OneToMany(cascade = CascadeType.ALL, fetch = FetchType.LAZY, mappedBy = "main")

	public Set<Sub> getSubs() {
		return this.subs;
	}

	public void setSubs(Set<Sub> subs) {
		this.subs = subs;
	}

}