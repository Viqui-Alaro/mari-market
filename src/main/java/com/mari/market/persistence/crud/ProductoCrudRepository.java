package com.mari.market.persistence.crud;

import com.mari.market.persistence.entity.Producto;
import org.springframework.data.repository.CrudRepository;

public interface ProductoCrudRepository extends CrudRepository<Producto,Integer> {


}
