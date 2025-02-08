package com.ynova.service_inventory.expose;

import java.time.Duration;

import org.springframework.stereotype.Component;
import org.springframework.web.server.ServerWebExchange;

import com.ynova.service_inventory.api.InventoryApi;
import com.ynova.service_inventory.api.InventoryApiDelegate;
import com.ynova.service_inventory.dto.InventoryRequest;
import com.ynova.service_inventory.dto.InventoryResponse;
import com.ynova.service_inventory.dto.OrderInvRequest;
import com.ynova.service_inventory.service.InventoryService;

import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

@Component
@Slf4j
@AllArgsConstructor
public class InventoryApiImpl implements InventoryApiDelegate {

    private final InventoryService inventoryService;

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

        return inventoryService.getInventory(productId);
    }

    /**
     * GET /inventories : Listar todos los inventarios
     *
     * @return Lista de inventarios (status code 200)
     * @see InventoryApi#listInventory
     */
    public Flux<InventoryResponse> listInventory(ServerWebExchange exchange) {
        return inventoryService.getList().delayElements(Duration.ofSeconds(2));
    }

    /**
     * POST /inventories : Registrar el inventario para una nueva orden
     *
     * @param inventoryRequest (required)
     * @return Inventario registrado exitosamente (status code 201)
     * @see InventoryApi#registerInventory
     */
    public Mono<InventoryResponse> registerInventory(Mono<InventoryRequest> inventoryRequest,
            ServerWebExchange exchange) {

        return inventoryService.createOrder(inventoryRequest);

    }

}
