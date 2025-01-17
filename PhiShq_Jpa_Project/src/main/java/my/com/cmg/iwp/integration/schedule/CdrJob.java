package my.com.cmg.iwp.integration.schedule;

import org.quartz.JobExecutionContext;
import org.quartz.JobExecutionException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.quartz.QuartzJobBean;
import org.springframework.web.client.RestTemplate;

import my.com.cmg.iwp.maintenance.service.ExternalFacilityService;
import my.com.cmg.iwp.maintenance.service.IntegrationLogService;
import my.com.cmg.iwp.maintenance.service.RefCodesService;

public class CdrJob extends QuartzJobBean {

	@Autowired
	private RestTemplate restTemplate;

	@Autowired
	private ExternalFacilityService externalFacilityService;

	@Autowired
	private IntegrationLogService integrationLogService;
	
	@Autowired
	private RefCodesService refCodesService;

	@Autowired
	private OutsourceOrderIntService outsourceOrderIntService;




}
