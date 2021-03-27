package com.example.springmarket.domain.repository;

import com.example.springmarket.domain.Purchase;

import java.util.List;
import java.util.Optional;

public interface PurchaseRepository {

    List<Purchase> getAll();
    Optional<List<Purchase>> getByClientId(String clientId);
    Purchase save(Purchase purchase);

}
