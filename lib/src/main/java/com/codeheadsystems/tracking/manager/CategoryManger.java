package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.Category;
import com.codeheadsystems.tracking.model.Owner;
import com.codeheadsystems.tracking.model.PageableList;
import com.codeheadsystems.tracking.model.QueryOptions;

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
  PageableList<Category> categories(Owner owner);

  /**
   * Categories pageable list.
   *
   * @param owner        the owner
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Category> categories(Owner owner, QueryOptions queryOptions);

  /**
   * Categories list.
   *
   * @param owner    the owner
   * @param category the category
   * @return the list
   */
  PageableList<Category> categories(Owner owner, Category category);

  /**
   * Categories pageable list.
   *
   * @param owner        the owner
   * @param category     the category
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Category> categories(Owner owner, Category category, QueryOptions queryOptions);

  /**
   * Update category.
   *
   * @param owner    the owner
   * @param category the category
   * @return the category
   */
  Category update(Owner owner, Category category);

  /**
   * Delete boolean.
   *
   * @param owner      the owner
   * @param categoryId the category id
   * @return the boolean
   */
  boolean delete(Owner owner, String categoryId);

}
