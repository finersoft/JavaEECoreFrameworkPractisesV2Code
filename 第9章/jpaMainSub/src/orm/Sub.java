package orm;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

/**
 * Sub entity. @author MyEclipse Persistence Tools
 */
@Entity
@Table(name = "SUB", schema = "Y2")

public class Sub implements java.io.Serializable {

	// Fields

	private Long id;
	private Main main;
	private String subname;

	// Constructors

	/** default constructor */
	public Sub() {
	}

	/** minimal constructor */
	public Sub(Long id) {
		this.id = id;
	}

	/** full constructor */
	public Sub(Long id, Main main, String subname) {
		this.id = id;
		this.main = main;
		this.subname = subname;
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

	@ManyToOne(fetch = FetchType.LAZY)
	@JoinColumn(name = "MAINID")

	public Main getMain() {
		return this.main;
	}

	public void setMain(Main main) {
		this.main = main;
	}

	@Column(name = "SUBNAME", length = 50)

	public String getSubname() {
		return this.subname;
	}

	public void setSubname(String subname) {
		this.subname = subname;
	}

}