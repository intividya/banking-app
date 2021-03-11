package com.pmz.simplebankingapp.forms;

import javax.validation.constraints.DecimalMax;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotEmpty;
import org.springframework.stereotype.Component;

@Component
public class AddCardForm {

	@NotEmpty
	@DecimalMin("0.00")
	@DecimalMax("99999999999.00")
	private double cardBalance;

	@NotEmpty
	private String currency;

	public double getCardBalance() {
		return cardBalance;
	}

	public void setCardBalance(double cardBalance) {
		this.cardBalance = cardBalance;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

}
