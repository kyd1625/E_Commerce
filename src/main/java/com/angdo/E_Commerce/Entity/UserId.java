package com.angdo.E_Commerce.Entity;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserId implements Serializable {
    @Column(name = "user_id")
    private String userId;
    private String user_nm;
}
