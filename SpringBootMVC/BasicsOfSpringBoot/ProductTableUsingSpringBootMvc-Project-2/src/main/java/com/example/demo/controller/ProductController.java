package com.example.demo.controller;

import java.io.InputStream;
import java.nio.file.*;
import java.util.Date;
import java.util.List;

import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.validation.FieldError;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import com.example.demo.model.Product;
import com.example.demo.model.ProductDto;
import com.example.demo.repositary.ProductRepositary;

@Controller
@RequestMapping("/products")   // lowercase everywhere
public class ProductController {

    @Autowired
    private ProductRepositary repo;

    // List all products
    @GetMapping({"", "/"})
    public String showProductList(Model model) {
        List<Product> products = repo.findAll();
        model.addAttribute("products", products);
        return "products/index";
    }

    // Create page
    @GetMapping("/create")
    public String showCreatePage(Model model) {
        model.addAttribute("productDto", new ProductDto());
        return "products/CreateProduct";
    }

    // Create action
    @PostMapping("/create")
    public String createProduct(@Valid @ModelAttribute ProductDto productDto, BindingResult result) {
        if (productDto.getImageFile().isEmpty()) {
            result.addError(new FieldError("productDto", "imageFile", "The Image File is required"));
        }
        if (result.hasErrors()) {
            return "products/CreateProduct";
        }

        saveProduct(productDto, new Product());
        return "redirect:/products";   // 🔥 lowercase
    }

    // Edit page
    @GetMapping("/edit/{id}")
    public String showEditPage(@PathVariable Long id, Model model) {
        Product product = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));
        ProductDto productDto = new ProductDto();

        productDto.setName(product.getName());
        productDto.setBrand(product.getBrand());
        productDto.setCategory(product.getCategory());
        productDto.setPrice(product.getPrice());
        productDto.setDescription(product.getDescription());

        model.addAttribute("product", product);
        model.addAttribute("productDto", productDto);

        return "products/EditProduct";
    }

    // Edit action
    @PostMapping("/edit/{id}")
    public String updateProduct(@PathVariable Long id,
                                @Valid @ModelAttribute ProductDto productDto,
                                BindingResult result,
                                Model model) {
        Product product = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));

        if (result.hasErrors()) {
            model.addAttribute("product", product);
            return "products/EditProduct";
        }

        saveProduct(productDto, product);
        return "redirect:/products";   // 🔥 lowercase
    }

    // Delete action
    @GetMapping("/delete/{id}")
    public String deleteProduct(@PathVariable Long id) {
        Product product = repo.findById(id)
                .orElseThrow(() -> new IllegalArgumentException("Invalid Product Id:" + id));

        // Optionally delete image file also
        if (product.getImageFileName() != null) {
            Path imagePath = Paths.get("public/images/" + product.getImageFileName());
            try {
                Files.deleteIfExists(imagePath);
            } catch (Exception e) {
                System.out.println("Could not delete image: " + e.getMessage());
            }
        }

        repo.delete(product);
        return "redirect:/products";   // 🔥 lowercase
    }

    // Helper method for create/update
    private void saveProduct(ProductDto productDto, Product product) {
        try {
            MultipartFile image = productDto.getImageFile();
            String storageFileName = product.getImageFileName();

            if (image != null && !image.isEmpty()) {
                storageFileName = new Date().getTime() + "_" + image.getOriginalFilename();
                Path uploadPath = Paths.get("public/images/");
                if (!Files.exists(uploadPath)) {
                    Files.createDirectories(uploadPath);
                }
                try (InputStream inputStream = image.getInputStream()) {
                    Files.copy(inputStream, uploadPath.resolve(storageFileName),
                            StandardCopyOption.REPLACE_EXISTING);
                }
            }

            product.setName(productDto.getName());
            product.setBrand(productDto.getBrand());
            product.setCategory(productDto.getCategory());
            product.setPrice(productDto.getPrice());
            product.setDescription(productDto.getDescription());
            product.setImageFileName(storageFileName);
            product.setCreateAt(new Date());

            repo.save(product);

        } catch (Exception ex) {
            System.out.println("Exception: " + ex.getMessage());
        }
    }
}