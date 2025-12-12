import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoBdSql implements Armazenamento{

    Map<String, Object> armazenamentoBDSQL = new HashMap<String, Object>();
    @Override
    public void save(String id, Object data) {
        armazenamentoBDSQL.put(id, data);
        System.out.println("Salvando dados no Banco SQL com ID: " + id);
    }

    @Override
    public Object load(String id) {
        System.out.println("Carregando dados do Banco SQL com ID: " + id);
        return armazenamentoBDSQL.get(id);
    }

    @Override
    public void update(String id, Object data) {
        System.out.println("Atualizando dados no Banco SQL com ID: " + id);
        armazenamentoBDSQL.put(id, data);
    }

    @Override
    public void delete(String id) {
        System.out.println("Deletando dados do Banco SQL com ID: " + id);
        armazenamentoBDSQL.remove(id);
    }
    
}
