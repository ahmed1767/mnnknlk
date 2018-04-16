package Drivers;

public class HighResFactory implements ResFactory{

	@Override
	public HighResDisplay GetDisplayDriver() {
		// TODO Auto-generated method stub
		return new HighResDisplay();
	}

	@Override
	public HighResPrint GetPrintDriver() {
		// TODO Auto-generated method stub
		return new HighResPrint();
	}

}
