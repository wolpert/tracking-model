package com.codeheadsystems.tracking.model;

import java.time.Instant;

/**
 * The interface Dateable.
 */
public interface Dateable {

  /**
   * Create date instant.
   *
   * @return the instant
   */
  Instant createDate();

  /**
   * Update date instant.
   *
   * @return the instant
   */
  Instant updateDate();

}
