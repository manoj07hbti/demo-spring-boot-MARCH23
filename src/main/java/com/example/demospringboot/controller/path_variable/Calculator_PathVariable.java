package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class Calculator_PathVariable {

        @RequestMapping("/add/{a}/{b}")
        public String add(@PathVariable int a , @PathVariable int b){
            int c=a+b;
            return "the addition of a and b is : "+c;
        }

        @RequestMapping("/subtraction/{a}/{b}")
        public String sub(@PathVariable int a ,@PathVariable int b){
            int c=a-b;
            return "the subtraction of a and b is : "+c;
        }

        @RequestMapping("/multiply/{a}/{b}")
        public String multi(@PathVariable int a ,@PathVariable int b){
            int c=a*b;
            return "the multiplication of a and b is : "+c;
        }

        @RequestMapping("/divide/{a}/{b}")
        public String division(@PathVariable int a ,@PathVariable int b){
            double c=(double)a/b;
            return "the division of a and b is : "+c;
        }
}
