package com.angdo.E_Commerce.Entity;

import jakarta.persistence.Embeddable;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@EqualsAndHashCode
public class PaymentId implements Serializable {
    // Serializable -> 객체 직렬화 하겠다는 의도를 표시 ( payment엔터티에 직렬적으로 복합키를 지정했기때문)
    // 지정하지않으면 NotSerializableException 에러 발생
    private Integer payment_no;
    private String user_nm;
}
