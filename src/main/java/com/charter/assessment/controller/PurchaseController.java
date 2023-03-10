package com.charter.assessment.controller;

import com.charter.assessment.dto.PurchaseDto;
import com.charter.assessment.entity.Purchase;
import com.charter.assessment.repository.PurchaseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class PurchaseController {

    @Autowired
    private PurchaseRepository repository;

    @RequestMapping(value = "/purchases", method = RequestMethod.GET)
    public List<PurchaseDto> getPurchases() {

        Iterable<Purchase> purchasesIterable = repository.findAll();
        List<Purchase> purchases = new ArrayList<>();
        purchasesIterable.forEach(purchases::add);
        List<PurchaseDto> purchasesDto = new ArrayList<>();
        for(int i = 0; i < purchases.size(); i++) {
            int points = 0;
            if(purchases.get(i).getAmount() > 50) {
                points += Math.floor(purchases.get(i).getAmount() - 50);
            }
            if(purchases.get(i).getAmount() > 100) {
                points += Math.floor(purchases.get(i).getAmount() - 100);
            }
            PurchaseDto purchaseDto = new PurchaseDto(
                    purchases.get(i).getCustomer().getFirstName(),
                    purchases.get(i).getCustomer().getLastName(),
                    purchases.get(i).getDate(),
                    purchases.get(i).getAmount(),
                    points
            );
            purchasesDto.add(purchaseDto);
        }
        return purchasesDto;
    }
}
