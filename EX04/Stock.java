import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Stock {
    private Map<Integer, Product> products = new HashMap<>();

    public void addProduct(Product product) {
        products.put(product.getId(), product);
    }

    public Product getProduct(int productId) {
        return products.get(productId);
    }

    public void updateProductQuantity(int productId, int newQuantity) {
        Product product = products.get(productId);
        if (product != null) {
            product.setQuantity(newQuantity);
        }
    }

    public List<Map<String, Object>> generateStockReport() {
        List<Map<String, Object>> report = new ArrayList<>();
        for (Product product : products.values()) {
            Map<String, Object> productInfo = new HashMap<>();
            productInfo.put("id", product.getId());
            productInfo.put("name", product.getName());
            productInfo.put("quantity", product.getQuantity());
            report.add(productInfo);
        }
        return report;
    }
}