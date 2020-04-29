package com.dubudiu.controller;

import com.dubudiu.entity.Ingredient;
import com.dubudiu.entity.Taco;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.dubudiu.entity.Ingredient.Type;

@Slf4j
@Controller
@RequestMapping("/design")
public class DesignTacoController {

    @GetMapping
    public String showDesignForm(Model model){
        List<Ingredient> ingredientList = Arrays.asList(
                new Ingredient("1","Flour tortilla", Type.WRAP)
        );
        Type [] types = Type.values();
        for (Type type :types) {
            model.addAttribute(type.toString().toLowerCase(),filterByType(ingredientList,type));
        }
        model.addAttribute("design", new Taco());
        return "design";
    }

    private List<Ingredient> filterByType(List<Ingredient> ingredients,Type type){
        return ingredients.stream().filter(e -> e.getType().equals(type)).collect(Collectors.toList());
    }

}
