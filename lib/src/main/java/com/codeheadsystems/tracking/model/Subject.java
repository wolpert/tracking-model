package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * The interface Subject.
 */
@Value.Immutable
public interface Subject extends Nameable, Dateable, Owned {

  /**
   * Category id string.
   *
   * @return the string
   */
  String categoryId();

}
