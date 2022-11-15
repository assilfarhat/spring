package tn.esprit.dao.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import tn.esprit.dao.entities.Universite;

@Repository
public interface UniversiteRepository extends JpaRepository<Universite, Integer> {

}
