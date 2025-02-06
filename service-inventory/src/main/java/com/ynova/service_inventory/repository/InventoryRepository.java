package com.ynova.service_inventory.repository;

import org.springframework.data.repository.reactive.ReactiveCrudRepository;

import com.ynova.service_inventory.model.entity.ProductsModel;

import reactor.core.publisher.Mono;

public interface InventoryRepository extends ReactiveCrudRepository<ProductsModel, Integer> {
    Mono<Boolean> exexistsByCode(String code);
    Mono<ProductsModel> findfindByProductId(String productId);
}
