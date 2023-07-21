package com.example.demospringboot.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Scanner;

@RestController
public class CheckPalindromeNumber {
    @RequestMapping("/check_num_palindrome/{num}")
    public String palindrome(@PathVariable int num){
            int rev=0;
            int reminder;
            int oreg_num=num;
            while (num!=0){
                reminder=num%10;
                rev=rev*10+reminder;
                num=num/10;
            }
            if (oreg_num==rev){
                return "number is palindrome";
            }else return "number is not palindrome";
        }

    }

