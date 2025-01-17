package my.com.cmg.iwp.maintenance.service.impl;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;
import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.backend.dao.integration.impl.OutsourceOrderIntDAOImpl;
import my.com.cmg.iwp.backend.model.integration.OutsourceOrderInt;
import my.com.cmg.iwp.backend.model.integration.PatientAllergiesInt;
import my.com.cmg.iwp.backend.model.integration.PatientDiagnosisInt;
import my.com.cmg.iwp.backend.model.integration.PatientInt;
import my.com.cmg.iwp.backend.model.integration.rp.OrderRpInt;
import my.com.cmg.iwp.maintenance.service.OutsourceOrderIntService;

@Service
@Transactional
public class OutsourceOrderIntServiceImpl implements OutsourceOrderIntService {
	
	@Autowired
	private OutsourceOrderIntDAOImpl outsourceOrderIntDAOImpl;
	
	@Autowired
	private EntityManager entityManager;

	@Override
	public void saveOrUpdate(OutsourceOrderInt outsourceOrderInt) {
		// TODO Auto-generated method stub
		outsourceOrderIntDAOImpl.save(outsourceOrderInt);
	}

	@Override
	public void save(OutsourceOrderInt outsourceOrderInt) {
		// TODO Auto-generated method stub
		outsourceOrderIntDAOImpl.save(outsourceOrderInt);
		
	}

	@Override
	public OutsourceOrderInt findByID(long id) {
		// TODO Auto-generated method stub
		return outsourceOrderIntDAOImpl.findById(id).orElse(null);
	}

	/*
	 * @Override public BasisNextidDaoImpl<OutsourceOrderInt>
	 * getOutsourceOrderIntDAO() { // TODO Auto-generated method stub return null; }
	 */

	@Override
	public void save(PatientInt patientInt) {
		// TODO Auto-generated method stub
		outsourceOrderIntDAOImpl.save(patientInt);
	}

	@Override
	public void save(OrderRpInt orderRpInt) {
		// TODO Auto-generated method stub\
		outsourceOrderIntDAOImpl.save(orderRpInt);
		
	}

	@Override
	public void save(PatientAllergiesInt patientAllergiesInt) {
		// TODO Auto-generated method stub
		outsourceOrderIntDAOImpl.save(patientAllergiesInt);
		
	}

	@Override
	public void save(PatientDiagnosisInt patientDiagnosisInt) {
		// TODO Auto-generated method stub
		outsourceOrderIntDAOImpl.save(patientDiagnosisInt);
		
	}

	@Override
	public List<OutsourceOrderInt> getOutsourceOrderInt(String orderType, String sendFlag) {
		// TODO Auto-generated method stub
		
		List<OutsourceOrderInt> getOutsourceOrderInt = outsourceOrderIntDAOImpl.getOutsourceOrderInt(orderType, sendFlag);
		return getOutsourceOrderInt;
	}

	@Override
	public void updateOutsourceOrderInt(List<Long> seqnos, String sendFlag) {
		// TODO Auto-generated method stub
		
		Query query = entityManager.createQuery("update OutsourceOrderInt e set e.sendFlag = :sendFlag where e.outsourceIntSeqno in :seqnos");
        query.setParameter("sendFlag", sendFlag);
        query.setParameter("seqnos", seqnos);
        query.executeUpdate();
		
	}

	@Override
	public boolean isExists(OutsourceOrderInt outsourceOrderInt) {
		// TODO Auto-generated method stub
		return outsourceOrderIntDAOImpl.existsBySourceOutsourceNoAndReferredFactFromAndReferredFactTo(
                outsourceOrderInt.getSourceOutsourceNo(),
                outsourceOrderInt.getReferredFactFrom(),
                outsourceOrderInt.getReferredFactTo());
	}

	@Override
	public OutsourceOrderInt findBySourceOutsourceNo(String sourceOutsourceNo) {
		// TODO Auto-generated method stub
		return outsourceOrderIntDAOImpl.findBySourceOutsourceNo(sourceOutsourceNo);
	}
	
	

}
