package edu.ifrs.hibernate.models;

import jakarta.persistence.Entity;
import lombok.Getter;
import lombok.Setter;

import io.quarkus.hibernate.orm.panache.PanacheEntity;

@Entity
@Getter
@Setter
public class Message extends PanacheEntity {

    private Long user_id;
    private String text;
}