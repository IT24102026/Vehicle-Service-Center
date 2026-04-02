package com.backend.backend.repository;

import com.backend.backend.entity.ServiceItem;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface ServiceItemRepository extends JpaRepository<ServiceItem, Long> {
    List<ServiceItem> findByServiceOrderId(Long serviceOrderId);
    void deleteByServiceOrderId(Long serviceOrderId);
}
