package my.com.cmg.iwp.maintenance.dao.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import my.com.cmg.iwp.maintenance.model.RefCodes;

public interface RefCodesDAOImpl extends JpaRepository<RefCodes, Long> {

	List<RefCodes> findByRcDomainAndRcDescIsNotNull(String domain);

	List<RefCodes> findByRcDomain(String domain);

	@Query("SELECT rc FROM RefCodes rc WHERE rc.rcDomain = :domain AND rc.rcDesc = :rcDesc")
	Optional<RefCodes> findByRcDomainAndRcDesc(@Param("domain") String domain, @Param("rcDesc") String rcDesc);

	RefCodes findByRcDomainAndRcValue(String domain, String rcValue);

	@Query("SELECT r FROM RefCodes r WHERE r.rcDomain = :domain AND LOWER(r.rcValue) = LOWER(:rcValue)")
	RefCodes findByRcDomainAndRcValueIgnoreCase(@Param("domain") String domain, @Param("rcValue") String rcValue);

	List<RefCodes> findByRcDomainOrderByRcSeqAsc(String domain);

	List<RefCodes> findByDomainOrderByRcSeqAsc(String domain);

	@Query("SELECT rc FROM RefCodes rc WHERE rc.rcDomain = ?1 AND (?2 IS EMPTY OR rc.rcValue NOT IN ?2) ORDER BY rc.rcSeq ASC")
	List<RefCodes> findTdmCalculators(String domain, List<String> list);

	@Query("SELECT DISTINCT rc FROM RefCodes rc ORDER BY rc.rcDomain ASC")
	List<String> findDistinctRefCode();

	@Query("SELECT rc FROM RefCodes rc WHERE rc.rcDomain = ?1 ORDER BY ?2")
	List<RefCodes> findByRcDomainAndOrderByParameter1(String domain, String orderBy);
	
	@Query("SELECT DISTINCT rc.rcValue FROM RefCodes rc WHERE rc.rcDomain = ?1 AND UPPER(rc.rcDesc) LIKE UPPER(concat('%', ?2, '%'))")
    List<String> findRefCodeValuesByRcDesc(String domainName, String rcDesc);
	
	 List<RefCodes> findByRcDomainOrderByRcDescAsc(String domain);
	 
	 List<RefCodes> findByRcDomainOrderByRcDesc(String domain);
	 
	 List<RefCodes> findByRcDomainAndRcValueIn(String rcDomain, List<String> rcValues);

}
