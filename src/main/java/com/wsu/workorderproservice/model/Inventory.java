package com.wsu.workorderproservice.model;

import java.math.BigDecimal;
import java.sql.Date;



import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Builder
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name = "Inventory")

public class Inventory {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "Item ID")
    private Integer item_Id;

    @Column(name = "Quantity")
    private Integer quantity;

    @Column(name = "Location")
    private String  location;

    @Column(name = "Cost")
    private BigDecimal cost;

    @Column(name = "Expiration Date")
    private Date expiration;

}
