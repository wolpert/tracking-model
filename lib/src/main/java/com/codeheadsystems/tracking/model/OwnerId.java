package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * Value object.
 */
@Value.Immutable
public interface OwnerId {

  /**
   * Of owner id.
   *
   * @param id the id
   * @return the owner id
   */
  static OwnerId of(String id) {
    return ImmutableOwnerId.builder().id(id).build();
  }

  /**
   * Id string.
   *
   * @return the string
   */
  String id();

}
