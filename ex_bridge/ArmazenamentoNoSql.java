import java.util.HashMap;
import java.util.Map;

public class ArmazenamentoNoSql implements Armazenamento{
    Map<String, Object> armazenamentoNOSQL = new HashMap<String, Object>();

    @Override
    public void save(String id, Object data){
        System.out.println("Salvando dados no BDNoSQL com ID: " + id);
        armazenamentoNOSQL.put(id, data);
    }

    @Override
    public Object load(String id) {
        System.out.println("Carregando dados do BDNoSQL com ID: " + id);
        return armazenamentoNOSQL.get(id);
    }

    @Override
    public void update(String id, Object data) {
        System.out.println("Atualizando dados no BDNoSQL com ID: " + id);
        armazenamentoNOSQL.put(id, data);
    }

    @Override
    public void delete(String id) {
        System.out.println("Deletando dados do BDNoSQL com ID: " + id);
        armazenamentoNOSQL.remove(id);
    }

}
