package com.example.demospringboot.controller.requestParam;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ArmstrongNumber_RequestParm {
        @RequestMapping("/Armstrong")
        public String armStrong(@RequestParam int number){
            int armNumber=0,rem,a;
            a=number;
            while(number>0){
                rem=number%10;
                armNumber=rem*rem*rem+armNumber;
                number=number/10;
            }
            if (a==armNumber){
                return a +"Number is Armstrong number";
            }else{
                return a +"Number is not Armstrong Number";
            }
        }
    }
