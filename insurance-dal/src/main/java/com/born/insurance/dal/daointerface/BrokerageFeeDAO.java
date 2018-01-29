/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.BrokerageFeeDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>brokerage_fee</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/brokerage_fee.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface BrokerageFeeDAO {
	/**
	 *  Insert one <tt>BrokerageFeeDO</tt> object to DB table <tt>brokerage_fee</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into brokerage_fee(brokerage_id,business_bill_id,brokerage_scale,brokerage_amount,raw_add_time,update_add_time) values (?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param brokerageFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(BrokerageFeeDO brokerageFee) throws DataAccessException;

	/**
	 *  Update DB table <tt>brokerage_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update brokerage_fee set business_bill_id=?, brokerage_scale=?, brokerage_amount=?, update_add_time=? where (brokerage_id = ?)</tt>
	 *
	 *	@param brokerageFee
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(BrokerageFeeDO brokerageFee) throws DataAccessException;

	/**
	 *  Query DB table <tt>brokerage_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select brokerage_id, business_bill_id, brokerage_scale, brokerage_amount, raw_add_time, update_add_time from brokerage_fee where (brokerage_id = ?)</tt>
	 *
	 *	@param brokerageId
	 *	@return BrokerageFeeDO
	 *	@throws DataAccessException
	 */	 
    public BrokerageFeeDO findById(long brokerageId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>brokerage_fee</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from brokerage_fee where (brokerage_id = ?)</tt>
	 *
	 *	@param brokerageId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long brokerageId) throws DataAccessException;

	/**
	 *  Query DB table <tt>brokerage_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select brokerage_id, business_bill_id, brokerage_scale, brokerage_amount, raw_add_time, update_add_time from brokerage_fee where (1 = 1)</tt>
	 *
	 *	@param brokerageFee
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<BrokerageFeeDO>
	 *	@throws DataAccessException
	 */	 
    public List<BrokerageFeeDO> findByCondition(BrokerageFeeDO brokerageFee, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>brokerage_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from brokerage_fee where (1 = 1)</tt>
	 *
	 *	@param brokerageFee
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(BrokerageFeeDO brokerageFee) throws DataAccessException;

	/**
	 *  Query DB table <tt>brokerage_fee</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select brokerage_id, business_bill_id, brokerage_scale, brokerage_amount, raw_add_time, update_add_time from brokerage_fee where (business_bill_id = ?)</tt>
	 *
	 *	@param businessBillId
	 *	@return BrokerageFeeDO
	 *	@throws DataAccessException
	 */	 
    public BrokerageFeeDO findBrokerageFeeByBusinessBillId(long businessBillId) throws DataAccessException;

}