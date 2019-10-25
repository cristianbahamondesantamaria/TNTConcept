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

package com.autentia.tnt.manager.document;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import com.autentia.tnt.businessobject.Document;
import com.autentia.tnt.businessobject.DocumentCategory;
import com.autentia.tnt.businessobject.DocumentVersion;
import com.autentia.tnt.dao.SortCriteria;
import com.autentia.tnt.dao.hibernate.DocumentCategoryDAO;
import com.autentia.tnt.dao.hibernate.DocumentDAO;
import com.autentia.tnt.dao.hibernate.DocumentVersionDAO;
import com.autentia.tnt.dao.search.DocumentSearch;
import com.autentia.tnt.util.SpringUtils;





public class DocumentManager {


/* Document - generated by stajanov (do not edit/delete) */


  /** Logger */
  private static final Log log = LogFactory.getLog(DocumentManager.class);

  /** Document DAO **/
  private DocumentDAO documentDAO;

  /**
   * Get default DocumentManager as defined in Spring's configuration file.
   * @return the default singleton DocumentManager
   */
  public static DocumentManager getDefault()
  {
    return (DocumentManager)SpringUtils.getSpringBean("managerDocument");
  }

  /** 
   * Empty constructor needed by CGLIB (Spring AOP)
   */
  protected DocumentManager()
  {
  }
	
  /** 
   * Default constructor 
   * @deprecated do not construct managers alone: use Spring's declared beans
   */
  public DocumentManager( DocumentDAO documentDAO )
  {
    this.documentDAO = documentDAO;
  }

  /**
   * List documents. 
   * @param search search filter to apply
   * @param sort sorting criteria
   * @return the list of all documents sorted by requested criterion
   */
  public List<Document> getAllEntities(DocumentSearch search, SortCriteria sort){
    return documentDAO.search( search, sort );
  }
  
  /**
   * Get document by primary key.
   * @return document selected by id.
   */
  public Document getEntityById(int id){
    return documentDAO.loadById(id);
  }
	
  /**
   * Insert document. 
   */
  public void insertEntity(Document document) {
    documentDAO.insert(document);
  }
	 
  /**
   * Update document. 
   */
  public Document updateEntity(Document document) {
	  return documentDAO.updateAndRet(document);
  }

  /**
   * Delete document. 
   */
  public void deleteEntity(Document document) {
    documentDAO.delete(document);
  }
/* Document - generated by stajanov (do not edit/delete) */

	
}
