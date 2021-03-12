package net.cloudburo.drools.model;

import java.util.ArrayList;
import java.util.List;

public class Customer {
    private CustomerLifeStage lifestage;
    private CustomerAssets assets;
    private List<CustomerNeed> customerNeeds = new ArrayList<>();

    private Offer.ProductPackage financialPackage;
    private List<Offer.Product> products = new ArrayList();
    private int discount;

    public Customer() {
        super();
    }

    public void setLifeStage(CustomerLifeStage lifestage) {

        this.lifestage = lifestage;
    }

    public CustomerLifeStage getLifeStage() {

        return lifestage;
    }

    public void addNeed(CustomerNeed need) {

        customerNeeds.add(need);
    }

    public List<CustomerNeed> getNeeds() {
        return customerNeeds;
    }

    public void setAssets(CustomerAssets assets) {
        this.assets = assets;
    }

    public CustomerAssets getAssets() {
        return assets;
    }

    public enum CustomerNeed {
        SAVINGACCOUNT,
        LIFEINSURANCE,
        DIGITALBANKING,
        STUDENTLOAN,
        MORTAGE
    }

    // https://www.peoples-ebank.com/lifestages.html
    public enum CustomerLifeStage {
        GETTINGSTARTED,
        CAREERFOCUSED,
        ADVICEFAMILY,
        EMPTYNESTER,
        GOLDENYEARS,
        BUSINESS
    }

    public enum CustomerAssets {
        TO50K,
        FROM50KTO150K,
        FROM150KTO300K,
        OVER300K
    }


    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }

    public void setFinancialPackage(Offer.ProductPackage financialPackage) {
        this.financialPackage = financialPackage;
    }

    public Offer.ProductPackage getFinancialPackage() {
        return financialPackage;
    }

    public void addSingleProduct(Offer.Product prod) {
        products.add(prod);
    }

    public List<Offer.Product> getProducts() {
        return products;
    }

    public enum Product {
        LOAN,
        SUPERLOAN,
        INSURANCE
    }

    public enum ProductPackage {
        GETTINGSTARTED_PACKAGE,
        CAREERFOCUSED_PACKAGE,
        ADVICEFAMILY_PACKAGE,
        EMPTYNESTER_PACKAGE,
        GOLDENYEARS_PACKAGE,
        BUSINESS_PACKAGE
    }

    public void setProducts(List<Offer.Product> products) {
        this.products = products;
    }

}
