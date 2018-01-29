package orm;

import java.util.List;

/**
 * Interface for SubDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface ISubDAO {
	/**
	 * Perform an initial save of a previously unsaved Sub entity. All
	 * subsequent persist actions of this entity should use the #update()
	 * method. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#persist(Object)
	 * EntityManager#persist} operation.
	 * 
	 * <pre>
	 * 
	 * EntityManagerHelper.beginTransaction();
	 * ISubDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Sub entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Sub entity);

	/**
	 * Delete a persistent Sub entity. This operation must be performed within
	 * the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * ISubDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Sub entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Sub entity);

	/**
	 * Persist a previously saved Sub entity and return it or a copy of it to
	 * the sender. A copy of the Sub entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = ISubDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Sub entity to update
	 * @return Sub the persisted Sub entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Sub update(Sub entity);

	public Sub findById(Long id);

	/**
	 * Find all Sub entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Sub property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Sub> found by query
	 */
	public List<Sub> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<Sub> findBySubname(Object subname, int... rowStartIdxAndCount);

	/**
	 * Find all Sub entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Sub> all Sub entities
	 */
	public List<Sub> findAll(int... rowStartIdxAndCount);
}