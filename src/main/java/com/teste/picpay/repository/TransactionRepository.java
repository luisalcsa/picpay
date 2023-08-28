package com.teste.picpay.repository;

import com.teste.picpay.domain.transancion.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransactionRepository extends JpaRepository <Long, Transaction> {
}
