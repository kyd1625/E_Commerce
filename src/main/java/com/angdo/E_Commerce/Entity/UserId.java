package com.angdo.E_Commerce.Entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class UserId implements Serializable {
    private String user_id;
    private String user_nm;
}
