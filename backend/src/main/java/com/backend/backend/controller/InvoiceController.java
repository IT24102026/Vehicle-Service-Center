package com.backend.backend.controller;

import com.backend.backend.dto.InvoiceDTO;
import com.backend.backend.entity.Invoice;
import com.backend.backend.service.InvoiceService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;
import java.math.BigDecimal;
import java.util.List;

@RestController @RequestMapping("/api/invoices") @RequiredArgsConstructor
public class InvoiceController {
    private final InvoiceService service;

    @GetMapping public List<InvoiceDTO> getAll() { return service.getAll(); }
    @GetMapping("/{id}") public InvoiceDTO getById(@PathVariable Long id) { return service.getById(id); }
    @GetMapping("/order/{orderId}") public InvoiceDTO byOrder(@PathVariable Long orderId) {
        return service.getByOrderId(orderId);
    }

    @PostMapping("/generate/{orderId}")
    public InvoiceDTO generate(@PathVariable Long orderId) {
        return service.generateFromOrder(orderId);
    }

    @PostMapping("/{id}/payment")
    public InvoiceDTO recordPayment(@PathVariable Long id,
                                    @RequestParam BigDecimal amount,
                                    @RequestParam Invoice.PaymentMethod method) {
        return service.recordPayment(id, amount, method);
    }
}