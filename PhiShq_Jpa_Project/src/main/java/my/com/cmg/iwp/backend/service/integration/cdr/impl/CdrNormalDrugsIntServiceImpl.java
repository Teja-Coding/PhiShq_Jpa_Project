package my.com.cmg.iwp.backend.service.integration.cdr.impl;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.backend.dao.integration.cdr.impl.CdrNormalDrugsIntDAOImpl;
import my.com.cmg.iwp.backend.model.integration.cdr.CdrNormalDrugsInt;
import my.com.cmg.iwp.backend.service.integration.cdr.CdrNormalDrugsIntService;

@Service
public class CdrNormalDrugsIntServiceImpl implements CdrNormalDrugsIntService {
	
	@Autowired
	private CdrNormalDrugsIntDAOImpl cdrNormalDrugsIntDAOImpl;

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		
		cdrNormalDrugsIntDAOImpl.findById(id);
		
	}

	@Override
	public void refresh(CdrNormalDrugsInt orderCdrNormalDrugsInt) {
		// TODO Auto-generated method stub
		cdrNormalDrugsIntDAOImpl.findById(orderCdrNormalDrugsInt.getCdrNormalDrugIntSeqno())
		.orElseThrow(()->new EntityNotFoundException("CdrNormalDrugsInt with ID " + orderCdrNormalDrugsInt.getCdrNormalDrugIntSeqno() + "not found"));
	}

	@Override
	public void saveOrUpdate(CdrNormalDrugsInt orderCdrNormalDrugsInt) {
		// TODO Auto-generated method stub
		cdrNormalDrugsIntDAOImpl.save(orderCdrNormalDrugsInt);
	}

	@Override
	public void save(CdrNormalDrugsInt orderCdrNormalDrugsInt) {
		// TODO Auto-generated method stub
		
		cdrNormalDrugsIntDAOImpl.save(orderCdrNormalDrugsInt);
		
	}
	
}
