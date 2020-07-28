package com.trushil.thymeleaf.demo.thymeleafDemo.Controller;

import com.trushil.thymeleaf.demo.thymeleafDemo.entity.Product;
import com.trushil.thymeleaf.demo.thymeleafDemo.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@Controller
@RequestMapping("/product")
public class ProductController {

    @Autowired
    private ProductRepository productRepository;

    @GetMapping("/list")
    public String findAll(Model model){
        model.addAttribute("products",productRepository.findAll());

        return "product-list";
    }

    @GetMapping("/showFormForAdd")
    public String showFormForAdd(Model theModel) {

        // create model attribute to bind form data
        Product theProduct = new Product();

        theModel.addAttribute("product", theProduct);

        return "product-form";
    }

    @GetMapping("/showFormForUpdate")
    public String showFormForUpdate(@RequestParam("productID") int theId,
                                    Model theModel) {

        // get the Product from the service
        Optional<Product> theProduct = productRepository.findById(theId);
        System.out.println(theProduct);
        // set Product as a model attribute to pre-populate the form
        theModel.addAttribute("product", theProduct);

        // send over to our form
        return "product-form";
    }


    @PostMapping("/save")
    public String saveProduct(@ModelAttribute("product") Product theProduct) {

        // save the Product
        productRepository.save(theProduct);

        // use a redirect to prevent duplicate submissions
        return "redirect:/product/list";
    }


    @GetMapping("/delete")
    public String delete(@RequestParam("productID") int theId) {

        // delete the Product
        productRepository.deleteById(theId);

        // redirect to /Products/list
        return "redirect:/product/list";

    }
}
