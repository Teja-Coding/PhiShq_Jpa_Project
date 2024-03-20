package my.com.cmg.iwp.backend.service.integration.cdr.impl;

import javax.persistence.EntityNotFoundException;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.backend.dao.integration.cdr.impl.CdrInfusionDrugsIntDAOImpl;
import my.com.cmg.iwp.backend.model.integration.cdr.CdrInfusionDrugsInt;
import my.com.cmg.iwp.backend.service.integration.cdr.CdrInfusionDrugsIntService;

@Service
@Transactional
public class CdrInfusionDrugsIntServiceImpl implements
		CdrInfusionDrugsIntService {
	
	
	@Autowired
	private CdrInfusionDrugsIntDAOImpl cdrInfusionDrugsIntDAOImpl;

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		cdrInfusionDrugsIntDAOImpl.findById(id);	
	}

	@Override
	public void refresh(CdrInfusionDrugsInt cdrInfusionDrugsInt) {
		// TODO Auto-generated method stub
		cdrInfusionDrugsIntDAOImpl.findById(cdrInfusionDrugsInt.getCdrInfusionIntSeqno())
		.orElseThrow(()-> new EntityNotFoundException("CdrInfusionDrugsInt with ID "+ cdrInfusionDrugsInt.getCdrInfusionIntSeqno()+ " not found"));
		
	}

	@Override
	public void saveOrUpdate(CdrInfusionDrugsInt cdrInfusionDrugsInt) {
		// TODO Auto-generated method stub
		cdrInfusionDrugsIntDAOImpl.save(cdrInfusionDrugsInt);
		
	}

	@Override
	public void save(CdrInfusionDrugsInt cdrInfusionDrugsInt) {
		// TODO Auto-generated method stub
		cdrInfusionDrugsIntDAOImpl.save(cdrInfusionDrugsInt);
		
	}
	



}
