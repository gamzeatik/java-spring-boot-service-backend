package gamzeFirstProject.business.abstracts;

import gamzeFirstProject.business.requests.CreateTaxRequest;
import gamzeFirstProject.business.requests.UpdateTaxRequest;
import gamzeFirstProject.business.responses.GetAllTaxesResponses;
import gamzeFirstProject.business.responses.GetByIdTaxResponses;
import gamzeFirstProject.entities.concretes.Tax;

import java.util.List;

public interface TaxService {
    GetByIdTaxResponses getByIdTax(int taxId);
    List<GetAllTaxesResponses> getAllTax();
    void addTax(CreateTaxRequest createTaxRequest);
    void deleteTax(int taxId);
    void updateTax(UpdateTaxRequest updateTaxRequest);
}
