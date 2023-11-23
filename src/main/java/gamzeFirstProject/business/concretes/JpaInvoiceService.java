package gamzeFirstProject.business.concretes;

import gamzeFirstProject.business.abstracts.InvoiceService;
import gamzeFirstProject.business.requests.CreateInvoiceRequest;
import gamzeFirstProject.business.requests.UpdateInvoiceRequest;
import gamzeFirstProject.business.responses.GetAllInvoicesResponses;
import gamzeFirstProject.business.responses.GetByIdInvoiceResponses;
import gamzeFirstProject.core.utilities.mappers.ModelMapperServices;
import gamzeFirstProject.dataAccess.abstracts.InvoiceRepository;
import gamzeFirstProject.entities.concretes.Invoice;
import jakarta.transaction.Transactional;
import lombok.AllArgsConstructor;
import org.hibernate.sql.Update;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
@AllArgsConstructor
public class JpaInvoiceService implements InvoiceService {
    private InvoiceRepository invoiceRepository;
    private ModelMapperServices modelMapperServices;

//    public JpaInvoiceService(InvoiceRepository invoiceRepository) {
//        this.invoiceRepository = invoiceRepository;
//    }

    @Override
    public GetByIdInvoiceResponses getByIdInvoice(int invoiceId) {
        Invoice invoice = this.invoiceRepository.findById(invoiceId).orElseThrow();
        GetByIdInvoiceResponses response = this.modelMapperServices.forResponse().map(invoice,GetByIdInvoiceResponses.class);
        return response;
    }

    @Override
    public List<GetAllInvoicesResponses> getAllInvoice() {
        List<Invoice> invoices =invoiceRepository.findAll();
        List<GetAllInvoicesResponses> invoicesResponses = invoices.stream()
                .map(invoice -> this.modelMapperServices.forResponse()
                        .map(invoice,GetAllInvoicesResponses.class)).collect(Collectors.toList());
        return invoicesResponses;
    }

    @Override
    @Transactional
    public void addInvoice(CreateInvoiceRequest createInvoiceRequest) {
        Invoice invoice = this.modelMapperServices.forRequest().map(createInvoiceRequest,Invoice.class);
        this.invoiceRepository.save(invoice);
    }

    @Override
    @Transactional
    public void deleteInvoice(int invoiceId) {
        invoiceRepository.deleteById(invoiceId);
    }

    @Override
    @Transactional
    public void updateInvoice(UpdateInvoiceRequest updateInvoiceRequest) {
        Invoice invoice = this.modelMapperServices.forRequest().map(updateInvoiceRequest,Invoice.class);
        this.invoiceRepository.save(invoice);
    }
}
