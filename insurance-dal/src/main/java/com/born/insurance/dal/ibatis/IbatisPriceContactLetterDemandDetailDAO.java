/**
 * www.yiji.com Inc.
 * Copyright (c) 2011 All Rights Reserved.
 */
package com.born.insurance.dal.ibatis;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;
import com.born.insurance.dal.daointerface.PriceContactLetterDemandDetailDAO;


// auto generated imports
import com.born.insurance.dal.dataobject.PriceContactLetterDemandDetailDO;
import org.springframework.dao.DataAccessException;
import java.util.List;
import java.util.Map;
	import java.util.HashMap;
	
/**
 * An ibatis based implementation of dao interface <tt>com.born.insurance.dal.daointerface.PriceContactLetterDemandDetailDAO</tt>.
 *
 * This file is generated by <tt>specialmer-dalgen</tt>, a DAL (Data Access Layer)
 * code generation utility specially developed for <tt>paygw</tt> project.
 * 
 * PLEASE DO NOT MODIFY THIS FILE MANUALLY, or else your modification may
 * be OVERWRITTEN by someone else. To modify the file, you should go to 
 * directory <tt>(project-home)/biz/dal/src/conf/dalgen</tt>, and 
 * find the corresponding configuration file (<tt>tables/price_contact_letter_demand_detail.xml</tt>). 
 * Modify the configuration file according to your needs, then run <tt>specialmer-dalgen</tt> 
 * to generate this file.
 *
 * @author peigen
 */ 
@SuppressWarnings({ "unchecked", "rawtypes" })

public class IbatisPriceContactLetterDemandDetailDAO extends SqlMapClientDaoSupport implements PriceContactLetterDemandDetailDAO {
	/**
	 *  Insert one <tt>PriceContactLetterDemandDetailDO</tt> object to DB table <tt>price_contact_letter_demand_detail</tt>, return primary key
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>insert into price_contact_letter_demand_detail(id,letter_demand_id,product_name,model,sales_volume,sales_area,business_object,business_income,vehicle_use,num,seats_num,travel_area,shipping_type,goods_name,packing_condition,expected_value,transport_route,frequency,one_limit,vehicle_type,tonnage,vehicle_age,transportation_area,goods_types,remark,dangerous_goods,main_business,aset_address,purpose,building_structure,version,ext) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)</tt>
	 *
	 *	@param priceContactLetterDemandDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long insert(PriceContactLetterDemandDetailDO priceContactLetterDemandDetail) throws DataAccessException {
    	if (priceContactLetterDemandDetail == null) {
    		throw new IllegalArgumentException("Can't insert a null data object into db.");
    	}
    	
        getSqlMapClientTemplate().insert("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-INSERT", priceContactLetterDemandDetail);

        return priceContactLetterDemandDetail.getId();
    }

	/**
	 *  Update DB table <tt>price_contact_letter_demand_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>update price_contact_letter_demand_detail set letter_demand_id=?, product_name=?, model=?, sales_volume=?, sales_area=?, business_object=?, business_income=?, vehicle_use=?, num=?, seats_num=?, travel_area=?, shipping_type=?, goods_name=?, packing_condition=?, expected_value=?, transport_route=?, frequency=?, one_limit=?, vehicle_type=?, tonnage=?, vehicle_age=?, transportation_area=?, goods_types=?, remark=?, dangerous_goods=?, main_business=?, aset_address=?, purpose=?, building_structure=?, version=?, ext=? where (id = ?)</tt>
	 *
	 *	@param priceContactLetterDemandDetail
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int update(PriceContactLetterDemandDetailDO priceContactLetterDemandDetail) throws DataAccessException {
    	if (priceContactLetterDemandDetail == null) {
    		throw new IllegalArgumentException("Can't update by a null data object.");
    	}


        return getSqlMapClientTemplate().update("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-UPDATE", priceContactLetterDemandDetail);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_demand_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, letter_demand_id, product_name, model, sales_volume, sales_area, business_object, business_income, vehicle_use, num, seats_num, travel_area, shipping_type, goods_name, packing_condition, expected_value, transport_route, frequency, one_limit, vehicle_type, tonnage, vehicle_age, transportation_area, goods_types, remark, dangerous_goods, main_business, aset_address, purpose, building_structure, version, ext from price_contact_letter_demand_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return PriceContactLetterDemandDetailDO
	 *	@throws DataAccessException
	 */	 
    public PriceContactLetterDemandDetailDO findById(long id) throws DataAccessException {
        Long param = new Long(id);

        return (PriceContactLetterDemandDetailDO) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-FIND-BY-ID", param);

    }

