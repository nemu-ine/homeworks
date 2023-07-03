package io.codelex.oop.summary.generics.exercise2;

import java.text.DecimalFormat;
import java.util.List;

public class Invoice {

    private static final double VAT_RATE = 0.21;

    private List<SellableThing> items;
    private String invoiceNumber;
    private InvoiceStatus status;
    private double priceWithoutVAT,  priceWithVAT;

    public Invoice(Order order, String invoiceNumber) {
        if (order.getItems().isEmpty()) {
            throw new WrongOrderException("Cannot create an invoice with an empty order.");
        }
        this.items = order.getItems();
        this.invoiceNumber = invoiceNumber;
        this.status = InvoiceStatus.APPROVED;
        this.priceWithoutVAT = calculatePriceWithoutVAT();
        this.priceWithVAT = calculatePriceWithVAT();
    }

    public void send() {
        status = InvoiceStatus.SENT;
    }

    private double calculatePriceWithoutVAT() {
        return items.stream()
                .mapToDouble(SellableThing::getPrice)
                .sum();
    }

    private double calculatePriceWithVAT() {
        return priceWithoutVAT * (1 + VAT_RATE);
    }

    public String getFormattedInvoice() {
        int maxLen = "===================================================".length();
        DecimalFormat df = new DecimalFormat("0.00");
        StringBuilder sb = new StringBuilder();

        sb.append("===================================================\n");
        sb.append("= INVOICE NUMBER: ").append(invoiceNumber).append("                          =\n");
        sb.append("= STATUS: ").append(status).append("                                =\n");
        for (int i = 0; i < items.size(); i++) {
            sb.append("= ").append(i + 1).append(". ").append(items.get(i).getFullInfo()).append(" ".repeat(maxLen - items.get(i).getFullInfo().length() - 6)).append("=\n");
        }
        sb.append("= SUM: ").append(priceWithoutVAT).append(" EUR                                  =\n");
        sb.append("= VAT (21%): ").append(df.format(priceWithVAT - priceWithoutVAT)).append(" EUR                             =\n");
        sb.append("= TOTAL: ").append(df.format(priceWithVAT)).append(" EUR                                =\n");
        sb.append("===================================================\n");
        return sb.toString();
    }

}
