package com.github.yoruhinda.TheLastConstellation.service;

import com.github.yoruhinda.TheLastConstellation.model.Wish;
import com.github.yoruhinda.TheLastConstellation.repository.WishRepository;
import org.springframework.beans.factory.annotation.Autowired;

public class WishService {
    @Autowired
    private WishRepository wishRepository;

    public void saveWish(String text, String category){
        wishRepository.save(new Wish(text, category));
    }
}
