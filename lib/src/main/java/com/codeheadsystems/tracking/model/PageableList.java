package com.codeheadsystems.tracking.model;

import java.util.List;
import java.util.Optional;

/**
 * The interface pageable list.
 *
 * @param <T> the type parameter
 */
public interface PageableList<T> extends List<T> {

  /**
   * Page token optional.
   *
   * @return the optional
   */
  Optional<String> pageToken();

}
