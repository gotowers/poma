package poma.engine;

import java.util.List;

public interface GearSchema {
	
	public Poma startEngine();
	
	public List<Keys> generateGears();
	
	public Gears gearReference();
	
	public Keys toKeys();
	
	public Poma poma();

}
