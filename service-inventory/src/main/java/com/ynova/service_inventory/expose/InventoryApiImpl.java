package com.ynova.service_inventory.expose;


import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;


import com.ynova.service_inventory.api.InventoryApi;
import com.ynova.service_inventory.api.InventoryApiDelegate;
import com.ynova.service_inventory.dto.InventoryRequest;
import com.ynova.service_inventory.dto.InventoryResponse;
import com.ynova.service_inventory.dto.OrderInvRequest;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
@AllArgsConstructor
public class InventoryApiImpl implements InventoryApiDelegate {

    /**
     * GET /inventories/{productId} : Obtener el inventario de un producto en
     * especifico
     *
     * @param productId (required)
     * @return Detalles del inventario del producto (status code 200)
     *         or Inventario no encontrado (status code 404)
     * @see InventoryApi#getInventory
     */
    @Override
    public Mono<InventoryResponse> getInventory(String productId, ServerWebExchange exchange) {

    }

    /**
     * GET /inventories : Listar todos los inventarios
     *
     * @return Lista de inventarios (status code 200)
     * @see InventoryApi#listInventory
     */
    public Flux<InventoryResponse> listInventory(ServerWebExchange exchange) {

    }

    /**
     * POST /inventories : Registrar el inventario para una nueva orden
     *
     * @param inventoryRequest (required)
     * @return Inventario registrado exitosamente (status code 201)
     * @see InventoryApi#registerInventory
     */
    public Mono<InventoryResponse> registerInventory(Mono<InventoryRequest> inventoryRequest, ServerWebExchange exchange) {

    }

    /**
     * PUT /inventories/{productId} : Actualizar el inventario de una orden
     *
     * @param productId       (required)
     * @param orderInvRequest (required)
     * @return Inventario actualizado exitosamente (status code 200)
     *         or Inventario no encontrado (status code 404)
     * @see InventoryApi#updateInventory
     */
    public Mono<Void> updateInventory(String productId, Mono<OrderInvRequest> orderInvRequest, ServerWebExchange exchange) {

    }

}
