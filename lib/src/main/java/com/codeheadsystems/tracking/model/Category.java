package com.codeheadsystems.tracking.model;

import java.util.List;
import java.util.Optional;
import org.immutables.value.Value;

/**
 * The interface Category.
 */
@Value.Immutable
public interface Category extends Nameable, Dateable, Owned {

  /**
   * Parent id optional.
   *
   * @return the optional
   */
  Optional<String> parentId();

  /**
   * Children ids list.
   *
   * @return the list
   */
  List<String> childrenIds();

}
