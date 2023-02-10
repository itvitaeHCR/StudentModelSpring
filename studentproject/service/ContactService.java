package com.practice.studentproject.service;

import com.practice.studentproject.repository.ContactRepository;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
@Transactional

public class ContactService {

    @Autowired
    ContactRepository contactRepository;
}
