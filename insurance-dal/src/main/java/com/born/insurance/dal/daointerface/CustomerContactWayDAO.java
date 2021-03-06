/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.daointerface;

// auto generated imports
import com.born.insurance.dal.dataobject.CustomerContactWayDO;
import org.springframework.dao.DataAccessException;
import java.util.List;

/**
 * A dao interface provides methods to access database table <tt>customer_contact_way</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_contact_way.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */
 @SuppressWarnings("rawtypes") 
public interface CustomerContactWayDAO {
	/**
	 *  Insert one <tt>CustomerContactWayDO</tt> object to DB table <tt>customer_contact_way</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_contact_way(id,way,type,way_type_id,way_type_name,user_id,remark) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerContactWay
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerContactWayDO customerContactWay) throws DataAccessException;

	/**
	 *  Update DB table <tt>customer_contact_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_contact_way set way=?, type=?, way_type_id=?, way_type_name=?, user_id=?, remark=? where (id = ?)</tt>
	 *
	 *	@param customerContactWay
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerContactWayDO customerContactWay) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_contact_way</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, way, type, way_type_id, way_type_name, user_id, remark from customer_contact_way where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CustomerContactWayDO
	 *	@throws DataAccessException
	 */	 
    public CustomerContactWayDO findById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_contact_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_contact_way where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException;

	/**
	 *  Delete records from DB table <tt>customer_contact_way</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_contact_way where (user_id = ?)</tt>
	 *
	 *	@param userId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByUserId(long userId) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_contact_way</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, way, type, way_type_id, way_type_name, user_id, remark from customer_contact_way where (1 = 1)</tt>
	 *
	 *	@param customerContactWay
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerContactWayDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerContactWayDO> findByCondition(CustomerContactWayDO customerContactWay, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException;

	/**
	 *  Query DB table <tt>customer_contact_way</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_contact_way where (1 = 1)</tt>
	 *
	 *	@param customerContactWay
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerContactWayDO customerContactWay) throws DataAccessException;

}