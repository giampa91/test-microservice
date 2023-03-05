package com.example.insulin;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.Optional;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.orm.jpa.TestEntityManager;

@DataJpaTest
class GlucoseDataRepositoryTests {

	@Autowired
	private TestEntityManager entityManager;

	@Autowired
	private GlucoseDataRepository glucoseDataRepository;

	@Test
	public void whenFindByName_thenReturnEmployee() {
	    // given
		GlucoseData alex = new GlucoseData();
	    entityManager.persist(alex);
	    entityManager.flush();

	    // when
	    Optional<GlucoseData> found = glucoseDataRepository.findById(alex.getId());

	    // then
	    assertThat(found.get().getId())
	      .isEqualTo(alex.getId());
	}
}
