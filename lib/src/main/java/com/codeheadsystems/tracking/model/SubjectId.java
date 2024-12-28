package com.codeheadsystems.tracking.model;

import org.immutables.value.Value;

/**
 * Value object.
 */
@Value.Immutable
public interface SubjectId {

  /**
   * Of subject id.
   *
   * @param id the id
   * @return the subject id
   */
  static SubjectId of(String id) {
    return ImmutableSubjectId.builder().id(id).build();
  }

  /**
   * Id string.
   *
   * @return the string
   */
  String id();

}
