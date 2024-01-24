class interface_segregation{
	public static void main(String[] arg) {
		
	}
	void drive(Vehical drivable) {
		drivable.diesel();
		drivable.petrol();
		drivable.gas();
	}
}

interface Vehical extends car,bike,plain{
	void go();
}

interface car{
	void diesel();
}

interface bike{
	void petrol();
}

interface plain{
	void gas();
}
