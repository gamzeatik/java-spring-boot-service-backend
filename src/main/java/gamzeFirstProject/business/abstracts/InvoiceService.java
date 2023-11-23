package gamzeFirstProject.business.abstracts;

import gamzeFirstProject.business.requests.CreateInvoiceRequest;
import gamzeFirstProject.business.requests.UpdateInvoiceRequest;
import gamzeFirstProject.business.responses.GetAllInvoicesResponses;
import gamzeFirstProject.business.responses.GetByIdInvoiceResponses;

import java.util.List;

public interface InvoiceService {
    GetByIdInvoiceResponses getByIdInvoice(int invoiceId);
    List<GetAllInvoicesResponses> getAllInvoice();
    void addInvoice(CreateInvoiceRequest createInvoiceRequest);
    void deleteInvoice(int invoiceId);
    void updateInvoice(UpdateInvoiceRequest updateInvoiceRequest);
}
