package com.brunoyam.spingjpademo.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Entity
@Table(name = "films")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Film{
    @Id
    private Long id;
    private String title;
    private String rating;
}
