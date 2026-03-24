package com.backend.backend.dto;

import com.backend.backend.entity.ServiceItem;
import lombok.Data;
import java.math.BigDecimal;

@Data
public class ServiceItemDTO {
    private Long id;
    private Long serviceOrderId;
    private String description;
    private BigDecimal laborHours;
    private BigDecimal hourlyRate;
    private BigDecimal totalPrice;
    private String notes;
    private ServiceItem.ItemStatus status;
}