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


import com.autentia.tnt.businessobject.AdminHoliday;
import com.autentia.tnt.businessobject.User;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.AdminHolidayDAO;
import com.autentia.tnt.dao.hibernate.UserDAO;
import com.autentia.tnt.dao.search.AdminHolidaySearch;
import com.autentia.tnt.util.SpringUtils;

public class AdminHolidayManager {


/* AdminHoliday - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(AdminHolidayManager.class);

  /** AdminHoliday DAO **/
  private AdminHolidayDAO adminHolidayDAO;

  /**
   * Get default AdminHolidayManager as defined in Spring's configuration file.
   * @return the default singleton AdminHolidayManager
   */
  public static AdminHolidayManager getDefault()
  {
    return (AdminHolidayManager)SpringUtils.getSpringBean("managerAdminHoliday");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected AdminHolidayManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public AdminHolidayManager( AdminHolidayDAO adminHolidayDAO )
  {
    this.adminHolidayDAO = adminHolidayDAO;
  }

  /**
   * List adminHolidays. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all adminHolidays sorted by requested criterion
   */
  public List<AdminHoliday> getAllEntities(AdminHolidaySearch search, SortCriteria sort){
    return adminHolidayDAO.search( search, sort );
  }
  
  /**
   * Get adminHoliday by primary key.
   * @return adminHoliday selected by id.
   */
  public AdminHoliday getEntityById(int id){
    return adminHolidayDAO.loadById(id);
  }
	
  /**
   * Insert adminHoliday. 
   */
  public void insertEntity(AdminHoliday adminHoliday) {
    adminHolidayDAO.insert(adminHoliday);
  }
	 
  /**
   * Update adminHoliday. 
   */
  public void updateEntity(AdminHoliday adminHoliday) {
    adminHolidayDAO.update(adminHoliday);
  }

  /**
   * Delete adminHoliday. 
   */
  public void deleteEntity(AdminHoliday adminHoliday) {
    adminHolidayDAO.delete(adminHoliday);
  }

/* AdminHoliday - generated by stajanov (do not edit/delete) */

	
}
