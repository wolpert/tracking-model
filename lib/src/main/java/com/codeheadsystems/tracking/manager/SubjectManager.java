package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.OwnerId;
import com.codeheadsystems.tracking.model.PageableList;
import com.codeheadsystems.tracking.model.QueryOptions;
import com.codeheadsystems.tracking.model.Subject;
import com.codeheadsystems.tracking.model.SubjectId;

/**
 * The interface Subject manager.
 */
public interface SubjectManager {

  /**
   * Subjects list.
   *
   * @param ownerId    the owner id
   * @param categoryId the category id
   * @return the list
   */
  PageableList<Subject> subjects(OwnerId ownerId, String categoryId);

  /**
   * Subjects pageable list.
   *
   * @param ownerId      the owner id
   * @param categoryId   the category id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Subject> subjects(OwnerId ownerId, String categoryId, QueryOptions queryOptions);

  /**
   * Get subject.
   *
   * @param ownerId   the owner id
   * @param subjectId the subject id
   * @return the subject
   */
  Subject get(OwnerId ownerId, SubjectId subjectId);

  /**
   * Update subject.
   *
   * @param ownerId the owner id
   * @param subject the subject
   * @return the subject
   */
  Subject update(OwnerId ownerId, Subject subject);

  /**
   * Delete boolean.
   *
   * @param ownerId   the owner id
   * @param subjectId the subject id
   * @return the boolean
   */
  boolean delete(OwnerId ownerId, SubjectId subjectId);

}
