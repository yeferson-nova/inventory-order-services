package com.ynova.service_inventory.model.dto;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

import com.ynova.service_inventory.dto.InventoryRequest;
import com.ynova.service_inventory.dto.InventoryResponse;
import com.ynova.service_inventory.model.entity.ProductsModel;

@Mapper
public interface InventoryMapper {
    InventoryMapper INSTANCE = Mappers.getMapper(InventoryMapper.class);

    @Mapping(target = "code", source = "idProduct")
    ProductsModel requestToModel(InventoryRequest inventoryRequest);

    @Mapping(target = "idProduct", source = "code")
    InventoryResponse modelToResponse(ProductsModel productsModel);
}

