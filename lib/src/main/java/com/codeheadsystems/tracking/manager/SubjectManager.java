package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.Counter;
import com.codeheadsystems.tracking.model.Note;
import com.codeheadsystems.tracking.model.Owner;
import com.codeheadsystems.tracking.model.Subject;
import com.codeheadsystems.tracking.model.Timer;
import com.codeheadsystems.tracking.model.TimerCleared;
import java.util.List;

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
  List<Subject> subjects(Owner owner, String categoryId);

  /**
   * Notes list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  List<Note> notes(Owner owner, String subjectId);

  /**
   * Counters list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  List<Counter> counters(Owner owner, String subjectId);

  /**
   * Timers list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @return the list
   */
  List<Timer> timers(Owner owner, String subjectId);

  /**
   * Timer cleared list.
   *
   * @param owner     the owner
   * @param subjectId the subject id
   * @param timerId   the timer id
   * @return the list
   */
  List<TimerCleared> timerCleared(Owner owner, String subjectId, String timerId);

}
