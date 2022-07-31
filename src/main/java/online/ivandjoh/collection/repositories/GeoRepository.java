package online.ivandjoh.collection.repositories;

import online.ivandjoh.collection.model.Geo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface GeoRepository extends JpaRepository<Geo, Long> { }
