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

package com.autentia.tnt.dao.hibernate;

import com.autentia.tnt.businessobject.*;
import com.autentia.tnt.dao.*;
import com.autentia.tnt.util.SpringUtils;

import java.util.*;
import org.apache.commons.logging.*;

/**
 * DAO for Idea objects.
 * @author stajanov code generator
 */
public class IdeaDAO extends HibernateManagerBase<Idea> 
{
/* idea - generated by stajanov (do not edit/delete) */



  /** Logger */
  private static final Log log = LogFactory.getLog(IdeaDAO.class);

  /**
   * Get default IdeaDAO as defined in Spring's configuration file.
   * @return the default singleton IdeaDAO
   */
  public static IdeaDAO getDefault()
  {
    return (IdeaDAO)SpringUtils.getSpringBean("daoIdea");
  }

 /** 
   * Constructor
   * @deprecated do not construct DAOs alone: use Spring's declared beans
   */
  public IdeaDAO(){
    super(false);
  }

  /** 
   * Retrieve a Idea object from database given its id
   * @param id primary key of Idea object
   * @return the Idea object identified by the id
   * @throws DataAccException on error
   */
  public Idea loadById(int id ) throws DataAccException {
    return super.loadByPk(Idea.class,id);
  }

    public Idea getById(int id ) throws DataAccException {
        return super.getByPk(Idea.class,id);
    }

  /** 
   * Get all Idea objects from database sorted by the given criteria
   * @param crit the sorting criteria
   * @return a list with all existing Idea objects
   * @throws DataAccException on error
   */
  public List<Idea> search( SortCriteria crit ) throws DataAccException {
    return super.list(Idea.class,crit);
  }

  /** 
   * Get specified Idea objects from database sorted by the given criteria
   * @param search search criteria
   * @param sort the sorting criteria
   * @return a list with Idea objects matching the search criteria
   * @throws DataAccException on error
   */
  public List<Idea> search(SearchCriteria search, SortCriteria sort) throws DataAccException {
    return super.search(Idea.class,search,sort);
  }

  /** 
   * Insert a new Idea object in database
   * @param dao the Idea object to insert
   * @throws DataAccException on error
   */
  public void insert(Idea dao) throws DataAccException {
    super.insert(dao);
  }

  /** 
   * Update an existing Idea object in database
   * @param dao the Idea object to update
   * @throws DataAccException on error
   */
  public void update(Idea dao) throws DataAccException {
    super.update(dao,dao.getId());
  }

  /** 
   * Delete an existing Idea object in database
   * @param dao the Idea object to update
   * @throws DataAccException on error
   */
  public void delete(Idea dao) throws DataAccException {
    super.delete(dao,dao.getId());
  }

/* idea - generated by stajanov (do not edit/delete) */
}
