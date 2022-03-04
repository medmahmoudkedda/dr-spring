package com.smartmssa.example.itcalculator;

import java.io.Serializable;

public class IncomeDetails implements Serializable {

	static final long serialVersionUID = 1L;

	private int incomeInRupees;
	private double incomeTaxPercentage;

	public IncomeDetails() {
	}

	public int getIncomeInRupees() {
		return this.incomeInRupees;
	}

	public void setIncomeInRupees(int incomeInRupees) {
		this.incomeInRupees = incomeInRupees;
	}

	public double getIncomeTaxPercentage() {
		return this.incomeTaxPercentage;
	}

	public void setIncomeTaxPercentage(double incomeTaxPercentage) {
		this.incomeTaxPercentage = incomeTaxPercentage;
	}

	public IncomeDetails(int incomeInRupees, double incomeTaxPercentage) {
		this.incomeInRupees = incomeInRupees;
		this.incomeTaxPercentage = incomeTaxPercentage;
	}

}
