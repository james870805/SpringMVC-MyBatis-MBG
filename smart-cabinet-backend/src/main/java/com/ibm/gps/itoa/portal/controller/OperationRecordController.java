package com.ibm.gps.itoa.portal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.ibm.gps.itoa.portal.model.OperationRecord;
import com.ibm.gps.itoa.portal.model.OperationRecordExample;
import com.ibm.gps.itoa.portal.service.OperationRecordService;

@CrossOrigin(origins = "*", maxAge = 3600)
@RestController
@RequestMapping("/operation-record")
public class OperationRecordController {

	@Autowired
	OperationRecordService ors;

	@ResponseBody
	@RequestMapping(value = "/all", method = RequestMethod.GET)
	public List<OperationRecord> oneRecord() {
		OperationRecordExample ore = new OperationRecordExample();
		ore.or().andIdIsNotNull();
		List<OperationRecord> records = ors.selectOperationRecord(ore);
		return records;
	}
}
