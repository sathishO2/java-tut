
public class constructtor_injection {
	public static void main(String[] arg) {
		
		var cal = new tax2024(300_000);
		
		var rep = new taxrep(cal);
		
		rep.show();
		
	}
}

interface taxcal{
	public double caltax();
}

class tax2024 implements taxcal{
	
	private double incom;
	
	public tax2024(double incom){
		this.incom = incom;
	}
	
	@Override
	public double caltax() {
		return incom * 0.3;
	}
}

class taxrep{
	public taxcal cal;
	
	public taxrep(taxcal cal) {
		this.cal = cal;
	}
	
	public void show() {
		var tax = cal.caltax();
		System.out.println(tax);
	}
	
}