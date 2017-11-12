package com.home.example.microservice.account;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.log4j.Logger;
import org.springframework.stereotype.Repository;

/**
 * @author Ahmed LAOUEDJ
 *
 */

@Repository
public class AcountRepositoryImpl implements AccountRepository {

	
	private Map<String, Account> accountsByNumber = new HashMap<String, Account>();
	
	public AcountRepositoryImpl() {
		Account account = new Account(1000l, "Waile" , "5115");
		accountsByNumber.put("5115", account);
		account = new Account(2000l, "Rihabe" , "2089");
		accountsByNumber.put("2089", account);
		account = new Account(3000l, "Botayna" , "1286");
		accountsByNumber.put("1286", account);
		Logger.getLogger(AcountRepositoryImpl.class).info("Created StubAccountRepository");
	}
	
	@Override
	public List<Account> getAllAccounts() {
		return new ArrayList<Account>(accountsByNumber.values());
	}

	@Override
	public Account getAccount(String number) {
		return accountsByNumber.get(number);
	}

}
