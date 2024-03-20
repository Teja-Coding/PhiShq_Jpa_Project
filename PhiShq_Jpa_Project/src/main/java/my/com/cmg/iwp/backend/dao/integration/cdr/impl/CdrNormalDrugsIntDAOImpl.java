package my.com.cmg.iwp.backend.dao.integration.cdr.impl;

import org.springframework.data.jpa.repository.JpaRepository;

import my.com.cmg.iwp.backend.model.integration.cdr.CdrNormalDrugsInt;


public interface CdrNormalDrugsIntDAOImpl extends
		JpaRepository<CdrNormalDrugsInt , Long> {

}
