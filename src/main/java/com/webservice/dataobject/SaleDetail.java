package com.webservice.dataobject;

public class SaleDetail {
	protected String description;
    protected Amount base;
    protected String taxType;
    protected double taxesPercent;
    protected Amount taxes;
	protected Amount total;

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Amount getBase() {
		return base;
	}

	public void setBase(Amount base) {
		this.base = base;
	}

	public String getTaxType() {
		return taxType;
	}

	public void setTaxType(String taxType) {
		this.taxType = taxType;
	}

	public double getTaxesPercent() {
		return taxesPercent;
	}

	public void setTaxesPercent(double taxesPercent) {
		this.taxesPercent = taxesPercent;
	}

	public Amount getTaxes() {
		return taxes;
	}

	public void setTaxes(Amount taxes) {
		this.taxes = taxes;
	}

	public Amount getTotal() {
		return total;
	}

	public void setTotal(Amount total) {
		this.total = total;
	}
}
