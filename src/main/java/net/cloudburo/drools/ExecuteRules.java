package net.cloudburo.drools;

import net.cloudburo.drools.config.DroolsBeanFactory;
import net.cloudburo.drools.model.Customer;
import net.cloudburo.drools.model.Offer;
import org.kie.api.io.Resource;
import org.kie.api.runtime.KieSession;
import org.kie.internal.io.ResourceFactory;

public class ExecuteRules {

    private static KieSession kSession;

    public static void main(String args[]){

        Resource resource = ResourceFactory.newClassPathResource("net/cloudburo/drools/rules/DroolsDiscount.xlsx");
        kSession = new DroolsBeanFactory().getKieSession(resource);
        //System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/DroolsDiscount.xlsx"));

        System.out.println(new DroolsBeanFactory().getDrlFromExcel("net/cloudburo/drools/rules/BerthDuePricingTable.xlsx"));

        Customer customer = new Customer();
        customer.setLifeStage(Customer.CustomerLifeStage.CAREERFOCUSED);
        customer.setAssets(Customer.CustomerAssets.OVER300K);
        customer.addNeed(Customer.CustomerNeed.LIFEINSURANCE);
        customer.addNeed(Customer.CustomerNeed.SAVINGACCOUNT);
        customer.addNeed(Customer.CustomerNeed.MORTAGE);
        kSession.insert(customer);
        // Now we add the global variable which we use to communicate back our
        Offer offer = new Offer();
        kSession.setGlobal("offer", offer);
        kSession.fireAllRules();

        System.out.println("discount : "+offer.getDiscount());
        System.out.println("Financial package : " + offer.getFinancialPackage());
        System.out.println("Product Size : "+ offer.getProducts().size());

    }
}
