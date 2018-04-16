package Drivers;

public class HighResFactory implements ResFactory{

	@Override
	public Display GetDisplayDriver() {
		// TODO Auto-generated method stub
		return new HighResDisplay();
	}

	@Override
	public Print GetPrintDriver() {
		// TODO Auto-generated method stub
		return new HighResPrint();
	}

}
