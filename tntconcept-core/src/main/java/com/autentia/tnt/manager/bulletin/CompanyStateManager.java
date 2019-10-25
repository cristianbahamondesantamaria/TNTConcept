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

package com.autentia.tnt.manager.bulletin;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.CompanyState;
import com.autentia.tnt.businessobject.User;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.CompanyStateDAO;
import com.autentia.tnt.dao.hibernate.UserDAO;
import com.autentia.tnt.dao.search.CompanyStateSearch;
import com.autentia.tnt.util.SpringUtils;





public class CompanyStateManager {


/* CompanyState - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(CompanyStateManager.class);

  /** CompanyState DAO **/
  private CompanyStateDAO companyStateDAO;

  /**
   * Get default CompanyStateManager as defined in Spring's configuration file.
   * @return the default singleton CompanyStateManager
   */
  public static CompanyStateManager getDefault()
  {
    return (CompanyStateManager)SpringUtils.getSpringBean("managerCompanyState");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected CompanyStateManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public CompanyStateManager( CompanyStateDAO companyStateDAO )
  {
    this.companyStateDAO = companyStateDAO;
  }

  /**
   * List companyStates. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all companyStates sorted by requested criterion
   */
  public List<CompanyState> getAllEntities(CompanyStateSearch search, SortCriteria sort){
    return companyStateDAO.search( search, sort );
  }
  
  /**
   * Get companyState by primary key.
   * @return companyState selected by id.
   */
  public CompanyState getEntityById(int id){
    return companyStateDAO.loadById(id);
  }
	
  /**
   * Insert companyState. 
   */
  public void insertEntity(CompanyState companyState) {
    companyStateDAO.insert(companyState);
  }
	 
  /**
   * Update companyState. 
   */
  public void updateEntity(CompanyState companyState) {
    companyStateDAO.update(companyState);
  }

  /**
   * Delete companyState. 
   */
  public void deleteEntity(CompanyState companyState) {
    companyStateDAO.delete(companyState);
  }

/* CompanyState - generated by stajanov (do not edit/delete) */

}
