package com.satinfotech.universe.repository;

import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.satinfotech.universe.domain.Invoice;

public interface InvoiceRepository extends PagingAndSortingRepository<Invoice, Long> {

    List<Invoice> findByName(String name);
    
}
