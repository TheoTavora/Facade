import java.util.Map;
import java.util.List;

public class StockFacade {
    private Stock stock;

    public StockFacade() {
        this.stock = new Stock();
    }

    public void addNewProduct(int id, String name, int quantity) {
        Product product = new Product(id, name, quantity);
        stock.addProduct(product);
    }

    public Product getProduct(int productId) {
        return stock.getProduct(productId);
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        stock.updateProductQuantity(productId, newQuantity);
    }

    public List<Map<String, Object>> generateStockReport() {
        return stock.generateStockReport();
    }
}

/*
 * Neste código, a classe StockFacade encapsula a funcionalidade do estoque, 
 * fornecendo métodos simplificados para adicionar um novo produto, obter um produto existente, 
 * atualizar a quantidade de um produto e gerar um relatório de estoque. 
 * Os métodos internos da StockFacade delegam as chamadas aos métodos correspondentes da classe Stock.
 */