package com.eutopeian.habr_simple_spring_boot_server;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VisitsRepository extends CrudRepository<Visit, Long> {

}
