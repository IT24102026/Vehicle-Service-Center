package com.backend.backend.dto;

import com.backend.backend.entity.Invoice;
import lombok.Data;
import java.math.BigDecimal;
import java.time.LocalDate;

@Data
public class InvoiceDTO {
    private Long id;
    private String invoiceNumber;
    private Long serviceOrderId;
    private String orderNumber;
    private String customerName;
    private String vehicleInfo;
    private LocalDate issueDate;
    private LocalDate dueDate;
    private BigDecimal laborTotal;
    private BigDecimal partsTotal;
    private BigDecimal subtotal;
    private BigDecimal discountAmount;
    private BigDecimal taxAmount;
    private BigDecimal totalAmount;
    private BigDecimal paidAmount;
    private BigDecimal balanceDue;
    private Invoice.PaymentStatus paymentStatus;
    private Invoice.PaymentMethod paymentMethod;
    private LocalDate paymentDate;
    private String notes;
}