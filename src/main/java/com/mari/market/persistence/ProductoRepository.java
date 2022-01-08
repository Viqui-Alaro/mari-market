package com.mari.market.persistence;

import com.mari.market.persistence.crud.ProductoCrudRepository;
import com.mari.market.persistence.entity.Producto;

import java.util.List;

public class ProductoRepository {

    private ProductoCrudRepository productoCrudRepository;

    public List<Producto> getAll(){
        return (List<Producto>) productoCrudRepository.findAll();
    }

}
