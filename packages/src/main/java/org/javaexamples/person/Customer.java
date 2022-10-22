// Defines the scope/package for this class
package org.javaexamples.person;

// This class can see the other classes in this package
// You don't need to import Employees or Person classes

// Any class in other packages must imported
import java.util.Date;

public class Customer extends Person {
    private int customerId;
    private Date registryId;
    private boolean isVip;

    // Getters and Setters
    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public Date getRegistryId() {
        return registryId;
    }

    public void setRegistryId(Date registryId) {
        this.registryId = registryId;
    }

    public boolean isVip() {
        return isVip;
    }

    public void setVip(boolean vip) {
        isVip = vip;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "customerId=" + customerId +
                ", registryId=" + registryId +
                ", isVip=" + isVip +
                '}';
    }
}
