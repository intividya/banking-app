package com.pmz.simplebankingapp.service.impl;

import com.pmz.simplebankingapp.domain.entity.Transaction;
import com.pmz.simplebankingapp.repository.TransactionRepository;
import com.pmz.simplebankingapp.service.TransactionService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TransactionServiceImpl implements TransactionService {

	@Autowired
	private TransactionRepository transactionRepository;

	@Override
	public List<Transaction> findTransactionsByCardId(long id) {
		return transactionRepository.findTransactionsByCardId(id);
	}

}
