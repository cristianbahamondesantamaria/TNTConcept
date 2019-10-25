/**
 * TNTConcept Easy Enterprise Management by Autentia Real Bussiness Solution S.L.
 * Copyright (C) 2007 Autentia Real Bussiness Solution S.L.
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.autentia.tnt.manager.holiday;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.RequestHoliday;
import com.autentia.tnt.businessobject.User;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.RequestHolidayDAO;
import com.autentia.tnt.dao.hibernate.UserDAO;
import com.autentia.tnt.dao.search.RequestHolidaySearch;
import com.autentia.tnt.util.SpringUtils;

public class RequestHolidayManager
{
  
  
/* RequestHoliday - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(RequestHolidayManager.class);

  /** RequestHoliday DAO **/
  private RequestHolidayDAO requestHolidayDAO;

  /**
   * Get default RequestHolidayManager as defined in Spring's configuration file.
   * @return the default singleton RequestHolidayManager
   */
  public static RequestHolidayManager getDefault()
  {
    return (RequestHolidayManager)SpringUtils.getSpringBean("managerRequestHoliday");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected RequestHolidayManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public RequestHolidayManager( RequestHolidayDAO requestHolidayDAO )
  {
    this.requestHolidayDAO = requestHolidayDAO;
  }

  /**
   * List requestHolidays. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all requestHolidays sorted by requested criterion
   */
  public List<RequestHoliday> getAllEntities(RequestHolidaySearch search, SortCriteria sort){
    return requestHolidayDAO.search( search, sort );
  }
  
  /**
   * Get requestHoliday by primary key.
   * @return requestHoliday selected by id.
   */
  public RequestHoliday getEntityById(int id){
    return requestHolidayDAO.loadById(id);
  }
	
  /**
   * Insert requestHoliday. 
   */
  public void insertEntity(RequestHoliday requestHoliday) {
    requestHolidayDAO.insert(requestHoliday);
  }
	 
  /**
   * Update requestHoliday. 
   */
  public void updateEntity(RequestHoliday requestHoliday) {
    requestHolidayDAO.update(requestHoliday);
  }

  /**
   * Delete requestHoliday. 
   */
  public void deleteEntity(RequestHoliday requestHoliday) {
    requestHolidayDAO.delete(requestHoliday);
  }

/* RequestHoliday - generated by stajanov (do not edit/delete) */
}
