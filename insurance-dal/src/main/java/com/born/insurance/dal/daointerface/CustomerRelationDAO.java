/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.CustomerRelationDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>customer_relation</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_relation.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CustomerRelationDAO {
	/**
	 *  Insert one <tt>CustomerRelationDO</tt> object to DB table <tt>customer_relation</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_relation(relation_id,parent_name,parent_id,child_name,child_id,member_no,type_id,type_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerRelationDO customerRelation) throws DataAccessException;

	/**
	 *  Update DB table <tt>customer_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_relation set parent_name=?, parent_id=?, child_name=?, child_id=?, member_no=?, type_id=?, type_name=? where (relation_id = ?)</tt>
	 *
	 *	@param customerRelation
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerRelationDO customerRelation) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select relation_id, parent_name, parent_id, child_name, child_id, member_no, type_id, type_name, raw_add_time, raw_update_time from customer_relation where (relation_id = ?)</tt>
	 *
	 *	@param relationId
	 *	@return CustomerRelationDO
	 *	@throws DataAccessException
	 */	 
    public CustomerRelationDO findById(long relationId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_relation where (relation_id = ?)</tt>
	 *
	 *	@param relationId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long relationId) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_relation</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_relation where (child_id = ?)</tt>
	 *
	 *	@param childId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByChildId(long childId) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select relation_id, parent_name, parent_id, child_name, child_id, member_no, type_id, type_name, raw_add_time, raw_update_time from customer_relation where (1 = 1)</tt>
	 *
	 *	@param customerRelation
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerRelationDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerRelationDO> findByCondition(CustomerRelationDO customerRelation, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_relation</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_relation where (1 = 1)</tt>
	 *
	 *	@param customerRelation
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerRelationDO customerRelation) throws DataAccessException;

}