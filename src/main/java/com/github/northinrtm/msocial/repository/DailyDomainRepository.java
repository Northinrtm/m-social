package com.github.northinrtm.msocial.repository;

import com.github.northinrtm.msocial.entity.DailyDomain;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DailyDomainRepository extends JpaRepository<DailyDomain, Long> {
}
