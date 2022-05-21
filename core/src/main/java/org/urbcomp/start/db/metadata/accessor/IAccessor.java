package org.urbcomp.start.db.metadata.accessor;

import org.urbcomp.start.db.metadata.entity.AbstractEntity;
import org.urbcomp.start.db.metadata.mapper.IMapper;

import java.util.List;

/**
 * This interface is used to encapsulate some accessor information.
 *
 * @author zaiyuan
 * @date 2022-05-01 15:17:07
 */
public interface IAccessor<T extends AbstractEntity> extends AutoCloseable {
    /**
     * select all entity in table
     * @param commit auto_commit
     * @return  list of entity instance
     */
    List<T> selectAll(boolean commit);

    /**
     * select one entity from table by id
     * @param id    id
     * @param commit auto_commit
     * @return  entity instance
     */
    T selectById(long id, boolean commit);

    /**
     * select one entity from table by name
     * @param name  name
     * @param commit auto_commit
     * @return  entity instance
     */
    T selectByName(String name, boolean commit);

    /**
     * insert one entity instance into table
     * @param entity    entity instance
     * @param commit auto_commit
     * @return  number of affected rows
     */
    long insert(T entity, boolean commit);

    /**
     * update one entity instance in table
     * @param entity    entity instance
     * @param commit auto_commit
     * @return  number of affected rows
     */
    long update(T entity, boolean commit);

    /**
     * delete one entity instance in table
     * @param id    id
     * @param commit auto_commit
     * @return  number of affected rows
     */
    long deleteById(long id, boolean commit);

    /**
     * commit operation
     */
    void commit();

    /**
     * rollback pre operation
     */
    void rollback();

    /**
     * get mapper instance
     * @return  IMapper<T>
     */
    IMapper<T> getMapper();

    /**
     * get mapper instance(Manual Commit)
     * @return  IMapper<T>
     */
    IMapper<T> getMapperManual();
}
