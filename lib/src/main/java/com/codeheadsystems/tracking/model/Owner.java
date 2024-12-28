package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * The interface Owner.
 */
@Value.Immutable
public interface Owner {

  /**
   * Name string.
   *
   * @return the string
   */
  String name();

  /**
   * Id string.
   *
   * @return the string
   */
  String id();

}
