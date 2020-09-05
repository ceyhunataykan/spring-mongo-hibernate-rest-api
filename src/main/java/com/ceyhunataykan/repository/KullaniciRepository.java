package com.ceyhunataykan.repository;

import com.ceyhunataykan.entity.Kullanici;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface KullaniciRepository extends MongoRepository<Kullanici,String> {

}
