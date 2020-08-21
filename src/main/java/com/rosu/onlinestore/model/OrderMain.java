package com.rosu.onlinestore.model;
import com.sun.istack.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.HashSet;
import java.util.Set;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
public class OrderMain /*implements Serializable*/ {
    private static final long serialVersionUID = -3819883511505235030L;
    @Id
    @NotNull
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long orderId;

    @OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "orderMain")
    private Set<ProductInOrder> products = new HashSet<>();

    @NotEmpty
    private String buyerEmail;

    @NotEmpty
    private String buyerName;

    @NotEmpty
    private String buyerPhone;

    @NotEmpty
    private String buyerAddress;

    // Total Amount
    @NotNull
    private BigDecimal orderAmount;

    @NotNull
    @ColumnDefault("0")
    private Integer orderStatus;

    @CreationTimestamp
    private LocalDateTime createTime;

    @UpdateTimestamp
    private LocalDateTime updateTime;
}
