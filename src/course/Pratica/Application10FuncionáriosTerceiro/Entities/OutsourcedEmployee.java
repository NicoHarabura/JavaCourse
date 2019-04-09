package course.Pratica.Application10FuncionáriosTerceiro.Entities;

public class OutsourcedEmployee extends Employee {

	private Double additionalCharges;

	public OutsourcedEmployee() {
		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharges) {
		super(name, hours, valuePerHour);
		this.additionalCharges = additionalCharges;
	}

	public Double getAdditionalCharges() {
		return additionalCharges;
	}

	public void setAdditionalCharges(Double additionalCharges) {
		this.additionalCharges = additionalCharges;
	}

	@Override
	public Double payment() {
		return super.payment() + additionalCharges * 1.1;
	}
}
