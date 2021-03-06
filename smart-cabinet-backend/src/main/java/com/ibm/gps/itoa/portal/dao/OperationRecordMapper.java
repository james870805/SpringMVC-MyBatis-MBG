package com.ibm.gps.itoa.portal.dao;

import com.ibm.gps.itoa.portal.model.OperationRecord;
import com.ibm.gps.itoa.portal.model.OperationRecordExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OperationRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    long countByExample(OperationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int deleteByExample(OperationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int deleteByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int insert(OperationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int insertSelective(OperationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    List<OperationRecord> selectByExample(OperationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    OperationRecord selectByPrimaryKey(Integer id);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int updateByExampleSelective(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int updateByExample(@Param("record") OperationRecord record, @Param("example") OperationRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKeySelective(OperationRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table operation_record
     *
     * @mbg.generated
     */
    int updateByPrimaryKey(OperationRecord record);
}