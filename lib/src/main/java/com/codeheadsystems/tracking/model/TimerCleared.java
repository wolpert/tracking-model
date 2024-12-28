package com.codeheadsystems.tracking.model;

/**
 * The interface Timer cleared.
 */
public interface TimerCleared extends Nameable, Dateable, Owned, Subjectable {

  /**
   * Timer id string.
   *
   * @return the string
   */
  String timerId();

  /**
   * Note string.
   *
   * @return the string
   */
  String note();

}
