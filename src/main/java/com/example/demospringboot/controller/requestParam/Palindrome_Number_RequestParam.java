package com.example.demospringboot.controller.requestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Palindrome_Number_RequestParam {
    @RequestMapping("/Palindrome_RequestParam")
    public String palindrome(@RequestParam int num){
            int reverse=0;
            int a=num;

            while (num>0){
                reverse=(reverse*10)+num%10;
                num=num/10;
            }
            if (a==reverse){
                return a+" :- Given number is Palindrome number";
            }else{
                return a+" :- Given number is not a Palindrome number";
            }
        }
}
