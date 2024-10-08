package ie.atu.lab2;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/product")

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
}
