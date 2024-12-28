package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.Counter;
import com.codeheadsystems.tracking.model.Event;
import com.codeheadsystems.tracking.model.Note;
import com.codeheadsystems.tracking.model.Owner;
import com.codeheadsystems.tracking.model.PageableList;
import com.codeheadsystems.tracking.model.QueryOptions;
import com.codeheadsystems.tracking.model.Subject;
import com.codeheadsystems.tracking.model.Timer;

/**
 * The interface Subject manager.
 */
public interface SubjectManager {

  /**
   * Subjects list.
   *
   * @param owner      the owner
   * @param categoryId the category id
   * @return the list
   */
  PageableList<Subject> subjects(Owner owner, String categoryId);

  /**
   * Subjects pageable list.
   *
   * @param owner        the owner
   * @param categoryId   the category id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Subject> subjects(Owner owner, String categoryId, QueryOptions queryOptions);

  /**
   * Notes list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  PageableList<Note> notes(Owner owner, String subjectId);

  /**
   * Notes pageable list.
   *
   * @param owner        the owner
   * @param subjectId    the subject id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Note> notes(Owner owner, String subjectId, QueryOptions queryOptions);

  /**
   * Counters list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  PageableList<Counter> counters(Owner owner, String subjectId);

  /**
   * Counters pageable list.
   *
   * @param owner        the owner
   * @param subjectId    the subject id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Counter> counters(Owner owner, String subjectId, QueryOptions queryOptions);

  /**
   * Timers list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  PageableList<Timer> timers(Owner owner, String subjectId);

  /**
   * Timers pageable list.
   *
   * @param owner        the owner
   * @param subjectId    the subject id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Timer> timers(Owner owner, String subjectId, QueryOptions queryOptions);

  /**
   * Events pageable list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the pageable list
   */
  PageableList<Event> events(Owner owner, String subjectId);

  /**
   * Events pageable list.
   *
   * @param owner        the owner
   * @param subjectId    the subject id
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Event> events(Owner owner, String subjectId, QueryOptions queryOptions);

  /**
   * Update subject.
   *
   * @param owner   the owner
   * @param subject the subject
   * @return the subject
   */
  Subject update(Owner owner, Subject subject);

  /**
   * Delete boolean.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the boolean
   */
  boolean delete(Owner owner, String subjectId);

}
