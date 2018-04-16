package Drivers;

public class ControlPanel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("<-----------Inside a High Res Driver--------------->");
		HighResFactory highRes=new HighResFactory();
		HighResDisplay highDisp= highRes.GetDisplayDriver();
		HighResPrint highPrint=highRes.GetPrintDriver();
		
		System.out.println(highDisp.DisplayDriverName());
		System.out.println(highPrint.PrintDriverName());
		System.out.println("<-----------Inside a Low Res Driver--------------->");
		
		LowResFactory lowRes= new LowResFactory();
		LowResDisplay lowDisp= lowRes.GetDisplayDriver();
		LowResPrint lowPrint=lowRes.GetPrintDriver();
		
		System.out.println(lowDisp.DisplayDriverName());
		System.out.println(lowPrint.PrintDriverName());

	}

}
