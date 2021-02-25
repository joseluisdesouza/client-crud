package com.java.client.domain;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
public class Client {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String id;
    @Column(nullable = false)
    private String name;
}
