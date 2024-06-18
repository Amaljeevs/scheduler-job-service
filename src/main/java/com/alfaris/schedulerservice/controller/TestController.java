package com.alfaris.schedulerservice.controller;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.alfaris.esb.dto.CustAddLiteRequest;
import com.alfaris.esb.dto.CustAddLiteResponse;
import com.alfaris.esb.dto.CustAddLiteRsHeader;
import com.alfaris.esb.dto.ResponseRiyadBankHeader;
import com.alfaris.schedulerservice.entity.PshSchedulerTest;
import com.alfaris.schedulerservice.repository.PshSchedulerTestRepository;
import com.fasterxml.jackson.databind.ObjectMapper;

@RestController
@RequestMapping("/api/test")
public class TestController {
	private static Logger logger = LogManager.getLogger(TestController.class);

	@Autowired
	private PshSchedulerTestRepository repository;

	@PostMapping
	public String saveData(@RequestBody PshSchedulerTest entity) {
		try {
			repository.save(entity);
			logger.info("Details Saved....");
			return "success";
		} catch (Exception e) {
			return "failed";
		}

	}

	@PostMapping("/createLitCisCust")
	public CustAddLiteResponse createCustomer(@RequestBody CustAddLiteRequest request) {
		try {
			System.out.println("request ::" + request);
			CustAddLiteResponse responseObj = new CustAddLiteResponse();
			CustAddLiteRsHeader responseHeader = new CustAddLiteRsHeader();
			responseHeader.setChannelId(request.getRiyadBankHeader().getChannelId());
			responseHeader.setCisNumber(request.getRiyadBankHeader().getCisNumber());
			responseHeader.setDeviceId(request.getRiyadBankHeader().getDeviceId());
			responseHeader.setFunctionId(request.getRiyadBankHeader().getFunctionId());
			responseHeader.setIpAddress(request.getRiyadBankHeader().getIpAddress());
			responseHeader.setIsReversal("false");
			responseHeader.setLanguage(request.getRiyadBankHeader().getLanguage());
			responseHeader.setMessageVersion(request.getRiyadBankHeader().getMessageVersion());
			responseHeader.setOrganizationId(request.getRiyadBankHeader().getOrganizationId());
			responseHeader.setReferenceNumber(request.getRiyadBankHeader().getReferenceNumber());
			responseHeader.setReplyDateTime(request.getRiyadBankHeader().getReplyDateTime());
			responseHeader.setReqDateTime(request.getRiyadBankHeader().getReqDateTime());
			responseHeader.setReversalReferenceNumber(request.getRiyadBankHeader().getReversalReferenceNumber());
			responseHeader.setServiceName(request.getRiyadBankHeader().getServiceName());
			responseHeader.setStatusCode(request.getRiyadBankHeader().getStatusCode());
			responseHeader.setStatusDescAr(request.getRiyadBankHeader().getStatusDescAr());
			responseHeader.setStatusDescEn(request.getRiyadBankHeader().getStatusDescEn());
			responseHeader.setTransactionKey(request.getRiyadBankHeader().getTransactionKey());
			responseHeader.setUserId(request.getRiyadBankHeader().getUserId());
			responseHeader.setUserLocation(request.getRiyadBankHeader().getUserLocation());
			responseObj.setRiyadBankHeader(responseHeader);
			return responseObj;
		} catch (Exception e) {
			return null;
		}

	}

}
