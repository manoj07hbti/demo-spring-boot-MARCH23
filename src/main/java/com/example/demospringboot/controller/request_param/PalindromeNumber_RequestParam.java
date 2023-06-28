package com.example.demospringboot.controller.request_param;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalindromeNumber_RequestParam {
    @RequestMapping("/palindrome")
    public String palindrome(@RequestParam int num){

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
