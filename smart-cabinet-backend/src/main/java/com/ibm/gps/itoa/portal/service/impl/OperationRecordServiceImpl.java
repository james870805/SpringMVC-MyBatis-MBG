package com.ibm.gps.itoa.portal.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ibm.gps.itoa.portal.dao.OperationRecordMapper;
import com.ibm.gps.itoa.portal.model.OperationRecord;
import com.ibm.gps.itoa.portal.model.OperationRecordExample;
import com.ibm.gps.itoa.portal.service.OperationRecordService;

@Service("operationRecordServiceImpl")
public class OperationRecordServiceImpl implements OperationRecordService{
	@Autowired
	private OperationRecordMapper orm;
	
	public List<OperationRecord> selectOperationRecord(OperationRecordExample ore){
		return orm.selectByExample(ore);
    }

}
