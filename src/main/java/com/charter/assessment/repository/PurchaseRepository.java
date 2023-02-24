package com.charter.assessment.repository;

import com.charter.assessment.entity.Purchase;
import org.springframework.data.repository.CrudRepository;

public interface PurchaseRepository extends CrudRepository<Purchase, Long> {
}