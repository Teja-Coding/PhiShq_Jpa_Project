package my.com.cmg.iwp.backend.dao.integration.impl;

import java.sql.Date;
import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import my.com.cmg.iwp.backend.model.integration.IntegrationLog;
import my.com.cmg.iwp.maintenance.model.IntegrationBean;

public interface IntegrationLogDAOImpl extends JpaRepository<IntegrationLog, Long> {
	
	

    
    

}
