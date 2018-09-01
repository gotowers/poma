package poma.engine;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Gears implements Serializable, GearSchema {

	private static final long serialVersionUID = -7975302282619282581L;

	@Override
	public Poma startEngine() {
		
		List<Keys> pomaArg = generateGears();
		
		Poma poma = new Poma();
		
		poma.generatePoma(pomaArg.get(1).toLong(), pomaArg.get(3).toString(), pomaArg.get(4).toString());
		
		return null;
	}

	@Override
	public List<Keys> generateGears() {
		
		List<Keys> keysForPoma = new ArrayList<Keys>();
		Keys mainKey = new Keys(LocalDate.now());
		Keys secondKey = new Keys(2L);
		Keys thirdKey = new Keys("fru");
		Gears gf = gearReference();
		
		Keys gfKey = gf.toKeys();
		
		keysForPoma.add(mainKey);
		keysForPoma.add(secondKey);
		keysForPoma.add(thirdKey);
		keysForPoma.add(gfKey);
		
		return keysForPoma;
	}
	
	@Override
	public Gears gearReference() {
		
		Gears ge = new Gears();
		
		return ge;
		
	}
	
	@Override
	public Keys toKeys() {
		
		Keys key = new Keys();
		Long fK = key.generateFLKey();
		Long sK = key.generateSLKey();
		String tK = key.generateTLKey();
		
		key.completeKey(fK, sK, tK);
		
		return key;
		
	}

	@Override
	public Poma poma() {
		
		return startEngine();
		
	}

}
