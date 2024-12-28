package com.codeheadsystems.tracking.model;

import java.util.Optional;
import org.immutables.value.Value;

/**
 * The interface Note.
 */
@Value.Immutable
public interface Event extends Nameable, Dateable, Owned, Subjectable {

  /**
   * Counter id optional.
   *
   * @return the optional
   */
  Optional<String> counterId();

}
