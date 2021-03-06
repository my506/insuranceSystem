/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.CustomerInfoTraceDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.CustomerInfoTraceDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.CustomerInfoTraceDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/customer_info_trace.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisCustomerInfoTraceDAO extends SqlMapClientDaoSupport implements CustomerInfoTraceDAO {
	/**
	 *  Insert one <tt>CustomerInfoTraceDO</tt> object to DB table <tt>customer_info_trace</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into customer_info_trace(id,customer_user_id,customer_user_name,remark,creator_id,creator_name,raw_add_time) values (?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException {
    	if (customerInfoTrace == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-CUSTOMER-INFO-TRACE-INSERT", customerInfoTrace);

        return customerInfoTrace.getId();
    }

	/**
	 *  Update DB table <tt>customer_info_trace</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update customer_info_trace set customer_user_id=?, customer_user_name=?, remark=?, creator_id=?, creator_name=? where (id = ?)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException {
    	if (customerInfoTrace == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-CUSTOMER-INFO-TRACE-UPDATE", customerInfoTrace);
    }

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_user_id, customer_user_name, remark, creator_id, creator_name, raw_add_time, raw_update_time from customer_info_trace where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return CustomerInfoTraceDO
	 *	@throws DataAccessException
	 */	 
    public CustomerInfoTraceDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (CustomerInfoTraceDO) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-INFO-TRACE-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>customer_info_trace</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from customer_info_trace where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-CUSTOMER-INFO-TRACE-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, customer_user_id, customer_user_name, remark, creator_id, creator_name, raw_add_time, raw_update_time from customer_info_trace where (1 = 1)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<CustomerInfoTraceDO>
	 *	@throws DataAccessException
	 */	 
    public List<CustomerInfoTraceDO> findByCondition(CustomerInfoTraceDO customerInfoTrace, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (customerInfoTrace == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("customerInfoTrace", customerInfoTrace);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-CUSTOMER-INFO-TRACE-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>customer_info_trace</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from customer_info_trace where (1 = 1)</tt>
	 *
	 *	@param customerInfoTrace
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(CustomerInfoTraceDO customerInfoTrace) throws DataAccessException {
    	if (customerInfoTrace == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-CUSTOMER-INFO-TRACE-FIND-BY-CONDITION-COUNT", customerInfoTrace);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}