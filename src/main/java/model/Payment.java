package model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document("payment")
public class Payment {
    @Id
    Integer id;
    Integer idCredit;
    Float amount;
    String date;
    PaymentType paymentType;
}
