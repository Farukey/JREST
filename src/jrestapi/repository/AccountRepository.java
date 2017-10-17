/**
 * 
 */
package jrestapi.repository;

import org.springframework.data.repository.CrudRepository;

import jrestapi.bean.Account;

/**
 * @author Abdul
 *
 */
public interface AccountRepository extends CrudRepository<Account, Long> {

}
