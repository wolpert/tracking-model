package com.codeheadsystems.tracking.model;

import java.util.Optional;
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

  /**
   * Event id optional.
   *
   * @return the optional
   */
  Optional<String> eventId();

}
