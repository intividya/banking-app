package com.pmz.simplebankingapp.repository;

import com.pmz.simplebankingapp.domain.entity.Transaction;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Long> {

	List<Transaction> findTransactionsByCardId(long id);

}