	/**
	 *  Delete records from DB table <tt>price_contact_letter_demand_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_demand_detail where (id = ?)</tt>
	 *
	 *	@param id
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteById(long id) throws DataAccessException {
        Long param = new Long(id);

        return getSqlMapClientTemplate().delete("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-DELETE-BY-ID", param);
    }

	/**
	 *  Delete records from DB table <tt>price_contact_letter_demand_detail</tt>.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>delete from price_contact_letter_demand_detail where (letter_demand_id = ?)</tt>
	 *
	 *	@param letterDemandId
	 *	@return int
	 *	@throws DataAccessException
	 */	 
    public int deleteByLetterDemandId(long letterDemandId) throws DataAccessException {
        Long param = new Long(letterDemandId);

        return getSqlMapClientTemplate().delete("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-DELETE-BY-LETTER-DEMAND-ID", param);
    }

	/**
	 *  Query DB table <tt>price_contact_letter_demand_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select id, letter_demand_id, product_name, model, sales_volume, sales_area, business_object, business_income, vehicle_use, num, seats_num, travel_area, shipping_type, goods_name, packing_condition, expected_value, transport_route, frequency, one_limit, vehicle_type, tonnage, vehicle_age, transportation_area, goods_types, remark, dangerous_goods, main_business, aset_address, purpose, building_structure, version, ext from price_contact_letter_demand_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterDemandDetail
	 *	@param sortCol
	 *	@param sortOrder
	 *	@param limitStart
	 *	@param pageSize
	 *	@return List<PriceContactLetterDemandDetailDO>
	 *	@throws DataAccessException
	 */	 
    public List<PriceContactLetterDemandDetailDO> findByCondition(PriceContactLetterDemandDetailDO priceContactLetterDemandDetail, String sortCol, String sortOrder, long limitStart, long pageSize) throws DataAccessException {
    	if (priceContactLetterDemandDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}

        Map param = new HashMap();

        param.put("priceContactLetterDemandDetail", priceContactLetterDemandDetail);
        param.put("sortCol", sortCol);
        param.put("sortOrder", sortOrder);
        param.put("limitStart", new Long(limitStart));
        param.put("pageSize", new Long(pageSize));

        return getSqlMapClientTemplate().queryForList("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-FIND-BY-CONDITION", param);

    }

	/**
	 *  Query DB table <tt>price_contact_letter_demand_detail</tt> for records.
	 *
	 *  <p>
	 *  The sql statement for this operation is <br>
	 *  <tt>select COUNT(*) from price_contact_letter_demand_detail where (1 = 1)</tt>
	 *
	 *	@param priceContactLetterDemandDetail
	 *	@return long
	 *	@throws DataAccessException
	 */	 
    public long findByConditionCount(PriceContactLetterDemandDetailDO priceContactLetterDemandDetail) throws DataAccessException {
    	if (priceContactLetterDemandDetail == null) {
    		throw new IllegalArgumentException("Can't select by a null data object.");
    	}


	    Long retObj = (Long) getSqlMapClientTemplate().queryForObject("MS-PRICE-CONTACT-LETTER-DEMAND-DETAIL-FIND-BY-CONDITION-COUNT", priceContactLetterDemandDetail);

		if (retObj == null) {
		    return 0;
		} else {
		    return retObj.longValue();
		}

    }

}