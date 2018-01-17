package com.ibm.gps.itoa.portal.service;

import java.util.List;

import com.ibm.gps.itoa.portal.model.OperationRecord;
import com.ibm.gps.itoa.portal.model.OperationRecordExample;

public interface OperationRecordService {
    
    public List<OperationRecord> selectOperationRecord(OperationRecordExample ore);

}
