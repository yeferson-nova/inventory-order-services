package com.ynova.service_inventory.service;

import com.ynova.service_inventory.dto.InventoryRequest;
import com.ynova.service_inventory.dto.InventoryResponse;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

public interface InventoryService {
    Mono<InventoryResponse> createOrder(Mono<InventoryRequest> inventory);

    Mono<InventoryResponse> getInventory(String code);

    Flux<InventoryResponse> getList();
}
