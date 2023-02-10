package org.antwalk.account;

import org.antwalk.interfaces.Account;
import org.springframework.stereotype.Component;
///import org.springframework.stereotype.Component;

@Component("current")
public class Current implements Account {

	public String showAccount() {
		return "This is a Current Account";
	}
}
