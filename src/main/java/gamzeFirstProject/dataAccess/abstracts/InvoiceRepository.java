package gamzeFirstProject.dataAccess.abstracts;

import gamzeFirstProject.entities.concretes.Invoice;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface InvoiceRepository extends JpaRepository<Invoice,Integer> {
//    Invoice getById(int invoiceId);
//    List<Invoice> getAll();
//    void add(Invoice invoice);
//    void update(Invoice invoice);
//    void delete(int invoiceId);
}
