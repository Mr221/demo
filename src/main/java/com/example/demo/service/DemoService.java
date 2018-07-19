package com.example.demo.service;


public interface DemoService {

    String getID();

    String getName(String id);

    String saveUser(String body);
}
