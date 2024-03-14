package com.example.sample.demo.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.example.sample.demo.Entity.NewEntity;


@Repository
public interface NewRepository extends CrudRepository<NewEntity,Long> {
   
}
