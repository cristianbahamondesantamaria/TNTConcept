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

package com.autentia.tnt.manager.contacts;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.OrganizationISOCategory;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.OrganizationISOCategoryDAO;
import com.autentia.tnt.dao.search.OrganizationISOCategorySearch;
import com.autentia.tnt.util.SpringUtils;


public class OrganizationISOCategoryManager {


/* OrganizationISOCategory - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(OrganizationISOCategoryManager.class);

  /** OrganizationISOCategory DAO **/
  private OrganizationISOCategoryDAO organizationISOCategoryDAO;

  /**
   * Get default OrganizationISOCategoryManager as defined in Spring's configuration file.
   * @return the default singleton OrganizationISOCategoryManager
   */
  public static OrganizationISOCategoryManager getDefault()
  {
    return (OrganizationISOCategoryManager)SpringUtils.getSpringBean("managerOrganizationISOCategory");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected OrganizationISOCategoryManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public OrganizationISOCategoryManager( OrganizationISOCategoryDAO organizationISOCategoryDAO )
  {
    this.organizationISOCategoryDAO = organizationISOCategoryDAO;
  }

  /**
   * List organizationISOCategorys. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all organizationISOCategorys sorted by requested criterion
   */
  public List<OrganizationISOCategory> getAllEntities(OrganizationISOCategorySearch search, SortCriteria sort){
    return organizationISOCategoryDAO.search( search, sort );
  }
  
  /**
   * Get organizationISOCategory by primary key.
   * @return organizationISOCategory selected by id.
   */
  public OrganizationISOCategory getEntityById(int id){
    return organizationISOCategoryDAO.loadById(id);
  }
	
  /**
   * Insert organizationISOCategory. 
   */
  public void insertEntity(OrganizationISOCategory organizationISOCategory) {
    organizationISOCategoryDAO.insert(organizationISOCategory);
  }
	 
  /**
   * Update organizationISOCategory. 
   */
  public void updateEntity(OrganizationISOCategory organizationISOCategory) {
    organizationISOCategoryDAO.update(organizationISOCategory);
  }

  /**
   * Delete organizationISOCategory. 
   */
  public void deleteEntity(OrganizationISOCategory organizationISOCategory) {
    organizationISOCategoryDAO.delete(organizationISOCategory);
  }

/* OrganizationISOCategory - generated by stajanov (do not edit/delete) */

}
