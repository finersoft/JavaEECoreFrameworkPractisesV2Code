package orm;

import java.util.List;
import java.util.Set;

/**
 * Interface for MainDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IMainDAO {
	/**
	 * Perform an initial save of a previously unsaved Main entity. All
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
	 * IMainDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Main entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Main entity);

	/**
	 * Delete a persistent Main entity. This operation must be performed within
	 * the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IMainDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Main entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Main entity);

	/**
	 * Persist a previously saved Main entity and return it or a copy of it to
	 * the sender. A copy of the Main entity parameter is returned when the JPA
	 * persistence mechanism has not previously been tracking the updated
	 * entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IMainDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Main entity to update
	 * @return Main the persisted Main entity instance, may not be the same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Main update(Main entity);

	public Main findById(Long id);

	/**
	 * Find all Main entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Main property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Main> found by query
	 */
	public List<Main> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<Main> findByMainname(Object mainname, int... rowStartIdxAndCount);

	/**
	 * Find all Main entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Main> all Main entities
	 */
	public List<Main> findAll(int... rowStartIdxAndCount);
}