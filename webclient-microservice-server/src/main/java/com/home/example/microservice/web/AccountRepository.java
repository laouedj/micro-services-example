package com.home.example.microservice.web;

import java.util.List;

/**
 * @author Ahmed LAOUEDJ
 *
 */

public interface AccountRepository {
	
	List<Account> getAllAccounts();
	
	Account getAccount(String number);
}