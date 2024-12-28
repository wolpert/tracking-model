package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * The interface Counter.
 */
@Value.Immutable
public interface Counter extends Nameable, Dateable, Owned, Subjectable {

  /**
   * Count int.
   *
   * @return the int
   */
  int count();

}
