package com.spring.henallux.firstSpringProject.service;

import org.springframework.stereotype.Service;

@Service
public class GiftService {

    public String chooseGift(String hobby, int age){

        String messageGift;

        if(age<5){
            messageGift="a puzzle about "+hobby;
        }
        else {
            if(age<10) {
                messageGift="a DVD about "+hobby;
            }
            else {
                messageGift="a book about "+hobby;
            }
        }

        return messageGift;
    }
}
