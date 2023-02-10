package org.antwalk.account;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;

@Component("savings")
public class Savings implements Account{

	public String showAccount() {
		return "This is a Savings account";
	}
}
