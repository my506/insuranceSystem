/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.PersonCommissionDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.PersonCommissionDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.PersonCommissionDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/person_commission.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPersonCommissionDAO extends SqlMapClientDaoSupport implements PersonCommissionDAO {
	/**
	 *  Insert one <tt>PersonCommissionDO</tt> object to DB table <tt>person_commission</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into person_commission(commission_id,business_user_id,business_user_name,business_user_type,business_user_mobile,business_user_cert_no,total_amount,draw_amount,applying_amount,raw_add_time) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param personCommission
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PersonCommissionDO personCommission) throws DataAccessException {
    	if (personCommission == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PERSON-COMMISSION-INSERT", personCommission);

        return personCommission.getCommissionId();
    }

	/**
	 *  Update DB table <tt>person_commission</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update person_commission set business_user_id=?, business_user_name=?, business_user_type=?, business_user_mobile=?, business_user_cert_no=?, total_amount=?, draw_amount=?, applying_amount=? where (commission_id = ?)</tt>
	 *
	 *	@param personCommission
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PersonCommissionDO personCommission) throws DataAccessException {
    	if (personCommission == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PERSON-COMMISSION-UPDATE", personCommission);
    }

	/**
	 *  Query DB table <tt>person_commission</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_id, business_user_id, business_user_name, business_user_type, business_user_mobile, business_user_cert_no, total_amount, draw_amount, applying_amount, raw_add_time, raw_update_time from person_commission where (commission_id = ?)</tt>
	 *
	 *	@param commissionId
	 *	@return PersonCommissionDO
	 *	@throws DataAccessException
	 */	 
    public PersonCommissionDO findById(long commissionId) throws DataAccessException {
        Long param = new Long(commissionId);

        return (PersonCommissionDO) getSqlMapClientTemplate().queryForObject("MS-PERSON-COMMISSION-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>person_commission</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from person_commission where (commission_id = ?)</tt>
	 *
	 *	@param commissionId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long commissionId) throws DataAccessException {
        Long param = new Long(commissionId);

        return getSqlMapClientTemplate().delete("MS-PERSON-COMMISSION-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>person_commission</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_id, business_user_id, business_user_name, business_user_type, business_user_mobile, business_user_cert_no, total_amount, draw_amount, applying_amount, raw_add_time, raw_update_time from person_commission where (1 = 1)</tt>
	 *
	 *	@param personCommission
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PersonCommissionDO>
	 *	@throws DataAccessException
	 */	 
    public List<PersonCommissionDO> findByCondition(PersonCommissionDO personCommission, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (personCommission == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("personCommission", personCommission);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PERSON-COMMISSION-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>person_commission</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from person_commission where (1 = 1)</tt>
	 *
	 *	@param personCommission
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PersonCommissionDO personCommission) throws DataAccessException {
    	if (personCommission == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PERSON-COMMISSION-FIND-BY-CONDITION-COUNT", personCommission);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

	/**
	 *  Query DB table <tt>person_commission</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select commission_id, business_user_id, business_user_name, business_user_type, business_user_mobile, business_user_cert_no, total_amount, draw_amount, applying_amount, raw_add_time, raw_update_time from person_commission where (business_user_id = ?)</tt>
	 *
	 *	@param businessUserId
	 *	@return PersonCommissionDO
	 *	@throws DataAccessException
	 */	 
    public PersonCommissionDO findByUserId(long businessUserId) throws DataAccessException {
        Long param = new Long(businessUserId);

        return (PersonCommissionDO) getSqlMapClientTemplate().queryForObject("MS-PERSON-COMMISSION-FIND-BY-USER-ID", param);

    }

}