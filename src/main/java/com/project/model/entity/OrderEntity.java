package com.project.model.entity;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDate;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class OrderEntity {

    private Integer id;
    private String number;
    private LocalDate cratedDate;
    private LocalDate receivedDate;
    private double total;

    @Override
    public String toString() {
        return "OrderEntity{" +
                "id=" + id +
                ", number='" + number + '\'' +
                ", cratedDate=" + cratedDate +
                ", receivedDate=" + receivedDate +
                ", total=" + total +
                '}';
    }
}
