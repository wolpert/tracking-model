package com.codeheadsystems.tracking.model;

import java.util.Optional;
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

  /**
   * Timer id optional.
   *
   * @return the optional
   */
  Optional<String> timerId();

}
