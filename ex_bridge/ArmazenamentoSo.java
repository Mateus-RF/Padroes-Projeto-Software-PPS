import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoSo implements Armazenamento {
    Map<String, Object> armazenamentoLocal = new HashMap<String, Object>();
    @Override
    public void save(String id, Object data) {
        armazenamentoLocal.put(id, data);
        System.out.println("Salvando dados no armazenamentoSO com ID: " + id);
    }

    @Override
    public Object load(String id) {
        System.out.println("Carregando dados do armazenamentoSO  com ID: " + id);
        return armazenamentoLocal.get(id);
    }

    @Override
    public void update(String id, Object data) {
        System.out.println("Atualizando dados no armazenamentoSO com ID: " + id);
        armazenamentoLocal.put(id, data);
    }

    @Override
    public void delete(String id) {
        System.out.println("Deletando dados do armazenamentoSO com ID: " + id);
        armazenamentoLocal.remove(id);
    }
    
}
