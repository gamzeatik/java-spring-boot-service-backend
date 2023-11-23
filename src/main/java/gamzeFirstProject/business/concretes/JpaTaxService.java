package gamzeFirstProject.business.concretes;

import gamzeFirstProject.business.abstracts.TaxService;
import gamzeFirstProject.business.requests.CreateTaxRequest;
import gamzeFirstProject.business.requests.UpdateTaxRequest;
import gamzeFirstProject.business.responses.GetAllProfilesResponses;
import gamzeFirstProject.business.responses.GetAllTaxesResponses;
import gamzeFirstProject.business.responses.GetByIdProfileResponses;
import gamzeFirstProject.business.responses.GetByIdTaxResponses;
import gamzeFirstProject.core.utilities.mappers.ModelMapperServices;
import gamzeFirstProject.dataAccess.abstracts.TaxRepository;
import gamzeFirstProject.entities.concretes.Profile;
import gamzeFirstProject.entities.concretes.Tax;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JpaTaxService implements TaxService {
    private TaxRepository taxRepository;
    private ModelMapperServices modelMapperServices;

    @Override
    public GetByIdTaxResponses getByIdTax(int taxId) {
        Tax tax= this.taxRepository.findById(taxId).orElseThrow();
        GetByIdTaxResponses response=this.modelMapperServices.forResponse().map(tax,GetByIdTaxResponses.class);
        return response;
    }

    @Override
    public List<GetAllTaxesResponses> getAllTax() {
        List<Tax> taxes = taxRepository.findAll();
        List<GetAllTaxesResponses> taxesResponse= taxes.stream()
                .map(tax -> this.modelMapperServices.forResponse()
                        .map(tax,GetAllTaxesResponses.class)).collect(Collectors.toList());
        return taxesResponse;
    }

    @Override
    public void addTax(CreateTaxRequest createTaxRequest) {
        Tax tax = this.modelMapperServices.forRequest().map(createTaxRequest,Tax.class);
        this.taxRepository.save(tax);
    }

    @Override
    public void deleteTax(int taxId) {
        this.taxRepository.deleteById(taxId);
    }

    @Override
    public void updateTax(UpdateTaxRequest updateTaxRequest) {
        Tax tax = this.modelMapperServices.forRequest().map(updateTaxRequest,Tax.class);
        this.taxRepository.save(tax);
    }
}
