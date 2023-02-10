package com.practice.studentproject.controller;

import com.practice.studentproject.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin
@RequestMapping("/api/contact")
public class ContactController {

    @Autowired
    ContactService contactService;

        // CRUD

    // Create


    // Read


    // Update


    // Delete



}
