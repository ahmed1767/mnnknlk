package Drivers;

public class LowResFactory implements ResFactory{

	@Override
	public Display GetDisplayDriver() {
		// TODO Auto-generated method stub
		return new LowResDisplay();
	}

	@Override
	public Print GetPrintDriver() {
		// TODO Auto-generated method stub
		return new LowResPrint();
	}

}
