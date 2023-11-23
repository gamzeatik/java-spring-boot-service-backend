package gamzeFirstProject.wepApi.controllers;
import gamzeFirstProject.business.abstracts.TaxService;
import gamzeFirstProject.business.requests.CreateTaxRequest;
import gamzeFirstProject.business.requests.UpdateTaxRequest;
import gamzeFirstProject.business.responses.GetAllTaxesResponses;
import gamzeFirstProject.business.responses.GetByIdTaxResponses;
import gamzeFirstProject.entities.concretes.Tax;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/taxes")
@AllArgsConstructor
public class TaxesController {

    private final TaxService taxService;

    @GetMapping("/{taxId}")
    public GetByIdTaxResponses getTaxById(@PathVariable int taxId) {
        return taxService.getByIdTax(taxId);
    }

    @GetMapping
    public List<GetAllTaxesResponses> getAllTaxes() {
        return taxService.getAllTax();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addTax(@RequestBody() CreateTaxRequest createTaxRequest) {
         this.taxService.addTax(createTaxRequest);
    }

    @PutMapping
    public void updateTax(@RequestBody() UpdateTaxRequest updateTaxRequest) {
        this.taxService.updateTax(updateTaxRequest);
    }

    @DeleteMapping("/{taxId}")
    public void deleteTax(@PathVariable int taxId) {
        this.taxService.deleteTax(taxId);
    }
}

