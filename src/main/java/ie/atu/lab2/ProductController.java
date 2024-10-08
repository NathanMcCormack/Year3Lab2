package ie.atu.lab2;

import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/products")

public class ProductController {

    private List<Product> productList = new ArrayList<>();
    public ProductController(){
        //Initialize with some sample products
        productList.add(new Product("1", "TV", "Electronics", 600.0));
        productList.add(new Product("2", "Radio", "Electronics", 500.0));
    }

    //GET Endpoint to fetch all products
    @GetMapping
    public List<Product> getAllProduct(){
        return productList;
    }

    // POST Endpoint to add a new product
    @PostMapping
    public Product addProduct(@RequestBody Product newProduct){
        productList.add(newProduct);
        return newProduct;
    }
}
