package com.codeheadsystems.tracking.manager;

import com.codeheadsystems.tracking.model.Category;
import com.codeheadsystems.tracking.model.Owner;
import com.codeheadsystems.tracking.model.OwnerId;
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
   * @param ownerId  the owner id
   * @param category the category
   * @return the list
   */
  PageableList<Category> categories(OwnerId ownerId, Category category);

  /**
   * Categories pageable list.
   *
   * @param ownerId      the owner id
   * @param category     the category
   * @param queryOptions the query options
   * @return the pageable list
   */
  PageableList<Category> categories(OwnerId ownerId, Category category, QueryOptions queryOptions);

  /**
   * Get category.
   *
   * @param ownerId    the owner id
   * @param categoryId the category id
   * @return the category
   */
  Category get(OwnerId ownerId, String categoryId);

  /**
   * Update category.
   *
   * @param ownerId  the owner id
   * @param category the category
   * @return the category
   */
  Category update(OwnerId ownerId, Category category);

  /**
   * Delete boolean.
   *
   * @param ownerId    the owner id
   * @param categoryId the category id
   * @return the boolean
   */
  boolean delete(OwnerId ownerId, String categoryId);

}
