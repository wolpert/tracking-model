package com.codeheadsystems.tracking.model;

import java.util.Optional;
import org.immutables.value.Value;

/**
 * The interface Query options.
 */
@Value.Immutable
public interface QueryOptions {

  /**
   * Size int.
   *
   * @return the int
   */
  int size();

  /**
   * Page token optional.
   *
   * @return the optional
   */
  Optional<String> pageToken();

}
