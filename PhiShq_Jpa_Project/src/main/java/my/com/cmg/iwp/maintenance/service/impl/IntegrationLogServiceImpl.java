package my.com.cmg.iwp.maintenance.service.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.backend.dao.integration.impl.IntegrationLogDAOImpl;
import my.com.cmg.iwp.backend.model.integration.IntegrationLog;
import my.com.cmg.iwp.maintenance.service.IntegrationLogService;

@Service
@Transactional
public class IntegrationLogServiceImpl implements IntegrationLogService {
	
	@Autowired
	private IntegrationLogDAOImpl integrationLogDAOImpl;

	@Override
	public void saveOrUpdate(IntegrationLog anIntegrationLog) {
		// TODO Auto-generated method stub
		
		integrationLogDAOImpl.save(anIntegrationLog);
		
	}

}
