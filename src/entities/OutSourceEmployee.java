package entities;

public class OutSourceEmployee extends Employee {

	private Double additionalCharge;
	
		
	public OutSourceEmployee() {
		super();
	}


	public OutSourceEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {
		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;
	}


	public Double getAdditionalCharge() {
		return additionalCharge;
	}


	public void setAdditionalCharge(Double additionalCharge) {
		this.additionalCharge = additionalCharge;
	}
	
	@Override
	public final double payment(){
		return super.payment() + (additionalCharge * 1.10); 
		
	}
	
}
