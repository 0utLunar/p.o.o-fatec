import java.util.ArrayList;
import java.util.List;

public class Estoque {

    List<ItemEstoqueInt> list = new ArrayList<>();

    public Estoque() {
    }

    public int add(ItemEstoqueInt item) {
        list.add(item);
        return list.indexOf(item);
    }

    public boolean incUnits(int index, int qtd) {
        if (index < list.size()) {
            list.get(index).incUnits(qtd);
            return true;
        }
        return false;
    }

    public boolean decUnits(int index, int qtd) {
        if (index < list.size()) {
            list.get(index).decUnits(qtd);
            return true;
        }
        return false;
    }

    public void listAll() {
        for (ItemEstoqueInt item : list) {
            item.print();
        }
    }

}
