package com.example.insulin;

import org.springframework.data.repository.CrudRepository;

public interface GlucoseDataRepository extends CrudRepository<GlucoseData, Long> {

  GlucoseData findById(long id);
}
