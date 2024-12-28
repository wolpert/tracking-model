package com.codeheadsystems.tracking.model;

import java.time.Duration;
import java.time.Instant;
import java.util.Optional;
import org.immutables.value.Value;

/**
 * The interface Timer.
 */
@Value.Immutable
public interface Timer extends Nameable, Dateable, Owned, Subjectable {

  /**
   * Active boolean.
   *
   * @return the boolean
   */
  boolean active();

  /**
   * Duration duration.
   *
   * @return the duration
   */
  Duration duration();

  /**
   * Start instant.
   *
   * @return the instant
   */
  Instant start();

  /**
   * Next ping optional.
   *
   * @return the optional
   */
  Optional<Instant> nextPing();

  /**
   * End optional.
   *
   * @return the optional
   */
  Optional<Instant> end();

}
