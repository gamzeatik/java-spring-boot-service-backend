package gamzeFirstProject.wepApi.controllers;
import gamzeFirstProject.business.abstracts.InvoiceService;
import gamzeFirstProject.business.requests.CreateInvoiceRequest;
import gamzeFirstProject.business.requests.UpdateInvoiceRequest;
import gamzeFirstProject.business.responses.GetAllInvoicesResponses;
import gamzeFirstProject.business.responses.GetByIdInvoiceResponses;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/invoices")
@AllArgsConstructor
public class InvoicesController {

    private final InvoiceService invoiceService;

    @GetMapping("/{invoiceId}")
    public GetByIdInvoiceResponses getInvoiceById(@PathVariable int invoiceId) {
        return invoiceService.getByIdInvoice(invoiceId);
    }

    @GetMapping
    public List<GetAllInvoicesResponses> getAllInvoices() {
        return invoiceService.getAllInvoice();
    }

    @PostMapping
    @ResponseStatus(code = HttpStatus.CREATED)
    public void addInvoice(@RequestBody() CreateInvoiceRequest createInvoiceRequest) {
       this.invoiceService.addInvoice(createInvoiceRequest);
    }

    @PutMapping
    public void updateInvoice(@RequestBody() UpdateInvoiceRequest updateInvoiceRequest) {
        this.invoiceService.updateInvoice(updateInvoiceRequest);
    }

    @DeleteMapping("/{invoiceId}")
    public void deleteInvoice(@PathVariable int invoiceId) {
        this.invoiceService.deleteInvoice(invoiceId);
    }
}

