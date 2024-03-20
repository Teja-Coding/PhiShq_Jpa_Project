package my.com.cmg.iwp.backend.service.integration.cdr.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.transaction.Transactional;

import my.com.cmg.iwp.backend.dao.integration.cdr.impl.CdrHdrIntDAOImpl;
import my.com.cmg.iwp.backend.model.integration.cdr.CdrHdrInt;
import my.com.cmg.iwp.backend.service.integration.cdr.CdrHdrIntService;
import my.com.cmg.iwp.webui.constant.RefCodeConstant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional
public class CdrHdrIntServiceImpl implements CdrHdrIntService {
	
	@Autowired
	private CdrHdrIntDAOImpl cdrHdrIntDAOImpl;
	
	@Autowired
	 private EntityManager entityManager;

	@Override
	public void findById(long id) {
		// TODO Auto-generated method stub
		cdrHdrIntDAOImpl.findById(id);
		
		}

	@Override
	public void refresh(CdrHdrInt cdrHdrInt) {
		// TODO Auto-generated method stub
		entityManager.refresh(cdrHdrInt);
		
		
	}

	@Override
	public void saveOrUpdate(CdrHdrInt cdrHdrInt) {
		// TODO Auto-generated method stub
		cdrHdrIntDAOImpl.save(cdrHdrInt);
		
	}

	@Override
	public void save(CdrHdrInt cdrHdrInt) {
		// TODO Auto-generated method stub
		cdrHdrIntDAOImpl.save(cdrHdrInt);
		
	}

	@Override
	public List<CdrHdrInt> getAllSendRecord() {
		// TODO Auto-generated method stub
		return entityManager.createQuery(
                "SELECT DISTINCT hdr " +
                "FROM CdrHdrInt hdr " +
                "LEFT JOIN FETCH hdr.cdrInfusionDrugsInts inf " +
                "LEFT JOIN FETCH hdr.cdrNormalDrugsInts norm " +
                "LEFT JOIN FETCH inf.cdrDoseFrequencyInts infFreq " +
                "LEFT JOIN FETCH norm.cdrDoseFrequencyInts normFreq " +
                "WHERE hdr.sendFlag = :sendFlag", CdrHdrInt.class)
                .setParameter("sendFlag", RefCodeConstant.BOOLEAN_YES)
                .getResultList();
	}
	




}
