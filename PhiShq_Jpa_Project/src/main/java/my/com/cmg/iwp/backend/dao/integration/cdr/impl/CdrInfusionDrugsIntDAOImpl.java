package my.com.cmg.iwp.backend.dao.integration.cdr.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import my.com.cmg.iwp.backend.model.integration.cdr.CdrInfusionDrugsInt;

public interface CdrInfusionDrugsIntDAOImpl extends
		JpaRepository<CdrInfusionDrugsInt, Long> {

}
