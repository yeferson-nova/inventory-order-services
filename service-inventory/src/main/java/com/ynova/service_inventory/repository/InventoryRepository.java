package com.ynova.service_inventory.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;
import org.springframework.stereotype.Repository;

import com.ynova.service_inventory.model.entity.ProductsModel;

import reactor.core.publisher.Mono;

@Repository
public interface InventoryRepository extends ReactiveCrudRepository<ProductsModel, Integer> {
    Mono<Boolean> existsByCode(String code);
    Mono<ProductsModel> findByCode(String code);
}
