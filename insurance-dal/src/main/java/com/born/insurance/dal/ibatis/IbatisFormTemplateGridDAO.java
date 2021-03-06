/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.FormTemplateGridDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.FormTemplateGridDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.FormTemplateGridDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/form_template_grid.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisFormTemplateGridDAO extends SqlMapClientDaoSupport implements FormTemplateGridDAO {
	/**
	 *  Insert one <tt>FormTemplateGridDO</tt> object to DB table <tt>form_template_grid</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into form_template_grid(id,module_id,name,code,raw_add_time) values (?, ?, ?, ?, ?)</tt>
	 *
	 *	@param formTemplateGrid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(FormTemplateGridDO formTemplateGrid) throws DataAccessException {
    	if (formTemplateGrid == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-FORM-TEMPLATE-GRID-INSERT", formTemplateGrid);

        return formTemplateGrid.getId();
    }

	/**
	 *  Update DB table <tt>form_template_grid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update form_template_grid set module_id=?, name=?, code=? where (id = ?)</tt>
	 *
	 *	@param formTemplateGrid
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(FormTemplateGridDO formTemplateGrid) throws DataAccessException {
    	if (formTemplateGrid == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-FORM-TEMPLATE-GRID-UPDATE", formTemplateGrid);
    }

	/**
	 *  Query DB table <tt>form_template_grid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, module_id, name, code, raw_add_time, raw_update_time from form_template_grid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return FormTemplateGridDO
	 *	@throws DataAccessException
	 */	 
    public FormTemplateGridDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (FormTemplateGridDO) getSqlMapClientTemplate().queryForObject("MS-FORM-TEMPLATE-GRID-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>form_template_grid</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from form_template_grid where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-FORM-TEMPLATE-GRID-DELETE-BY-ID", param);
    }

	/**
	 *  Query DB table <tt>form_template_grid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, module_id, name, code, raw_add_time, raw_update_time from form_template_grid where (1 = 1)</tt>
	 *
	 *	@param formTemplateGrid
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<FormTemplateGridDO>
	 *	@throws DataAccessException
	 */	 
    public List<FormTemplateGridDO> findByCondition(FormTemplateGridDO formTemplateGrid, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (formTemplateGrid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("formTemplateGrid", formTemplateGrid);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-FORM-TEMPLATE-GRID-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>form_template_grid</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from form_template_grid where (1 = 1)</tt>
	 *
	 *	@param formTemplateGrid
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(FormTemplateGridDO formTemplateGrid) throws DataAccessException {
    	if (formTemplateGrid == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-FORM-TEMPLATE-GRID-FIND-BY-CONDITION-COUNT", formTemplateGrid);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}