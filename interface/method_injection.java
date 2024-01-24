class method_injection{
	public static void main(String[] arg) {
		
		var cal24 = new tax2024(300_000);
		
		var cal23 = new tax2023(300_000);
		
		var rep1 = new taxrep();
		rep1.show(cal23);
		
		var rep2 = new taxrep();
		rep2.show(cal24);
		
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

class tax2023 implements taxcal{
	private double incom;
	
	public tax2023(double income) {
		this.incom = income;
	}
	
	@Override
	public double caltax() {
		return incom * 0.2;
	}
}

class taxrep{
	public taxcal cal;
	
//	public taxrep(taxcal cal) {
//		this.setCal(cal);
//	}
	
	public void show(taxcal cal) {
		var tax = cal.caltax();
		System.out.println(tax);
	}
	
//	public void setCal(taxcal cal) {
//		this.cal = cal;
//	}
	
}