package Drivers;

public class LowResFactory implements ResFactory{

	@Override
	public LowResDisplay GetDisplayDriver() {
		// TODO Auto-generated method stub
		return new LowResDisplay();
	}

	@Override
	public LowResPrint GetPrintDriver() {
		// TODO Auto-generated method stub
		return new LowResPrint();
	}

}
