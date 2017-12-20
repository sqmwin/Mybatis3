package com.sqm.dao;

import com.sqm.pojo1.Country;
import com.sqm.pojo1.Minister;

import java.util.Set;

/**
 * <p> </p>
 *
 * @author sqm
 * @version 1.0
 */
public interface SomeDao {
    //通过cid查询国家
    Country selectCountryById(int cid);

    //通过cid查询ministers
    Set<Minister> selectMinisterByCid(int cid);

    //通过mid查询minister,并显示他的country
    com.sqm.pojo2.Minister selectMinisterById(int mid);

    //通过minister的cid查询国家
    com.sqm.pojo2.Country selectCountryByMinisterCid(int cid);
}
