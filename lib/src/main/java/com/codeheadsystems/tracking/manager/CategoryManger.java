package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.Category;
import com.codeheadsystems.tracking.model.Owner;
import java.util.List;

/**
 * The interface Category manger.
 */
public interface CategoryManger {

  /**
   * Categories list.
   *
   * @param owner the owner
   * @return the list
   */
  List<Category> categories(Owner owner);

  /**
   * Categories list.
   *
   * @param owner    the owner
   * @param category the category
   * @return the list
   */
  List<Category> categories(Owner owner, Category category);

}
