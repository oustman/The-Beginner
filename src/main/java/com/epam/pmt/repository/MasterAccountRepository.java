package com.epam.pmt.repository;

import com.epam.pmt.entities.MasterAccount;
import org.springframework.data.repository.CrudRepository;

public interface MasterAccountRepository extends CrudRepository<MasterAccount, Integer> {
    boolean existsByUserName(String userName);

    MasterAccount findByUserName(String userName);
}
