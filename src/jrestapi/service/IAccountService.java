/**
 * 
 */
package jrestapi.service;

import java.util.List;

import jrestapi.bean.Account;

/**
 * @author Abdul
 *
 */
public interface IAccountService {
	
	Account create(Account account);
	Account get(Long accountId);
	List<Account> list();
	Account update(Account account, Long accountId);
	void delete(Long accountId);
}
