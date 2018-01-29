package orm;

import java.sql.Timestamp;
import java.util.List;

/**
 * Interface for UserinfoDAO.
 * 
 * @author MyEclipse Persistence Tools
 */

public interface IUserinfoDAO {
	/**
	 * Perform an initial save of a previously unsaved Userinfo entity. All
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
	 * IUserinfoDAO.save(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Userinfo entity to persist
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void save(Userinfo entity);

	/**
	 * Delete a persistent Userinfo entity. This operation must be performed
	 * within the a database transaction context for the entity's data to be
	 * permanently deleted from the persistence store, i.e., database. This
	 * method uses the {@link javax.persistence.EntityManager#remove(Object)
	 * EntityManager#delete} operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * IUserinfoDAO.delete(entity);
	 * EntityManagerHelper.commit();
	 * entity = null;
	 * </pre>
	 * 
	 * @param entity
	 *            Userinfo entity to delete
	 * @throws RuntimeException
	 *             when the operation fails
	 */
	public void delete(Userinfo entity);

	/**
	 * Persist a previously saved Userinfo entity and return it or a copy of it
	 * to the sender. A copy of the Userinfo entity parameter is returned when
	 * the JPA persistence mechanism has not previously been tracking the
	 * updated entity. This operation must be performed within the a database
	 * transaction context for the entity's data to be permanently saved to the
	 * persistence store, i.e., database. This method uses the
	 * {@link javax.persistence.EntityManager#merge(Object) EntityManager#merge}
	 * operation.
	 * 
	 * <pre>
	 * EntityManagerHelper.beginTransaction();
	 * entity = IUserinfoDAO.update(entity);
	 * EntityManagerHelper.commit();
	 * </pre>
	 * 
	 * @param entity
	 *            Userinfo entity to update
	 * @return Userinfo the persisted Userinfo entity instance, may not be the
	 *         same
	 * @throws RuntimeException
	 *             if the operation fails
	 */
	public Userinfo update(Userinfo entity);

	public Userinfo findById(Long id);

	/**
	 * Find all Userinfo entities with a specific property value.
	 * 
	 * @param propertyName
	 *            the name of the Userinfo property to query
	 * @param value
	 *            the property value to match
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Userinfo> found by query
	 */
	public List<Userinfo> findByProperty(String propertyName, Object value, int... rowStartIdxAndCount);

	public List<Userinfo> findByUsername(Object username, int... rowStartIdxAndCount);

	public List<Userinfo> findByPassword(Object password, int... rowStartIdxAndCount);

	public List<Userinfo> findByAge(Object age, int... rowStartIdxAndCount);

	/**
	 * Find all Userinfo entities.
	 * 
	 * @param rowStartIdxAndCount
	 *            Optional int varargs. rowStartIdxAndCount[0] specifies the the
	 *            row index in the query result-set to begin collecting the
	 *            results. rowStartIdxAndCount[1] specifies the the maximum
	 *            count of results to return.
	 * @return List<Userinfo> all Userinfo entities
	 */
	public List<Userinfo> findAll(int... rowStartIdxAndCount);
}