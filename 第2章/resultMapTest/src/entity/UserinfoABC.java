package entity;

import java.util.Date;

public class UserinfoABC {

	private long idABC;
	private String usernameABC;
	private String passwordABC;
	private Long ageABC;
	private Date insertdateABC;

	public UserinfoABC() {
	}

	public long getIdABC() {
		return idABC;
	}

	public void setIdABC(long idABC) {
		this.idABC = idABC;
	}

	public String getUsernameABC() {
		return usernameABC;
	}

	public void setUsernameABC(String usernameABC) {
		this.usernameABC = usernameABC;
	}

	public String getPasswordABC() {
		return passwordABC;
	}

	public void setPasswordABC(String passwordABC) {
		this.passwordABC = passwordABC;
	}

	public Long getAgeABC() {
		return ageABC;
	}

	public void setAgeABC(Long ageABC) {
		this.ageABC = ageABC;
	}

	public Date getInsertdateABC() {
		return insertdateABC;
	}

	public void setInsertdateABC(Date insertdateABC) {
		this.insertdateABC = insertdateABC;
	}

}
