public interface Armazenamento {
    void save(String id, Object data);
    Object load(String id);
    void update(String id, Object data);
    void delete(String id);
    
}
