package com.rosu.onlinestore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.NaturalId;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;


@NoArgsConstructor
@AllArgsConstructor
@Data
@Entity
public class ProductCategory {

    @Id
    @GeneratedValue
    private Integer categoryId;

    private String categoryName;

    @NaturalId
    private Integer categoryType;

    private Date createTime;

    private Date updateTime;

}
