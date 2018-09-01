package poma.engine;

import java.io.Serializable;
import java.time.LocalDate;

public class Keys implements Serializable, KeySchema {

	private static final long serialVersionUID = -1605016418534620011L;
	
	private LocalDate date;
	private Long drau;
	private String fru;
	
	public Keys() {}
	public Keys(LocalDate date) {
		this.date = date; 
	}
	public Keys(Long drau) {
		this.drau = drau;
	}
	public Keys(String fru) {
		this.fru = fru;
	}
	public Keys(LocalDate date, Long drau, String fru) {
		this.date = date;
		this.drau = drau;
		this.fru = fru;
	}

	public LocalDate getDate() {
		return date;
	}

	public void setDate(LocalDate date) {
		this.date = date;
	}

	public Long getDrau() {
		return drau;
	}

	public void setDrau(Long drau) {
		this.drau = drau;
	}

	public String getFru() {
		return fru;
	}

	public void setFru(String fru) {
		this.fru = fru;
	}
	
	public Keys completeKey(Long keyO, Long keyS, String keyT) {
		return null;
	}
	
	public Long toLong() {
		return 2L;
	}

	@Override
	public Long generateFLKey() {
		return null;
	}

	@Override
	public Long generateSLKey() {
		return null;
	}

	@Override
	public String generateTLKey() {
		return null;
	}

	@Override
	public Keys recoverKey() {
		return null;
	}
	
	

}
