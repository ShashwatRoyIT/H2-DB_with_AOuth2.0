package com.learn.curd.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.learn.curd.model.Owner;

@Repository
public interface Ownerrepository extends CrudRepository<Owner,Long>{

}
