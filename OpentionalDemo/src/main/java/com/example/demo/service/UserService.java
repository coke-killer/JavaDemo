package com.example.demo.service;

import com.example.demo.entity.Address;
import com.example.demo.entity.City;
import com.example.demo.entity.Country;
import com.example.demo.entity.User;
import org.springframework.beans.factory.annotation.Autowired;

public class UserService {
    @Autowired
    User user;

    public void getIsoCode() {
        if (user != null) {
            Address address = user.getAddress();
            if (address != null) {
                Country country = address.getCountry();
                if (country != null) {
                    City city = country.getCity();
                    String isocode = city.getIsocode();
                    System.out.println(isocode);

                }
            }
        }
    }

    public static void main(String[] args) {
        new User();
    }
}
