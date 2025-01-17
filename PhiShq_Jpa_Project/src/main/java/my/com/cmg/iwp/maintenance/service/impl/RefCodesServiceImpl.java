package my.com.cmg.iwp.maintenance.service.impl;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import my.com.cmg.iwp.maintenance.dao.impl.RefCodesDAOImpl;
import my.com.cmg.iwp.maintenance.model.IntegrationBean;
import my.com.cmg.iwp.maintenance.model.RefCodes;
import my.com.cmg.iwp.maintenance.service.RefCodesService;

@Service
@Transactional
public class RefCodesServiceImpl implements RefCodesService {
	
	
	@Autowired
	private RefCodesDAOImpl refCodesDAOImpl;

	@Override
	public List<RefCodes> getAllRefCodes() {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findAll(Sort.by("rcDesc"));
	}

	@Override
	public List<IntegrationBean> findIntegrationByCriteria(String intType, String dateFrom, String dateTo) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public RefCodes getNewRefCode() {
		// TODO Auto-generated method stub
		return new RefCodes();
	}

	@Override
	public void delete(RefCodes anRefCode) {
		// TODO Auto-generated method stub
		refCodesDAOImpl.delete(anRefCode);
	}

	@Override
	public void saveOrUpdate(RefCodes anRefCode) {
		// TODO Auto-generated method stub
		refCodesDAOImpl.save(anRefCode);
		
	}

	@Override
	public List<RefCodes> getDesc(String domain) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomainAndRcDescIsNotNull(domain);
	}

	@Override
	public List<RefCodes> getRefCodesByDomain(String domain) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomain(domain);
	}

	@Override
	public RefCodes getRefCodeByRcDesc(String domain, String rcDesc) {
		// TODO Auto-generated method stub
		
		Optional<RefCodes> byRcDomainAndRcDesc = refCodesDAOImpl.findByRcDomainAndRcDesc(domain, rcDesc);
		return byRcDomainAndRcDesc.orElse(null);
	}

	@Override
	public RefCodes getRefCodeByRcValue(String domain, String rcValue) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomainAndRcValue(domain, rcValue);
	}

	@Override
	public RefCodes getRefCodeByRcValueIgnoreCaseSensitive(String domain, String rcValue) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomainAndRcValueIgnoreCase(domain, rcValue);
	}

	@Override
	public List<RefCodes> getDescOrderbySeqNo(String domain) {
		// TODO Auto-generated method stub
		return  refCodesDAOImpl.findByRcDomainOrderByRcSeqAsc(domain);
	}

	@Override
	public List<RefCodes> getAllRefCode() {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findAll();
	}

	@Override
	public List<RefCodes> getRefCodesByDomain(String domain, String[] orderBy) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findAll();
	}

	@Override
	public List<RefCodes> getRefCodesByDomainException(String holidayType, String weekend) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RefCodes> getAscOrderbySeqNo(String domain) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByDomainOrderByRcSeqAsc(domain);
	}

	@Override
	public List<RefCodes> getTdmCalculators(String domain, List<String> list) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findTdmCalculators(domain, list);
	}

	@Override
	public List<RefCodes> getDistinctRefCode() {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findDistinctRefCode();
	}

	@Override
	public List<String> getRefCodeDomainList(String domainName) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findDistinctRefCode();
	}

	@Override
	public List<RefCodes> getRefCodesByDomainAndParamter1(String domain, String paramter1) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RefCodes> getRefCodesByDomainAndParamter1Sort(String domain, boolean order) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<RefCodes> getRefCodesByValues(String domain, List<String> list) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomainAndRcValueIn(domain, list);
	}

	@Override
	public List<RefCodes> getAscOrderbySeqNo(String domain, String sortProperty) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findByRcDomainOrderByRcDesc(domain);
	}

	@Override
	public List<RefCodes> getRefCodesListByDomain(String domain) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl. findByRcDomainOrderByRcDescAsc(domain);
	}

	@Override
	public List<String> getRefCodeValuesForRcDesc(String domainName, String rcDesc) {
		// TODO Auto-generated method stub
		return refCodesDAOImpl.findRefCodeValuesByRcDesc(domainName, rcDesc);
	}
	

}