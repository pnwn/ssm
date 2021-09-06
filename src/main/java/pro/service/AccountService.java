package pro.service;

import pro.domain.Account;

import java.util.List;

public interface AccountService {

    void save(Account account);

    List<Account> findAll();

}
