package com.myoffice.office.repositories;

import com.myoffice.office.models.EarningsLevel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EarningsRepository extends JpaRepository<EarningsLevel, Integer> {

}
