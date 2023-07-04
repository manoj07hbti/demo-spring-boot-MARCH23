package com.example.demospringboot.controller.path_variable;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
@RestController
public class PalindromeNum_PathVariable {
    @RequestMapping("/palindrome_num/{num}")
    public String palindromeNum(@PathVariable int num){
        int rev=0;
        int a=num;

        while(num>0){
            rev=(rev*10)+num%10;
            num=num/10;
        }
        if(a==rev){
            return a+" IS THE PALINDROME NUMBER";
        }else{
            return a+" IS NOT THE PALINDROME NUMBER";
        }
    }
}
