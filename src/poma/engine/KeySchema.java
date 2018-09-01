package poma.engine;

public interface KeySchema {
	
	public Long generateFLKey();
	
	public Long generateSLKey();
	
	public String generateTLKey();
	
	public Keys recoverKey();

}
