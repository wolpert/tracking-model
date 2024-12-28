package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * The interface Note.
 */
@Value.Immutable
public interface Note extends Nameable, Dateable, Owned, Subjectable {

  /**
   * Note string.
   *
   * @return the string
   */
  String note();

}
