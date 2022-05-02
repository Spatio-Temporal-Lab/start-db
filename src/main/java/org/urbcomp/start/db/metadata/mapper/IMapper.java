package org.urbcomp.start.db.metadata.mapper;

import org.apache.ibatis.annotations.Param;
import org.urbcomp.start.db.metadata.entity.AbstractEntity;

import java.util.List;

/**
 * This interface is used to encapsulate some basic mapping information.
 *
 * @author zaiyuan
 * @date 2022-05-01 15:17:07
 */
public interface IMapper<T extends AbstractEntity> {

    /**
     * select all entity in table
     * @return  list of entity instance
     */
    List<T> selectAll();

    /**
     * select one entity in table based on id
     * @param id    id
     * @return  entity instance
     */
    T selectById(@Param("id") long id);

    /**
     * select one entity in table based on name
     * @param name  name
     * @return  entity instance
     */
    T selectByName(@Param("name") String name);

    /**
     * insert one entity into table
     * @param entity    entity
     * @return  number of affected rows
     */
    long insert(T entity);

    /**
     * update one entity in a table
     * @param entity    entity
     * @return  number of affected rows
     */
    long update(T entity);

    /**
     * delete on entity in a table by id
     * @param id    id
     * @return  number of affected rows
     */
    long deleteById(@Param("id") long id);
}
