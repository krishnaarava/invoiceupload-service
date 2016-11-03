package com.satinfotech.universe.web.controller;

import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.satinfotech.universe.domain.Invoice;
import com.satinfotech.universe.repository.InvoiceRepository;

@RestController
@RequestMapping("/api/invoices")
public class InvoiceController {

    @Autowired
    private InvoiceRepository repository;

    @RequestMapping(method = RequestMethod.GET)
    public ResponseEntity<Collection<Invoice>> getAllInvoices(){
        return new ResponseEntity<>((Collection<Invoice>) repository.findAll(), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, value = "/{id}")
    public ResponseEntity<Invoice> getInvoiceWithId(@PathVariable Long id) {
        return new ResponseEntity<>(repository.findOne(id),HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.GET, params = {"name"})
    public ResponseEntity<Collection<Invoice>> findInvoiceWithName(@RequestParam(value="name") String name) {
        return new ResponseEntity<>(repository.findByName(name), HttpStatus.OK);
    }

    @RequestMapping(method = RequestMethod.POST)
    public ResponseEntity<?> addInvoice(@RequestBody Invoice input) {
        return new ResponseEntity<>(repository.save(input), HttpStatus.CREATED);
    }
    
}
