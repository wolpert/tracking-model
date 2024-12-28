package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.OwnerId;
import com.codeheadsystems.tracking.model.PageableList;
import com.codeheadsystems.tracking.model.QueryOptions;
import com.codeheadsystems.tracking.model.SubjectId;

/**
 * This is a generic manager for components of a subject. (Timers, notes, etc)
 *
 * @param <T> the type parameter
 */
public interface SubjectComponentManager<T> {

  /**
   * Query pageable list.
   *
   * @param ownerId   the owner id
   * @param subjectId the subject id
   * @return the pageable list
   */
  PageableList<T> query(OwnerId ownerId, SubjectId subjectId);

  /**
   * Query pageable list.
   *
   * @param ownerId      the owner id
   * @param subjectId    the subject id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<T> query(OwnerId ownerId, SubjectId subjectId, QueryOptions queryOptions);

  /**
   * Get t.
   *
   * @param ownerId     the owner id
   * @param subjectId   the subject id
   * @param componentId the component id
   * @return the t
   */
  T get(OwnerId ownerId, SubjectId subjectId, String componentId);

  /**
   * Update t.
   *
   * @param ownerId   the owner id
   * @param component the component
   * @return the t
   */
  T update(OwnerId ownerId, T component);

  /**
   * Delete boolean.
   *
   * @param ownerId     the owner id
   * @param componentId the component id
   * @return the boolean
   */
  boolean delete(OwnerId ownerId, String componentId);

}
