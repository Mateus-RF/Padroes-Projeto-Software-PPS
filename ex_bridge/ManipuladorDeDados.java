public class ManipuladorDeDados {
    protected Armazenamento storageManager;

    public ManipuladorDeDados(Armazenamento storage){
        this.storageManager = storage;
    }

    public void save(String id, Object data){
        storageManager.save(id, data);
    } 

    public Object load(String id){
        return storageManager.load(id);
    }
    
    public void update(String id, Object Data){
        storageManager.update(id, Data);
    }

    public void delete(String id ){
        storageManager.delete(id);
    }
}
