package poma.engine;

import java.util.Map;

public class Poma {
	
	private int id;
	private Long mainKey;
	private Long secondKey;
	private String thirdKey;
	private String gearReference;
	private Map<Long,Poma> pomas;
	
	public Poma() {}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Long getMainKey() {
		return mainKey;
	}

	public void setMainKey(Long mainKey) {
		this.mainKey = mainKey;
	}

	public Long getSecondKey() {
		return secondKey;
	}

	public void setSecondKey(Long secondKey) {
		this.secondKey = secondKey;
	}

	public String getThirdKey() {
		return thirdKey;
	}

	public void setThirdKey(String thirdKey) {
		this.thirdKey = thirdKey;
	}

	public String getGearReference() {
		return gearReference;
	}

	public void setGearReference(String gearReference) {
		this.gearReference = gearReference;
	}

	public Map<Long, Poma> getPomas() {
		return pomas;
	}

	public void setPomas(Map<Long, Poma> pomas) {
		this.pomas = pomas;
	}
	
	public Poma generatePoma() {
		return null;
	}

}
