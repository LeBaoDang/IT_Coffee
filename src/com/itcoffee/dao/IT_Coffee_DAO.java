package Com.IT_Coffee.DAO;

import java.util.List;

abstract public class IT_Coffee_DAO<EntityType, KeyType> {
    abstract public int insert(EntityType entity);
    abstract public int update(EntityType entity);
    abstract public int delete(KeyType id);
    abstract public EntityType selectById(KeyType id);
    abstract public List<EntityType> selectAll();
    abstract protected List<EntityType> selectBySql(String sql, Object...args);
}
