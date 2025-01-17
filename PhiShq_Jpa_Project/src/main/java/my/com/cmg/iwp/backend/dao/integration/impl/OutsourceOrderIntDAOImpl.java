package my.com.cmg.iwp.backend.dao.integration.impl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import my.com.cmg.iwp.backend.model.integration.OutsourceOrderInt;
import my.com.cmg.iwp.backend.model.integration.PatientAllergiesInt;
import my.com.cmg.iwp.backend.model.integration.PatientDiagnosisInt;
import my.com.cmg.iwp.backend.model.integration.PatientInt;
import my.com.cmg.iwp.backend.model.integration.rp.OrderRpInt;

public interface OutsourceOrderIntDAOImpl extends JpaRepository<OutsourceOrderInt, Long> {

	void save(PatientInt patientInt);

	void save(OrderRpInt orderRpInt);

	void save(PatientAllergiesInt patientAllergiesInt);

	void save(PatientDiagnosisInt patientDiagnosisInt);

	// ---------------------------------------------------------------

	@Query("select distinct e from OutsourceOrderInt e " + "left join fetch e.patientInt pt "
			+ "left join fetch e.orderRpInts orp " + "left join fetch orp.dispenseRpBatchInts dispenseRpBatchInt "
			+ "left join fetch e.pnOrderRegimenInts ori " + "left join fetch ori.pnNutritionalAssmntInts nai "
			+ "left join fetch ori.pnOrderTotalEnergyInts ptei " + "left join fetch e.patientAllergiesInts pai "
			+ "left join fetch e.patientDiagnosisInts pdi " + "left join fetch e.currentstkHdrsInts chi "
			+ "left join fetch e.cdrDrugsInts cdrdi " + "left join fetch cdrdi.cdrDrugsScheduleInts cdrdsi "
			+ "left join fetch cdrdi.cdrDispensingInts cdrdispi " + "left join fetch chi.currentstkDtlsInts cdi "
			+ "left join fetch e.dispenseReasonsInts dri " + "left join fetch e.pnPrepCalHeaderInts pchi "
			+ "left join fetch pchi.pnPrepCalInts pci "
			+ "where e.sendFlag = :sendFlag and e.preparationType = :preparationType")
	List<OutsourceOrderInt> getOutsourceOrderInt(String sendFlag, String preparationType);

	// -------------------------------------------------------------------------------------------------------------------

	boolean existsBySourceOutsourceNoAndReferredFactFromAndReferredFactTo(String sourceOutsourceNo,
			String referredFactFrom, String referredFactTo);
	//----------------------------------------------------------------------------------------------------------------
	OutsourceOrderInt findBySourceOutsourceNo(String sourceOutsourceNo);

}
