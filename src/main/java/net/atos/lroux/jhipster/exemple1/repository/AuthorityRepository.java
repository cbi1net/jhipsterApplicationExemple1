package net.atos.lroux.jhipster.exemple1.repository;

import net.atos.lroux.jhipster.exemple1.domain.Authority;

import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Spring Data JPA repository for the Authority entity.
 */
public interface AuthorityRepository extends JpaRepository<Authority, String> {
}
