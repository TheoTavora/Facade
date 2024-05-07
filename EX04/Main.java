import java.util.Map;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        // Criando uma instância da Facade
        StockFacade stockFacade = new StockFacade();

        // Adicionando produtos
        stockFacade.addNewProduct(1, "Meia", 10);
        stockFacade.addNewProduct(2, "Sapato", 05);

        // Atualizando a quantidade de um produto
        stockFacade.updateProductQuantity(1, 40);

        // Consultando um produto
        Product product = stockFacade.getProduct(1);
        if (product != null) {
            System.out.println("Produto encontrado: " + product.getName() + " (" + product.getQuantity() + " unidades)");
        } else {
            System.out.println("Produto não encontrado.");
        }

        // Gerando relatório de estoque
        List<Map<String, Object>> stockReport = stockFacade.generateStockReport();
        System.out.println("\nRelatório de Estoque:");
        for (Map<String, Object> item : stockReport) {
            System.out.println(item.get("name") + " (ID: " + item.get("id") + ") - Quantidade: " + item.get("quantity"));
        }
    }
}