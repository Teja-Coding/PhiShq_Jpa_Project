package my.com.cmg.iwp.backend.service.integration.cdr.impl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.backend.dao.integration.cdr.impl.CdrDoseFrequencyIntDAOImpl;
import my.com.cmg.iwp.backend.model.integration.cdr.CdrDoseFrequencyInt;
import my.com.cmg.iwp.backend.service.integration.cdr.CdrDoseFrequencyIntService;


@Service
@Transactional
public class CdrDoseFrequencyIntServiceImpl implements
		CdrDoseFrequencyIntService {
	
	@Autowired
	private CdrDoseFrequencyIntDAOImpl cdrDoseFrequencyIntDAOImpl;

	@Override
	public void refresh(CdrDoseFrequencyInt cdrDoseFrequencyInt) {
		// TODO Auto-generated method stub
		cdrDoseFrequencyIntDAOImpl.saveAndFlush(cdrDoseFrequencyInt);
		
	}

	@Override
	public void saveOrUpdate(CdrDoseFrequencyInt cdrDoseFrequencyInt) {
		// TODO Auto-generated method stub
		cdrDoseFrequencyIntDAOImpl.save(cdrDoseFrequencyInt);
	}

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		cdrDoseFrequencyIntDAOImpl.findById(id);
		
	}

	@Override
	public void save(CdrDoseFrequencyInt cdrDoseFrequencyInt) {
		// TODO Auto-generated method stub
		cdrDoseFrequencyIntDAOImpl.save(cdrDoseFrequencyInt);
	}




}
